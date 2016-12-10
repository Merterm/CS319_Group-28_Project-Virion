package gamecomponents;

import java.util.ArrayList;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.1
 * Description: This is the most important object in the game
 *              components package, as it is the core parent
 *              class of all the objects. It has 5 properties
 *              which define the core aspects of the object.
 *              It also has iconID property, but each object
 *              has its own defined in their own classes. It
 *              has 4 constructors, and getter/setter methods.
 */

public abstract class GameObject
{
    //************************************************
    //  Class Attributes
    //************************************************
    private int positionX;
    private int positionY;
    private int id;
    private int radius;

    //*************************************************
    //  Constructors
    //*************************************************
    /**
     * Full constructor of GameObject
     * @param positionX is the X coordinate of the gameObject
     * @param positionY is the Y coordinate inside the canvas
     *                  of the GameObject
     * @param id is the object id assigned by the controller
     * @param radius is the radius of the icon for collision
     *               checking.
     */
    public GameObject(int positionX, int positionY, int id, int radius) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.id = id;
        this.radius = radius;
    }

    /**
     * GameObject constructor without radius variable
     * initialized.
     * @param positionX is the X coordinate of the gameObject
     * @param positionY is the Y coordinate inside the canvas
     *                  of the GameObject
     * @param id is the object id assigned by the controller
     */
    public GameObject(int positionX, int positionY, int id) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.id = id;
    }

    /**
     * GameObject constructor only with id as a parameter.
     * @param id is the integer value given by the gameEngine
     */
    public GameObject(int id) {
        this.id = id;
    }

    /**
     * Default constructor: Initializes all of the variables to 0
     */
    public GameObject()
    {
        this.positionX = 0;
        this.positionY = 0;
        this.id = 0;
        this.radius = 0;
    }

    /**
     *
     * @return
     */
    public boolean destroy() {
        // TODO Implementation of the method
        return false;
    }

    //*************************************************
    // Getter/Setter Methods
    //*************************************************

    /**
     *
     * @return
     */
    public ArrayList<Integer> getPosition() {
        ArrayList<Integer> position = new ArrayList<Integer>(2);
        position.add(positionX);
        position.add(positionY);

        return position;
    }

    /**
     *
     * @param positionX
     * @param positionY
     */
    public void goToPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public int getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    //*************************************************
    // Abstract Methods
    //*************************************************

    /**
     * Abstract method that needs to be implemented for
     * getting the iconID property which is specific to
     * each element
     * @return returns iconID as int
     */
    public abstract int getIconID();

    /**
     * Abstract method that needs to be implemented for
     * assigning the iconID property which is specific to
     * each element.
     * @param iconID is the integer value.
     */
    public abstract void setIconID(int iconID);
}

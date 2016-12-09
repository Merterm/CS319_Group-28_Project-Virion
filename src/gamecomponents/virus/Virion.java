package gamecomponents.virus;

import java.util.ArrayList;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */

public class Virion extends Virus{
    //Class Attributes
    private int positionX = 0;
    private int positionY = 0;
    private int iconID = 0;
    private int id = 0;
    private int radius = 0;
    private int virusTypeCoefficient = 1;

    //Methods
    public boolean isAttached() {
        // TODO Implementation of the method
        return false;
    }

    public int getVirusTypeCoefficient() {
        return virusTypeCoefficient;
    }

    public void setVirusTypeCoefficient(int virusTypeCoefficient) {
        this.virusTypeCoefficient = virusTypeCoefficient;
    }

    public boolean destroy() {
        // TODO Implementation of the method
        return false;
    }

    public ArrayList<Integer> getPosition() {
        ArrayList<Integer> position = new ArrayList<Integer>(2);
        position.add(positionX);
        position.add(positionY);

        return position;
    }

    public void goToPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

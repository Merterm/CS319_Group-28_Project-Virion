package gamecomponents.protein;

import java.util.ArrayList;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */

public class Receptor extends Protein{
    //Attributes
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
        super.positionX = positionX;
        super.positionY = positionY;
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

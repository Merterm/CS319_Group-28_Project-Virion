package gamecomponents.virus;

import gamecomponents.GameObject;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Ulugbek
 * Version: 1.0
 * Description:
 */
public class ViralDNA extends GameObject {

    /**
     * attributes
     */
    protected boolean isInside = false;
    protected int speed, lifetime, virusTypeCoefficient, positionX, positionY;

    /**
     * Constructor
     * @param x
     * @param y
     * @param isInside
     * @param speed
     * @param lifetime
     * @param virusTypeCoefficient
     */
    public ViralDNA(int x, int y, boolean isInside, int speed, int lifetime, int virusTypeCoefficient)
    {
        this.positionX = x;
        this.positionY =y;
        this.isInside = isInside;
        this.speed = speed;
        this.lifetime = lifetime;
        this.virusTypeCoefficient = virusTypeCoefficient;
    }

    /**
     * getters and setter
     * @return
     */
    public int getPositionX()
    {
        return positionX;
    }
    public void setPositionX(int x)
    {
        this.positionX = x;
    }

    public int getPositionY()
    {
        return positionY;
    }

    public void setPositionY(int y)
    {
        this.positionX = y;
    }

    public int getVirusTypeCoefficient()
    {
        return virusTypeCoefficient;
    }

    public void setVirusTypeCoefficient(int v)
    {
        virusTypeCoefficient = v;
    }

    public int getSpeed() {
        return speed;
    }

    public void setInside(boolean inside) {
        isInside = inside;
    }
    public boolean isItInside()
    {
        return isInside;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public int getIconID() {
        return 0;
    }

    public void setIconID(int iconID) {

    }
}

package gamecomponents.virus;

import gamecomponents.GameObject;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class ViralDNA extends GameObject {
    protected boolean isInside = false;
    protected int speed, lifetime, virusTypeCoefficient, positionX, positionY;

    public ViralDNA(int x, int y, boolean isInside, int speed, int lifetime, int virusTypeCoefficient)
    {
        this.positionX = x;
        this.positionY =y;
        this.isInside = isInside;
        this.speed = speed;
        this.lifetime = lifetime;
        this.virusTypeCoefficient = virusTypeCoefficient;
    }
    public int getPositionX()
    {
        return positionX;
    }
    public int getPositionY()
    {
        return positionY;
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

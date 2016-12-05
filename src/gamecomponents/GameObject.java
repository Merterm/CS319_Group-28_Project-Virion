package gamecomponents;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class GameObject {
    protected int PositionX, PositionY;

    public void setPositionX(int x)
    {
        PositionX = x;
    }

    public int getPositionX() {
        return PositionX;
    }

    public void setPositionY(int positionY) {
        PositionY = positionY;
    }

    public int getPositionY() {
        return PositionY;
    }

    public boolean destroy()
    {
        this.destroy();
        return true;
    }
}

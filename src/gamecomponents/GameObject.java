package gamecomponents;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public abstract class GameObject
{
    public GameObject()
    {

    }

    protected int positionX, positionY, radius;

    public void setPositionX(int positionX)
    {
        /*PositionX = x;*/
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionY(int positionY) {
        positionY = positionY;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean goToPosition(int x,int y)
    {
        this.setPositionY(y+radius);        //for now
        this.setPositionX(x+radius);
        return true; //for now
    }

    public boolean destroy()
    {
        this.destroy();
        return true;
    }
}

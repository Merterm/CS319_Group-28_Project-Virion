package gamecomponents;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class GameObject
{
    public GameObject()
    {

    }

    protected int PositionX, PositionY, radius;

    public void setPositionX(int positionX)
    {
        /*PositionX = x;*/
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

    public boolean goToPostion(int x,int y)
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

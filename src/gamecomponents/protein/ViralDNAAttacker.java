package gamecomponents.protein;

import gamecomponents.virus.ViralDNA;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class ViralDNAAttacker extends Protein
{

    private int iconID, positionX,positionY;
    public ViralDNAAttacker(int x, int y)
    {
        positionX = x;
        positionY = y;
    }
    public int getPositionX()
    {
        return positionX;
    }
    public int getPositionY()
    {
        return positionY;
    }
    public void setIconID(int id)
    {
        iconID = id;
    }
    public int getIconID()
    {
        return iconID;
    }
}

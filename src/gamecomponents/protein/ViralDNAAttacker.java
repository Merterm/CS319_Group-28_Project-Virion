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
    private int[] pos;
    public ViralDNAAttacker(int x, int y)
    {
        pos = new int[2];
        positionX = x;
        positionY = y;
        pos[0] = positionX;
        pos[1] = positionY;
    }
    public int getPositionX()
    {
        return pos[0];
    }
    public int getPositionY()
    {
        return pos[1];
    }
    public void setIconID(int id)
    {
        iconID = id;
    }
    public int getIconID()
    {
        return iconID;
    }

    public void goToPosition(int positionX, int positionY) {
        pos[0] = positionX;
        pos[1] = positionY;
    }
}

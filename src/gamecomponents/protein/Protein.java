package gamecomponents.protein;

import gamecomponents.GameObject;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class Protein extends GameObject
{
    protected int extraCM;

    public int getExtraCM()
    {
        return extraCM;
    }

    public void setExtraCM(int extraCM) {
        this.extraCM = extraCM;
    }
}

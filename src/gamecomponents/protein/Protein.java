package gamecomponents.protein;

import gamecomponents.GameObject;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */

public abstract class Protein extends GameObject
{
    //Lifetime is missing!
    //Attributes
    private int extraCM = 0;
    private int proteinTypeCoefficient = 0;

    public void setProteinTypeCoefficient(int proteinTypeCoefficient) {
        this.proteinTypeCoefficient = proteinTypeCoefficient;
    }

    //Methods
    public int getProteinTypeCoefficient() {
        return proteinTypeCoefficient;
    }
    public int getExtraCM()
    {
        return extraCM;
    }

    public void setExtraCM(int extraCM) {
        this.extraCM = extraCM;
    }
}

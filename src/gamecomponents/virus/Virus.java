package gamecomponents.virus;

import gamecomponents.GameObject;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public abstract class Virus extends GameObject
{
    protected int virusTypeCoefficient;
    protected ViralDNA viralDNA = new ViralDNA(false, 1,3,5);



    public ViralDNA getViralDNA()
    {
        return viralDNA;
    }

}

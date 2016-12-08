package gamecomponents.organelle;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class Vacuole extends Organelle
{
    protected int cm;

    public int getCm()
    {
        return cm;
    }

    public void setCm(int cm1)
    {
        cm = cm1;
    }

    public boolean isCMEnough(int requiredCM)
    {
        if(requiredCM <= cm)
            return true;
        return false;
    }
}

package gamecomponents.organelle;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class Mitochondria
{
    protected int ATP;

    public int getATP() {
        return ATP;
    }

    public void setATP(int ATP) {
        this.ATP = ATP;
    }

    public boolean isATPEnough(int requiredATP)
    {
        if(requiredATP <= ATP)
            return true;
        return false;
    }

}

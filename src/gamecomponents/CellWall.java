package gamecomponents;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class CellWall
{
    //created time variable is important when checking if it's active
    int duration, extraCM, createdTime; //TODO duration java class
    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getExtraCM() {
        return extraCM;
    }

    public void setExtraCM(int extraCM) {
        this.extraCM = extraCM;
    }

    public int getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(int createdTime) {
        this.createdTime = createdTime;
    }
}

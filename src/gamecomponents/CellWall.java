package gamecomponents;

import java.time.Duration;
import java.time.Instant;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Ulugbek Irmatov
 * Version: 1.0
 * Description:
 */
public class CellWall
{
    /**IMPORTANT!!! This is how Duration object can be used.
     * Instant first = Instant.now();
     / wait some time while something happens
     Instant second = Instant.now();
     Duration duration = Duration.between(first, second);
     methods--- plusSeconds(), minusSeconds()
     */

    //*************************************************
    //  Class Attributes
    //*************************************************
    private int extraCM;
    private Instant createdTime;
    private Duration duration;


    public CellWall(int extraCM,Instant now, long duration)           /* end = now.plusSeconds(some time) */
    {
        extraCM = 0;
        createdTime = now;
        this.duration = Duration.ofSeconds(duration);
    }

    public Duration getDuration()
    {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public int getExtraCM() {
        return extraCM;
    }

    public void setExtraCM(int extraCM) {
        this.extraCM = extraCM;
    }

    public Instant getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Instant createdTime) {
        this.createdTime = createdTime;
    }
}

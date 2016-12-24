package gamemanagement;

import gamecomponents.CellWall;
import gamecomponents.GameObject;
import gamecomponents.protein.Protein;
import gamecomponents.virus.ViralDNA;


import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.Vector;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Ulugbek Irmatov
 * Version: 1.0
 * Description:
 */
public class CellController
{
    /**
     * constructor
     */
    public CellController()
    {
        //...
    }

    /**
     * needs to modified or deleted
     * @param object
     */
    public void create(GameObject object)
    {
       object = new GameObject() {
           @Override
           public int getIconID() {
               return 0;
           }

           @Override
           public void setIconID(int iconID) {

           }
       };

    }



    /**
     *
     * @param currentCapacity
     * @return
     */
    public boolean isViralDNACapacityReached(int currentCapacity, int cellCapacity)
    {
        if(currentCapacity == cellCapacity)
            return true;
        return false;
    }

    /**
     * returns true if cellWall is active and false otherwise
     * @param cw
     * @return
     */
    public boolean isCellWallActive(CellWall cw)
    {
        Duration duration = cw.getDuration();
        boolean active = true;

        Instant createdTime = cw.getCreatedTime();
        Instant currentTime = Instant.now();
        Duration duration2 = Duration.between(createdTime, currentTime);


        if(duration2.getSeconds() >= duration.getSeconds())
            active = false;
        return active;
    }

    /**
     *
     * @param proteinType
     * @return
     */
    public int calculateRequiredCM(Protein proteinType)
    {
        int extraCm = 1000*proteinType.getProteinTypeCoefficient();
        return extraCm;
    }



    /**
     *
     * @param objects
     * @param v
     */
    public void attackVirus(Vector<GameObject> objects, ViralDNA v)
    {
        int x = v.getPositionX();
        int y = v.getPositionY();

        for (int i= 0; i < objects.size(); i++)
        {
            if(objects.get(i)instanceof Protein)
            {
                objects.get(i).goToPosition(x,y);
            }
        }
    }

}

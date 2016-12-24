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
    private int viralDNACapacity = 0;

    public CellController()
    {

    }
    /**
     *
     * @param currentCapacity
     * @return
     */
    public boolean isViralDNACapacityReached(int currentCapacity)
    {
        if(currentCapacity == viralDNACapacity)
            return true;
        return false;
    }

    /**
     *
     * @param cw
     * @return
     */
    public boolean isCellWallActive(CellWall cw)
    {
        Duration duration = cw.getDuration();

        Instant createdTime = cw.getCreatedTime();
        Instant currentTime = Instant.now();
        Duration duration2 = Duration.between(createdTime, currentTime);

        boolean active = duration.equals(duration2);

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

    public void create(GameObject object)
    {
       //object = new GameObject();
    }

    public  void  stopReconstruction()
    {
        //todo to be implemented
    }

    public void sendFinder(int id)
    {
        //todo to be implemented
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

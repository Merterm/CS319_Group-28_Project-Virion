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

    public void attackVirus(Vector<GameObject> objects, int viralID)
    {
        int x =0,y=0;
        Iterator i = objects.iterator();
        while(i.hasNext())
        {
            if(i.next()instanceof ViralDNA)
            {
                ViralDNA toBeAttacked = (ViralDNA)i.next();
                x = toBeAttacked.getPosition().get(0);
                y = toBeAttacked.getPosition().get(1);
            }

        }
        Iterator j = objects.iterator();
        while(j.hasNext())
        {
            if(j.next()instanceof Protein)
            {
                Protein p = (Protein) j.next();
                p.goToPosition(x,y);
            }
        }
    }
    /*
    public void getMegaOut(id)
    public void randomizeDNALocation()
    public void checkRibosomes() //full or not
    public boolean isAntibodyPresent() */

}

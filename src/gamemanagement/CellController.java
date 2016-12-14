package gamemanagement;

import gamecomponents.CellWall;
import gamecomponents.GameObject;
import gamecomponents.protein.Protein;
import gamecomponents.virus.ViralDNA;


import java.util.Iterator;
import java.util.Vector;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class CellController
{
    private int viralDNACapacity = 0;

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

    /*added cellWall object as param*/
    public boolean isCellWallActive(CellWall cw)
    {
        int duration = cw.getDuration();
        /*
        int test = currentTime - cw.getCreatedTime();           this could be a way
        if(test>=duration)
            return false;*/
        return true;
    }

    public int calculateRequiredCM(Protein proteinType)
    {
        return proteinType.getExtraCM();    //todo                //do we need this method?? why not just call getextraCM() of protein?
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

    public void attackVirus(Vector<Protein> proteins, int viralID)
    {
        //todo when the list of objects in GameEngine is available
        /*
        ViralDNA toBeAttacked = viralDNAList.get(viralID);
        int x = toBeAttacked.getPositionX();
        int y = toBeAttacked.getPositionY();
        Iterator i = proteins.iterator();
        while(i.hasNext())
        {
            Protein p = (Protein) i.next();
            p.goToPostion(x,y);
        }*/
    }
    /*
    public void getMegaOut(id)
    public void randomizeDNALocation()
    public void checkRibosomes() //full or not
    public boolean isAntibodyPresent() */

}

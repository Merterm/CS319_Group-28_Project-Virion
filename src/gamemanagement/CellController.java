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

    /*changed from virus to viralDNA & added parameter*/
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
        return proteinType.getExtraCM();                    //do we need this method?? why not just call getextraCM() of protein?
    }

    public void create(GameObject object)
    {
       // object = new GameObject();                          //move this to gameEngine? should work since virus,etc. inherit?
    }

    public  void  stopReconstruction()
    {
        //to be implemented
    }

    public void sendFinder(int id)
    {
        //to be implemented
    }

    public void attackVirus(Vector<Protein> proteins, int viralID)
    {
        /*ViralDNA toBeAttacked = viralDNAList.get(viralID);
        int x = toBeAttacked.getPositionX();
        int y = toBeAttacked.getPositionY();
        Iterator i = proteins.iterator();
        while(i.hasNext())
        {
            Protein p = (Protein) i.next();                             //casted to Protein
            p.goToPostion(x,y);
        }*/
    }
    /*
    public void getMegaOut(id)
    public void randomizeDNALocation()
    public void checkRibosomes()
    public boolean isAntibodyPresent() */

}

package gamemanagement;

import gamecomponents.virus.Complex;
import gamecomponents.virus.ViralDNA;
import gamecomponents.virus.Virus;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class VirusController
{
    public void createViralDNA(Virus virus, int[] postion)
    {
        ViralDNA viralDNA = virus.getViralDNA();

        //viralDNA.setPositionX(postion[0]);
        //viralDNA.setPositionY(postion[1]);

        virus.destroy();

    }

    public int calculateVirusFrequency(int time)
    {
        //currently have no idea
        return 1;
    }

    public Virus calculateVirusType()
    {
        //don't know about this either
        Virus v = new Complex();
        return  v;
    }

    public int[] getVirusPosition(int id)
    {
        //Virus v = virusList.get(id);        /* here's sth is wrong, doesn't recognize virusList */
        int[] list = new int[2];
        //list[0] = v.getPositionX();
        //list[1] = v.getPositionY();
        return list;
    }

    public boolean areAllDNAsFound()
    {
        return true;    //for now ;)
    }


}

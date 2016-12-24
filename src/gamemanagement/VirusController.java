package gamemanagement;

import gamecomponents.GameObject;
import gamecomponents.virus.ViralDNA;
import gamecomponents.virus.Virus;

import java.util.ArrayList;
import java.util.Vector;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Ulugbek Irmatov
 * Version: 1.0
 * Description:
 */
public class VirusController
{

    public VirusController(){}

    /**
     *
     * @param virus
     * @param postion
     */
    public void createViralDNA(Virus virus, int[] postion)
    {
        ViralDNA viralDNA = virus.getViralDNA();

        viralDNA.setPositionX(postion[0]);
        viralDNA.setPositionY(postion[1]);

        virus.destroy();
    }

    /**
     *
     * @param t
     * @return
     */
    public int calculateVirusFrequency(int t)
    {
        int frequency = 16*t^2+t+16;
        return frequency;
    }

    /**
     *
     * @param id
     * @param objects
     * @return
     */
    public  ArrayList<Integer> getVirusPosition(int id, Vector<GameObject> objects)
    {
        ArrayList<Integer> list = new ArrayList<>(1);
        for(int i = 0; i < objects.size() ; i++)
        {
            if( (objects.get(i) instanceof Virus) && (objects.get(i).getID() == id) )
            {
                Virus v = (Virus)objects.get(i);
                list  = v.getPosition();
            }
        }
        return list;
    }

}

package gamemanagement;

import gamecomponents.protein.Protein;
import gamecomponents.virus.ViralDNA;
import gamecomponents.virus.Virus;

import java.util.Vector;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class GameEngine
{
    /*NOTE: there are separate lists(vector) for viruses,proteins,etc.
     * ID of an object can be index of the list */

    protected int viralDNACapacity = 100;   //for now 100
    //number of objects are not know at the start -> vectors are dynamic
    protected Vector<Virus> virusList;

    {
        virusList = new Vector<Virus>(2, 2);
    }

    protected Vector<ViralDNA> viralDNAList;

    {
        viralDNAList = new Vector<ViralDNA>(2,2);
    }

    protected Vector<Protein> proteinList;

    {
        proteinList = new Vector<Protein>(2,2);
    }

}

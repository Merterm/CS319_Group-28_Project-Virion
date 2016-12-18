package gamemanagement;

import gamecomponents.protein.Protein;
import gamecomponents.virus.ViralDNA;
import gamecomponents.virus.Virus;

import java.util.Timer;
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
    //todo hash hashmap hashtable map dict
    private int score;
    private int time;
    private int cmCount;
    private int atpCount;

    protected int viralDNACapacity = 100;   //for now 100
    //number of objects are not know at the start -> vectors are dynamic
    private Vector<Virus> virusList;

    {
        virusList = new Vector<Virus>(2, 2);
    }

    private Vector<ViralDNA> viralDNAList;

    {
        viralDNAList = new Vector<ViralDNA>(2,2);
    }

    private Vector<Protein> proteinList;

    {
        proteinList = new Vector<Protein>(2,2);
    }

    //methods
    public void increaseATP(){
        for(int i = 0; i>=0; i++) {
            try {
                //sending the actual Thread of execution to sleep 3600 milliseconds
                Thread.sleep(3600);
            } catch(InterruptedException ie) {}
            this.atpCount=this.atpCount + 1000;
        }
    }
    public void increaseCM(){
        for(int i = 0; i>=0; i++) {
            try {
                //sending the actual Thread of execution to sleep 3600 milliseconds
                Thread.sleep(3600);
            } catch(InterruptedException ie) {}
            this.cmCount=this.cmCount + 1000;
        }
    }
    public int calculateDenaturationTime(int virusID,int proteinID){
        int result = 0;
        for(int i = 0; i<proteinList.size();i++){
            if(proteinList.get(i).getProteinTypeCoefficient()==proteinID)
                result= 90* proteinList.get(i).getProteinTypeCoefficient();
        }
        for(int i = 0; i<virusList.size();i++){
            if(virusList.get(i).getVirusTypeCoefficient()==virusID)
                result=result-virusList.get(i).getVirusTypeCoefficient();
        }
        return result;
    }


}

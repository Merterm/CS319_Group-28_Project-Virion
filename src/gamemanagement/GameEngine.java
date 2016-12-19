package gamemanagement;

import gamecomponents.GameObject;
import gamecomponents.protein.Protein;
import gamecomponents.virus.ViralDNA;
import gamecomponents.virus.Virus;

import java.util.ArrayList;
import java.util.Iterator;
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
    //todo hash hashmap hashtable map dict
    private int score;
    private int time;
    private int cmCount;
    private int atpCount;

    protected int viralDNACapacity = 100;   //for now 100

    private Vector<GameObject> ObjectList = new Vector<GameObject>(2,2);


    //methods

    /**
     *
     */
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

    /**
     *
     * @param virusID
     * @param proteinID
     * @return
     */
    public int calculateDenaturationTime(int virusID,int proteinID){
        int result = 0;
        /*for(int i = 0; i<proteinList.size();i++){
            if(proteinList.get(i).getProteinTypeCoefficient()==proteinID)
                result= 90* proteinList.get(i).getProteinTypeCoefficient();
        }
        for(int i = 0; i<virusList.size();i++){
            if(virusList.get(i).getVirusTypeCoefficient()==virusID)
                result=result-virusList.get(i).getVirusTypeCoefficient();
        }*/
        return result;
    }

    public void updateScore()
    {

    }

    public void calculateFinalScore()
    {

    }

    /**
     * calculates protein production time
     * @param proteinType
     * @return
     */
    public int calculateProteinProductionTime(Protein proteinType)
    {
        return (10*proteinType.getProteinTypeCoefficient());
    }

    /**
     * Method gets virus location and tells proteins to go to that location
     * @param objList
     * @param v
     */
    public void calculateMeetingPosition(Vector<GameObject> objList, Virus v)
    {
        ArrayList<Integer> pos = v.getPosition();
        int i = 0;
        while(i < objList.size())
        {
            objList.get(i).goToPosition(pos.get(1), pos.get(2));
        }
    }
}

package gamemanagement;

import gamecomponents.Cell;
import gamecomponents.GameObject;
import gamecomponents.organelle.*;
import gamecomponents.protein.Protein;
import gamecomponents.virus.Complex;
import gamecomponents.virus.ViralDNA;
import gamecomponents.virus.Virus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.Vector;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN Uluğbek Irmatov Irmak Yılmaz on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class GameEngine
{
    private int score=0;
    private int time=0;
    private int cmCount=10000;
    private int atpCount=1000;
    private boolean paused;
    static final int updatesPerSecond = 4;
    static final long updatePeriod = 1000000000L/updatesPerSecond;
    protected int viralDNACapacity = 100;   //for now 100

    private Vector<GameObject> ObjectList = new Vector<GameObject>(2,2);

    //Constructor
    public GameEngine() {
    }

    //methods

    public void start() {
        initialize();
        //gameLoop();
        Thread gameThread = new Thread()
        {
            @Override
            public void run()
            {
                gameLoop();
            }
        };
    }

    private void initialize() {
        Cell cell = new Cell(viralDNACapacity,0);
        Golgi golgi = new Golgi();
        Mitochondria mitochondria = new Mitochondria();
        Nucleus nucleus = new Nucleus();
        Ribosome ribosome = new Ribosome();
        Vacuole vacuole = new Vacuole();

        Complex complex1 = new Complex();
        Complex complex2 = new Complex();

        //UIController.createComponent(id);
        //UIController

    }

    private void gameLoop() {
        long beginTime, timeTaken, timeLeft;
        beginTime = System.nanoTime();
        while (!paused) {
            processInput();
            update();
            render();
        }
        //repaint();
        timeTaken = System.nanoTime() - beginTime;
        timeLeft = (updatePeriod - timeTaken)/1000000;
        if(timeLeft < 10)
            timeLeft = 10;
        try
        {
            Thread.sleep(timeLeft);
        }catch (InterruptedException ex){}
    }

    private void processInput() {}

    private void update()
    {

    }

    private void render() {}

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
    public int calculateDenaturationTime(int virusID,int proteinID) {
        int result1 = 0;
        int result2 = 0;
        int result = 0;
        for (int i = 0; i < ObjectList.size(); i++) {
            if (ObjectList.get(i) instanceof Protein) {
                Protein p = (Protein) ObjectList.get(i);
                if (p.getIconID() == proteinID)
                    result1 = p.getProteinTypeCoefficient();
            }
            if (ObjectList.get(i) instanceof Virus) {
                Virus v = (Virus) ObjectList.get(i);
                if (v.getIconID() == virusID)
                    result2 = v.getVirusTypeCoefficient();
            }
        }
        result = 90 * result1 - result2;
        return result;
    }

    public int calculateDurability(int virusID, int proteinID){
        int result1 = 0;
        int result2 = 0;
        int result = 0;
        for (int i = 0; i < ObjectList.size(); i++) {
            if (ObjectList.get(i) instanceof Protein) {
                Protein p = (Protein) ObjectList.get(i);
                if (p.getIconID() == proteinID)
                    result1 = p.getProteinTypeCoefficient();
            }
            if (ObjectList.get(i) instanceof Virus) {
                Virus v = (Virus) ObjectList.get(i);
                if (v.getIconID() == virusID)
                    result2 = v.getVirusTypeCoefficient();
            }
        }
        //will be changed according to the stage of infection
        result= 5*result2 - result1;
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

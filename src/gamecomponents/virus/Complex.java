package gamecomponents.virus;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert &#x130;NAN, created on 5.12.2016.
 * Version: 1.2
 * Description: This class is the model class for the complex
 *              virus object. It extends Virus abstract class.
 *              All of its attributes and methods are coming from
 *              its parent classes except iconID and virusTypeCoefficient.
 */

public class Complex extends Virus{
    //*************************************************
    //  Class Attributes
    //*************************************************
    private int iconID, positionX, positionY;
    private int virusTypeCoefficient;

    //*************************************************
    //  Constructors
    //*************************************************
    /**
     *
     * @param iconID
     * @param virusTypeCoefficient
     */
    public Complex(int positionX, int positionY,int id, int iconID, int virusTypeCoefficient) {
        super(id);
        this.positionX = positionX;
        this.positionY = positionY;
        this.iconID = iconID;
        this.virusTypeCoefficient = virusTypeCoefficient;
    }

    /**
     *
     */
    public Complex() {
        super();
        this.iconID = 0;
        this.virusTypeCoefficient = 1;
    }

    //*************************************************
    //  Getter/Setter Methods
    //*************************************************
    public ArrayList<Integer>  getPosition()
    {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(0, this.positionX);
        list.add(1,this.positionY);
        return list;
    }
    @Override
    public int getIconID() {
        return iconID;
    }

    @Override
    public void setIconID(int iconID) {
        this.iconID = iconID;
    }

    @Override
    public int getVirusTypeCoefficient() {
        return virusTypeCoefficient;
    }

    @Override
    public void setVirusTypeCoefficient(int virusTypeCoefficient) {
        this.virusTypeCoefficient = virusTypeCoefficient;
    }
}

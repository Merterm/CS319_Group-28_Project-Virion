package gamecomponents.protein;


import java.time.Duration;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */

public class Receptor extends Protein{
    //*************************************************
    //  Class Attributes
    //*************************************************
    private Duration lifetime;
    private int iconID;
    private int proteinTypeCoefficient;

    //*************************************************
    //  Constructors
    //*************************************************
    /**
     *
     * @param iconID
     * @param proteinTypeCoefficient
     */
    public Receptor(int id, int iconID, int proteinTypeCoefficient) {
        //super(id);
        this.iconID = iconID;
        this.proteinTypeCoefficient = proteinTypeCoefficient;
    }

    /**
     *
     */
    public Receptor() {
        super();
        this.iconID = 0;
        this.proteinTypeCoefficient = 1;
    }

    //*************************************************
    //  Getter/Setter Methods
    //*************************************************
    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }

}

package gamecomponents.virus;

import java.util.ArrayList;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */

public class Polyhedral extends Virus {
    //*************************************************
    //  Class Attributes
    //*************************************************
    private int iconID;
    private int virusTypeCoefficient;

    //*************************************************
    //  Constructors
    //*************************************************
    /**
     *
     * @param iconID
     * @param virusTypeCoefficient
     */
    public Polyhedral(int id, int iconID, int virusTypeCoefficient) {
        super(id);
        this.iconID = iconID;
        this.virusTypeCoefficient = virusTypeCoefficient;
    }

    /**
     *
     */
    public Polyhedral() {
        super();
        this.iconID = 0;
        this.virusTypeCoefficient = 1;
    }

    //*************************************************
    //  Getter/Setter Methods
    //*************************************************
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

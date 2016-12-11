package gamecomponents.virus;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class Spherical extends Virus{
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
    public Spherical(int id, int iconID, int virusTypeCoefficient) {
        super(id);
        this.iconID = iconID;
        this.virusTypeCoefficient = virusTypeCoefficient;
    }

    /**
     *
     */
    public Spherical() {
        super();
        this.iconID = 0; //TODO implement the actual id.
        this.virusTypeCoefficient = 3;
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

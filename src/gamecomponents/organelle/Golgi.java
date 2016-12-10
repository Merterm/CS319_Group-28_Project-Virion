package gamecomponents.organelle;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN created on 5.12.2016.
 * Version: 1.0
 * Description: This is the Golgi class which is an Organelle.
 *              The only extra property that this class has is
 *              iconID, which is an obligatory variable becuase
 *              Golgi is a GameObject.
 */
public class Golgi extends Organelle{
    //*************************************************
    //  Class Attributes
    //*************************************************
    private int iconID;

    //*************************************************
    //  Constructors
    //*************************************************
    /**
     *
     * @param iconID
     */
    public Golgi(int iconID) {
        this.iconID = iconID;
    }

    /**
     *
     */
    public Golgi() {
        super();
        this.iconID = 0; //TODO Write the actual iconID
    }

    //*************************************************
    //  Methods
    //*************************************************
    /**
     *
     * @return
     */
    public int getIconID() {
        return iconID;
    }

    /**
     *
     * @param iconID
     */
    public void setIconID(int iconID) {
        this.iconID = iconID;
    }
}

package gamecomponents.virus;

import gamecomponents.GameObject;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Irmak Yılmaz on 5.12.2016.
 * Version: 1.2
 * Description: This class is the abstract class for all virus
 *              types. It contains viralDNA as a property. It
 *              also has virusTypeCoefficient but it is implemented
 *              in non-abstract classes. Hence, the get and set
 *              methods for it are abstract.
 */
public abstract class Virus extends GameObject {
    //*************************************************
    //  Class Attributes
    //*************************************************
    private ViralDNA viralDNA;

    //*************************************************
    //  Constructors
    //*************************************************
    /**
     *
     * @param positionX
     * @param positionY
     * @param id
     * @param radius
     * @param viralDNA
     */
    public Virus(int positionX, int positionY, int id, int radius, ViralDNA viralDNA) {
        super(positionX, positionY, id, radius);
        this.viralDNA = viralDNA;
    }

    /**
     *
     * @param id
     */
    public Virus(int id) {
        super(id);
    }

    /**
     *
     */
    public Virus() {
        super();
        //viralDNA = new ViralDNA();
    }

    public abstract int getVirusTypeCoefficient();

    public abstract void setVirusTypeCoefficient(int virusTypeCoefficient);

    public ViralDNA getViralDNA()
    {
        return viralDNA;
    }

}

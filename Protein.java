/**
 * Created by irmak.yilmaz-ug on 06.12.2016.
 */

public class Protein extends GameObject{
    //variables
    int extraCM;
    int lifetime;
    int coefficient;

    public Protein(int extraCM, int lifetime, int coefficient) {
        this.extraCM = extraCM;
        this.lifetime = lifetime;
        this.coefficient = coefficient;
    }

    //getter and setters
    public int getExtraCM() {
        return extraCM;
    }
    public void setExtraCM(int extraCM) {
        this.extraCM = extraCM;
    }
    public int getLifetime() {
        return lifetime;
    }
    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
    public int getCoefficient() {
        return coefficient;
    }
    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
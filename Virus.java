/**
 * Created by irmak.yilmaz-ug on 06.12.2016.
 */
public class Virus extends GameObject {
    //variables
    int virusTypeCoefficient;

    public Virus(int virusTypeCoefficient) {
        this.virusTypeCoefficient = virusTypeCoefficient;
    }

    //getter and setter
    public int getVirusTypeCoefficient() {
        return virusTypeCoefficient;
    }
    public void setVirusTypeCoefficient(int virusTypeCoefficient) {
        this.virusTypeCoefficient = virusTypeCoefficient;
    }

    //methods ????
    public boolean isAttached(){
        if(this.getPositionX()>= cellWall.getPositionX() && this.getPositionY()>= cellWall.getPositionY() )
            return true;
        else
            return false;
    }
}

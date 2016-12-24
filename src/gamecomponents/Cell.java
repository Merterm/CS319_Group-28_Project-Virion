/**
 * Created by Irmak Yılmaz on 06.12.2016. Cell class
 */
package gamecomponents;
public class Cell extends GameObject{
    //variables
    private int iconID;
    private int virusCapacity;
    private int virusCount;

    public Cell(int virusCapacity, int virusCount) {
        this.virusCapacity = virusCapacity;
        this.virusCount = virusCount;
    }

    public Cell() {
        this.virusCapacity=0;
        this.virusCount=0;
    }


    //getter and setters
    public int getVirusCapacity() {
        return virusCapacity;
    }
    public void setVirusCapacity(int virusCapacity) {
        this.virusCapacity = virusCapacity;
    }
    public int getVirusCount() {
        return virusCount;
    }
    public void setVirusCount(int virusCount) {
        this.virusCount = virusCount;
    }
    //methods
    public void incrementVirusCount(){
        this.setVirusCount(this.getVirusCount()+1);
    }

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID=iconID;

    }
}

/**
 * Created by irmak.yilmaz-ug on 06.12.2016.
 */
package gamecomponents;
public class Cell extends GameObject{
    //variables
    int virusCapacity;
    int virusCount;

    public Cell(int virusCapacity, int virusCount) {
        this.virusCapacity = virusCapacity;
        this.virusCount = virusCount;
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

}

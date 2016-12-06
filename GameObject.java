/**
 * Created by irmak.yilmaz-ug on 06.12.2016.
 */
public class GameObject {
    //variables
    int positionX;
    int positionY;
    int ID;
    int iconID;
    int radius;

    public GameObject(int positionX, int positionY, int ID, int iconID, int radius) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.ID = ID;
        this.iconID = iconID;
        this.radius = radius;
    }

    //getter and setters
    public int getPositionX() {
        return positionX;
    }
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getIconID() {
        return iconID;
    }
    public void setIconID(int iconID) {
        this.iconID = iconID;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    //methods
    public boolean destroy(){
        delete GameObject(this.getPositionX(),this.getPositionY(),this.getID(),this.getIconID(),this.getRadius());
        return true;
    }

    //CHANGE IN THE METHOD ADDED PARAMETERS
    public boolean goToPosition(int x,int y){
        this.setPositionX(x);
        this.setPositionY(y);
    }
}

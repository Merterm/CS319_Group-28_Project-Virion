package gamemanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class IconManager {
    public Image getPhoto(int iconID){
        Image image = new ImageIcon("resources/icon"+iconID).getImage();
        return image;
    }
    public Image getBackground(){
        Image image = new ImageIcon("resources/background").getImage();
        return image;
    }


}

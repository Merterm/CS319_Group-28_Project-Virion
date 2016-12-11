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
    public Image getBackground(String menuBackground){
        Image image = null;
        if(("InfoPane".compareTo(menuBackground))==1){
            image = new ImageIcon("resources/infopane").getImage();
        }
        if(("GamePanel".compareTo(menuBackground))==1){
            image = new ImageIcon("resources/gamepanel").getImage();
        }
        if(("HelpPanel".compareTo(menuBackground))==1){
            image = new ImageIcon("resources/helppanel").getImage();
        }
        if(("MainMenu".compareTo(menuBackground))==1){
            image = new ImageIcon("resources/mainmenu").getImage();
        }
        return image;
    }


}

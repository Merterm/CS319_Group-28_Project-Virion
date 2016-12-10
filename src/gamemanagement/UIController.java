package gamemanagement;

import ui.InfoPane;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class UIController
{
    public void openInfoPane()
    {
        JFrame infoFrame = new JFrame("Game Info");
        InfoPane infopanel = new InfoPane(infoFrame);
    }

    public void openHelpPane()
    {
        //...
    }

    public void openDNAFinderWindow(int[] dnaLocations)
    {
        JWindow postInfecWindow = new JWindow();
        //...
    }

    public void pause()
    {
        //...
    }

    public void changePosition()
    {
        //...
    }

}

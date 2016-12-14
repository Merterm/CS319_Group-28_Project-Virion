package gamemanagement;

import ui.HelpPane;
import ui.InfoPane;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Ulugbek
 * Version: 1.0
 * Description: methods of this class control the UI components
 * ...
 */
public class UIController
{
    /**
     *
     * @param frame
     */
    public void openInfoPane(JFrame frame)
    {
        InfoPane panel = new InfoPane(frame);
    }

    /**
     *
     * @param frame
     */
    public void openHelpPane(JFrame frame)
    {
        HelpPane panel = new HelpPane(frame);
    }

    /**
     *
     * @param dnaLocations
     */
    public void openDNAFinderWindow(int[] dnaLocations)
    {
        JWindow postInfecWindow = new JWindow();
        //...
    }

    public void pause()
    {
        //...set bool
    }

    public void changePosition()
    {
        //...moves ui
    }

}

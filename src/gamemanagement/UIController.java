package gamemanagement;

import java.awt.*;
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
        infoFrame.setLayout(new FlowLayout());
        infoFrame.setVisible(true);
        infoFrame.setSize(400,400);
        infoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout());
        infoPanel.setVisible(true);
        JLabel infoLabel = new JLabel("Information");

        infoPanel.add("label",infoLabel);
        infoFrame.add("panel",infoPanel);
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

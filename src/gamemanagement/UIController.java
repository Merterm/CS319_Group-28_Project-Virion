package gamemanagement;

import ui.HelpPane;
import ui.InfoPane;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert
 * Version: 1.0
 * Description: methods of this class control the UI components
 * ...
 */
public class UIController
{
    //*************************************************
    //  Class Variables
    //*************************************************
    private ArrayList<Component> gameComponentUI;
    private JPanel gamePanel;

    //*************************************************
    //  Constructors
    //*************************************************
    /**
     * Default constructor
     */
    public UIController(JPanel gamePanel) {
        gameComponentUI = new ArrayList<Component>();
        this.gamePanel = gamePanel;
    }

    //*************************************************
    //  Methods
    //*************************************************
    /**
     *
     * @param iconID
     */
    public void createComponent(final int iconID, int positionX, int positionY) {
        Component temp = new Component() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.drawImage(new ImageIcon("resources/icon" + iconID + ".png").getImage(), 0, 0, this);
            }
        };

        switch (iconID) {
            case 11:
                temp.setSize(91,11);
                temp.setPreferredSize(new Dimension(91,11));
            case 12:
                temp.setSize(76, 68);
                temp.setPreferredSize(new Dimension(76, 68));
            case 13:
                temp.setSize(156, 156);
                temp.setPreferredSize(new Dimension(156, 156));
            case 14:
                temp.setSize(50,149);
                temp.setPreferredSize(new Dimension(50,149));
            case 21:
                temp.setSize(140,71);
                temp.setPreferredSize(new Dimension(140,71));
            case 22:
                temp.setSize(20,23);
                temp.setPreferredSize(new Dimension(20,23));
            case 23:
                temp.setSize(20,23);
                temp.setPreferredSize(new Dimension(20,23));
            case 24:
                temp.setSize(20,23);
                temp.setPreferredSize(new Dimension(20,23));
            case 25:
                temp.setSize(20,23);
                temp.setPreferredSize(new Dimension(20,23));
            case 26:
                temp.setSize(20,23);
                temp.setPreferredSize(new Dimension(20,23));
            case 31:
                temp.setSize(91,64);
                temp.setPreferredSize(new Dimension(91,64));
            case 32:
                temp.setSize(101,55);
                temp.setPreferredSize(new Dimension(101,55));
            case 33:
                temp.setSize(213,217);
                temp.setPreferredSize(new Dimension(213,217));
            case 34:
                temp.setSize(41,44);
                temp.setPreferredSize(new Dimension(41,44));
            case 35:
                temp.setSize(95,93);
                temp.setPreferredSize(new Dimension(95,93));
            case 41:
                temp.setSize(608,566);
                temp.setPreferredSize(new Dimension(608,566));
            case 42:
                temp.setSize(662,616);
                temp.setPreferredSize(new Dimension(662,616));
            case 43:
                temp.setSize(210,18);
                temp.setPreferredSize(new Dimension(210,18));
        }

        temp.setBounds(new Rectangle(new Point(positionX, positionY), temp.getPreferredSize()));
        temp.setVisible(true);
        temp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Clicked"); //TODO Write cases here and pop up dialog boxes.
            }
        });
        gameComponentUI.add(temp);
        gamePanel.add(temp);
    }

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
    /*public void openHelpPane(JFrame frame)
    {
        HelpPane panel = new HelpPane(frame);
    }*/

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
        //paused = true;
    }

    public void changePosition()
    {
        //...moves ui
    }

}

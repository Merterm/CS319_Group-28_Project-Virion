package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public abstract class Pane extends JPanel
{
    JPanel panel;
    JButton backButton;
    private JTextField text, title;
    private BufferedImage background;

    public Pane()
    {
        panel = new JPanel();
        backButton = new JButton("Back");
        text = new JTextField("");
        title = new JTextField("");
        //background = new BufferedImage();
    }

}

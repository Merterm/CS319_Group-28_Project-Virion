package ui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */

public class MainMenu extends JFrame {
    private JButton playButton;
    private JButton highScoresButton;
    private JButton quitButton;
    private JButton toggleMusicButton;
    private JButton helpButton;
    private JTextPane virionTextPane;
    private JPanel menuPanel;
    private JLabel backgroundImage;

    //Icon instantiation
    private ImageIcon playIcon = new ImageIcon("/MenuScreen-PlayButton.png");
    private ImageIcon highScoresIcon = new ImageIcon("/MenuScreen-HighScoreButton.png");
    private ImageIcon quitIcon = new ImageIcon("/MenuScreen-QuitButton.png");
    private ImageIcon toggleMusicIcon = new ImageIcon("/MenuScreen-MusicButton.png");
    private ImageIcon helpIcon = new ImageIcon("/MenuScreen-HelpButton.png");

    public MainMenu(){
        playButton = new JButton(playIcon);
        highScoresButton = new JButton(highScoresIcon);
        quitButton = new JButton(quitIcon);
        toggleMusicButton = new JButton(toggleMusicIcon);
        helpButton = new JButton(helpIcon);
        menuPanel = new JPanel();
        virionTextPane = new JTextPane();
        backgroundImage = new JLabel(new ImageIcon(getClass().getResource("/MenuScreen-Background.png")));

        menuPanel.setLayout(new BorderLayout());
        menuPanel.setEnabled(true);

        menuPanel.add(backgroundImage, BorderLayout.CENTER);

        playButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-PlayButton.png")));
        playButton.setText("");
        menuPanel.add(playButton, BorderLayout.CENTER);

        highScoresButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-HighScoreButton.png")));
        highScoresButton.setText("");
        menuPanel.add(highScoresButton, BorderLayout.CENTER);

        quitButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-QuitButton.png")));
        quitButton.setText("");
        menuPanel.add(quitButton, BorderLayout.CENTER);

        toggleMusicButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-MusicButton.png")));
        toggleMusicButton.setText("");
        menuPanel.add(toggleMusicButton,BorderLayout.CENTER);

        helpButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-HelpButton.png")));
        helpButton.setText("");
        menuPanel.add(helpButton, BorderLayout.CENTER);

        virionTextPane.setFont(new Font("Roboto", Font.PLAIN, 48));
        virionTextPane.setText("Virion");
        menuPanel.add(virionTextPane,BorderLayout.CENTER);
        menuPanel.setVisible(true);
    }

    public static void main(String[] args) {
        MainMenu frame = new MainMenu();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}

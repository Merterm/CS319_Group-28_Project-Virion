package ui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import gamemanagement.*;

import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 8.12.2016.
 * Version: 1.1
 * Description: This is the MainMenu Panel for the UI package
 */
public class MainMenu extends JPanel {
    public JPanel menuPanel;
    private JPanel helpPane;
    private JButton playButton;
    private JButton highScoreButton;
    private JButton quitButton;
    private JTextPane logo;
    private JButton toggleMusicButton;
    private JButton helpButton;

    public static void main(String[] args) { //Automatically generated main method to test MainMenu
        JFrame frame = new JFrame("MainMenu");
        MusicController musicController = new MusicController();
        new Thread(musicController).start();
        frame.setContentPane(new MainMenu(frame, musicController).menuPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1135, 710);
        frame.setVisible(true);
    }

    /**
     * Default Constructor
     * Takes no parameters adds the mouseListeners to the buttons.
     */
    public MainMenu() {
        $$$setupUI$$$();
        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        highScoreButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        quitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        toggleMusicButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        helpButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    /**
     * Constructor for Launcher
     * Takes most of the controllers as parameters.
     *
     * @param uiCntrl:        is the user interface controller
     *                        taken as a parameter. This is to be used as a Façade class.
     * @param engine:         is the gameEngine class. Needed to start the game.
     * @param highScoreCntrl: used if the user clicks on highScoreButton.
     * @param iconMngr:       can be used while getting icons, //TODO
     * @param musicCntrl:     will be used if the user toggles the music.
     */
    public MainMenu(final JFrame frame, final JPanel screens, UIController uiCntrl, final GameEngine engine, HighScoreManager highScoreCntrl,
                    IconManager iconMngr, final MusicController musicCntrl) {
        // TODO We need to write a launcher class that contains all the controllers and the UI classes.
        this.setLayout(new OverlayLayout(this));
        $$$setupUI$$$();

        helpPane = new HelpPane().getHelpPanel();
        //this.add(helpPane);
        this.add(menuPanel);

        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //TODO Call the gameEngine's start() function.
                engine.start();
                ((CardLayout) screens.getLayout()).show(screens, "GamePanel"); //Changes the panel in the screens
            }
        });
        highScoreButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ((CardLayout) screens.getLayout()).show(screens, "HighScorePanel"); //Changes the panel in the screens
            }
        });
        quitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        toggleMusicButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                musicCntrl.toggleMusic();
            }
        });
        helpButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ((CardLayout) screens.getLayout()).show(screens, "HelpPanel1"); //Changes the panel in the screens
            }
        });
    }

    //Constructor for test purposes
    public MainMenu(final JFrame frame, final MusicController musicCntrl) {
        $$$setupUI$$$();
        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        highScoreButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        quitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        toggleMusicButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                musicCntrl.toggleMusic();
            }
        });
        helpButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    private void createUIComponents() {
        //Image img = new ImageIcon("/MenuScreen-Background.png").getImage();
        menuPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("resources/MenuScreen-Background.png").getImage(), 0, 0, this);
            }
        };

        Dimension size = new Dimension(1135, 710);
        menuPanel.setPreferredSize(size);
        menuPanel.setMinimumSize(size);
        menuPanel.setMaximumSize(size);
        menuPanel.setSize(size);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        menuPanel.setLayout(new GridLayoutManager(5, 2, new Insets(30, 200, 30, 200), -1, -1));
        playButton = new JButton();
        playButton.setBackground(new Color(-14379403));
        playButton.setEnabled(true);
        playButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-PlayButton.png")));
        playButton.setOpaque(false);
        playButton.setText("");
        playButton.setToolTipText("Start the Game");
        playButton.setVisible(true);
        menuPanel.add(playButton, new GridConstraints(1, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(350, 87), new Dimension(350, 87), new Dimension(350, 87), 0, false));
        highScoreButton = new JButton();
        highScoreButton.setBackground(new Color(-14379403));
        highScoreButton.setEnabled(true);
        highScoreButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-HighScoreButton.png")));
        highScoreButton.setOpaque(false);
        highScoreButton.setText("");
        highScoreButton.setToolTipText("See High Scores");
        menuPanel.add(highScoreButton, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(350, 87), new Dimension(350, 87), new Dimension(350, 87), 0, false));
        quitButton = new JButton();
        quitButton.setBackground(new Color(-14379403));
        quitButton.setEnabled(true);
        quitButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-QuitButton.png")));
        quitButton.setOpaque(false);
        quitButton.setText("");
        menuPanel.add(quitButton, new GridConstraints(3, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(282, 72), new Dimension(282, 72), new Dimension(282, 72), 0, false));
        helpButton = new JButton();
        helpButton.setBackground(new Color(-14379403));
        helpButton.setBorderPainted(false);
        helpButton.setEnabled(true);
        helpButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-HelpButton.png")));
        helpButton.setOpaque(false);
        helpButton.setText("");
        menuPanel.add(helpButton, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(76, 76), new Dimension(76, 76), new Dimension(76, 76), 0, false));
        logo = new JTextPane();
        logo.setBackground(new Color(-1));
        logo.setEditable(false);
        logo.setEnabled(true);
        logo.setFont(new Font("Roboto", Font.PLAIN, 96));
        logo.setForeground(new Color(-4473925));
        logo.setOpaque(false);
        logo.setText("Virion");
        menuPanel.add(logo, new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 50), null, 0, false));
        toggleMusicButton = new JButton();
        toggleMusicButton.setAlignmentY(0.5f);
        toggleMusicButton.setBackground(new Color(-14379403));
        toggleMusicButton.setBorderPainted(false);
        toggleMusicButton.setEnabled(true);
        toggleMusicButton.setHorizontalAlignment(0);
        toggleMusicButton.setIcon(new ImageIcon(getClass().getResource("/MenuScreen-MusicButton.png")));
        toggleMusicButton.setInheritsPopupMenu(false);
        toggleMusicButton.setMargin(new Insets(2, 14, 2, 14));
        toggleMusicButton.setOpaque(false);
        toggleMusicButton.setRolloverEnabled(false);
        toggleMusicButton.setSelected(false);
        toggleMusicButton.setText("");
        toggleMusicButton.setToolTipText("Toggle Music");
        menuPanel.add(toggleMusicButton, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(76, 76), new Dimension(76, 76), new Dimension(76, 76), 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return menuPanel;
    }
}

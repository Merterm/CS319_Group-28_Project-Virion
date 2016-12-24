package ui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import gamemanagement.MusicController;
import gamemanagement.UIController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class GamePanel extends JPanel {
    private JButton helpButton;
    private JButton pauseButton;
    private JButton musicButton;
    private JTextPane timeText;
    private JTextPane timeDisplayText;
    private JTextPane scoreTextPane;
    private JTextPane scoreDisplayText;
    private JTextPane atpDisplayText;
    private JTextPane cmDisplayText;
    private JTextPane virusCountDisplayText;
    private JTextPane atpText;
    private JTextPane cmText;
    private JTextPane virusCountText;
    public JPanel gamePanel;
    private JPanel infoPane;
    private JLayeredPane gameComponentPane;


    public static void main(String[] args) {
        JFrame frame = new JFrame("GamePanel");
        GamePanel gamePanel = new GamePanel(new MusicController(), new JPanel());
        frame.setContentPane(gamePanel);
        UIController uiController = new UIController(gamePanel);
        uiController.createComponent(41, 100, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1135, 710);
        frame.setVisible(true);
    }

    public GamePanel(final MusicController musicController, final JPanel screens) {
        this.setLayout(new OverlayLayout(this));
        this.setSize(1135, 710);
        $$$setupUI$$$();

        infoPane = new InfoPane().infoPanel;
        //this.add(infoPane);
        this.add(gamePanel);
        /*gameComponentPane = new JLayeredPane();
        gameComponentPane.setLayout(new OverlayLayout(gameComponentPane));
        gameComponentPane.setPreferredSize(new Dimension(1135, 710));
        gameComponentPane.add(infoPane, new Integer(0), 0); //TODO Think about these JlayeredPanes
        gameComponentPane.add(gamePanel, new Integer(1), 1);
        gameComponentPane.setLayer(infoPane, 1);
        gameComponentPane.setLayer(gamePanel, 0);

        //infoPane.setOpaque(true);

        gameComponentPane.setVisible(true);

        this.add(gameComponentPane);
        gameComponentPane.setOpaque(false);*/
        gamePanel.setOpaque(false);
        this.setOpaque(false);

        musicButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                musicController.toggleMusic();
                super.mouseClicked(e);
            }
        });
        pauseButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(screens);
                ((CardLayout) screens.getLayout()).show(screens, "PausePanel"); //Changes the panel in the screens
            }
        });
        helpButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(screens);
                ((CardLayout) screens.getLayout()).show(screens, "HelpPanel2"); //Changes the panel in the screens
            }
        });
    }

    private void createUIComponents() {
        gamePanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("resources/GamePlay-Background.png").getImage(), 0, 0, this);
            }
        };
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
        gamePanel.setLayout(new GridLayoutManager(29, 34, new Insets(0, 0, 0, 0), -1, -1));
        helpButton = new JButton();
        helpButton.setBorderPainted(false);
        helpButton.setContentAreaFilled(false);
        helpButton.setIcon(new ImageIcon(getClass().getResource("/HelpIcon.png")));
        helpButton.setText("");
        gamePanel.add(helpButton, new GridConstraints(0, 33, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(41, 41), new Dimension(41, 41), new Dimension(41, 41), 0, false));
        final Spacer spacer1 = new Spacer();
        gamePanel.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        pauseButton = new JButton();
        pauseButton.setBorderPainted(false);
        pauseButton.setContentAreaFilled(false);
        pauseButton.setIcon(new ImageIcon(getClass().getResource("/PauseIcon.png")));
        pauseButton.setText("");
        gamePanel.add(pauseButton, new GridConstraints(0, 32, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(41, 41), new Dimension(41, 41), new Dimension(41, 41), 0, false));
        final Spacer spacer2 = new Spacer();
        gamePanel.add(spacer2, new GridConstraints(28, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        gamePanel.add(spacer3, new GridConstraints(27, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        gamePanel.add(spacer4, new GridConstraints(26, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        gamePanel.add(spacer5, new GridConstraints(25, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer6 = new Spacer();
        gamePanel.add(spacer6, new GridConstraints(24, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer7 = new Spacer();
        gamePanel.add(spacer7, new GridConstraints(23, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer8 = new Spacer();
        gamePanel.add(spacer8, new GridConstraints(22, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer9 = new Spacer();
        gamePanel.add(spacer9, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer10 = new Spacer();
        gamePanel.add(spacer10, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer11 = new Spacer();
        gamePanel.add(spacer11, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer12 = new Spacer();
        gamePanel.add(spacer12, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer13 = new Spacer();
        gamePanel.add(spacer13, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer14 = new Spacer();
        gamePanel.add(spacer14, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer15 = new Spacer();
        gamePanel.add(spacer15, new GridConstraints(0, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer16 = new Spacer();
        gamePanel.add(spacer16, new GridConstraints(0, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer17 = new Spacer();
        gamePanel.add(spacer17, new GridConstraints(0, 9, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        timeText = new JTextPane();
        timeText.setEditable(false);
        timeText.setFont(new Font("Roboto", Font.BOLD, 16));
        timeText.setForeground(new Color(-1));
        timeText.setOpaque(false);
        timeText.setText("Time:");
        gamePanel.add(timeText, new GridConstraints(0, 21, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        scoreTextPane = new JTextPane();
        scoreTextPane.setEditable(false);
        scoreTextPane.setFont(new Font("Roboto", Font.BOLD, 16));
        scoreTextPane.setForeground(new Color(-1));
        scoreTextPane.setOpaque(false);
        scoreTextPane.setText("Score:");
        gamePanel.add(scoreTextPane, new GridConstraints(0, 23, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        timeDisplayText = new JTextPane();
        timeDisplayText.setBackground(new Color(-14379403));
        timeDisplayText.setCaretColor(new Color(-14379403));
        timeDisplayText.setEditable(false);
        timeDisplayText.setFont(new Font("Roboto", Font.BOLD, 12));
        timeDisplayText.setForeground(new Color(-1));
        timeDisplayText.setOpaque(true);
        timeDisplayText.setText("0");
        gamePanel.add(timeDisplayText, new GridConstraints(0, 22, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        scoreDisplayText = new JTextPane();
        scoreDisplayText.setBackground(new Color(-14379403));
        scoreDisplayText.setCaretColor(new Color(-14379403));
        scoreDisplayText.setEditable(false);
        scoreDisplayText.setFont(new Font("Roboto", Font.BOLD, 12));
        scoreDisplayText.setForeground(new Color(-1));
        scoreDisplayText.setOpaque(true);
        scoreDisplayText.setText("0");
        gamePanel.add(scoreDisplayText, new GridConstraints(0, 24, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        atpDisplayText = new JTextPane();
        atpDisplayText.setBackground(new Color(-14379403));
        atpDisplayText.setCaretColor(new Color(-14379403));
        atpDisplayText.setEditable(false);
        atpDisplayText.setFont(new Font("Roboto", Font.BOLD, 12));
        atpDisplayText.setForeground(new Color(-1));
        atpDisplayText.setOpaque(true);
        atpDisplayText.setText("1000");
        gamePanel.add(atpDisplayText, new GridConstraints(0, 26, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        cmDisplayText = new JTextPane();
        cmDisplayText.setBackground(new Color(-14379403));
        cmDisplayText.setCaretColor(new Color(-14379403));
        cmDisplayText.setEditable(false);
        cmDisplayText.setFont(new Font("Roboto", Font.BOLD, 12));
        cmDisplayText.setForeground(new Color(-1));
        cmDisplayText.setOpaque(true);
        cmDisplayText.setText("10000");
        gamePanel.add(cmDisplayText, new GridConstraints(0, 28, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        virusCountDisplayText = new JTextPane();
        virusCountDisplayText.setBackground(new Color(-14379403));
        virusCountDisplayText.setCaretColor(new Color(-14379403));
        virusCountDisplayText.setEditable(false);
        virusCountDisplayText.setFont(new Font("Roboto", Font.BOLD, 12));
        virusCountDisplayText.setForeground(new Color(-1));
        virusCountDisplayText.setOpaque(true);
        virusCountDisplayText.setText("0");
        gamePanel.add(virusCountDisplayText, new GridConstraints(0, 30, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        atpText = new JTextPane();
        atpText.setEditable(false);
        atpText.setFont(new Font("Roboto", Font.BOLD, 16));
        atpText.setForeground(new Color(-1));
        atpText.setOpaque(false);
        atpText.setText("ATP:");
        gamePanel.add(atpText, new GridConstraints(0, 25, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        cmText = new JTextPane();
        cmText.setEditable(false);
        cmText.setFont(new Font("Roboto", Font.BOLD, 16));
        cmText.setForeground(new Color(-1));
        cmText.setOpaque(false);
        cmText.setText("CM:");
        gamePanel.add(cmText, new GridConstraints(0, 27, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 25), new Dimension(50, 25), new Dimension(50, 25), 0, false));
        virusCountText = new JTextPane();
        virusCountText.setEditable(false);
        virusCountText.setFont(new Font("Roboto", Font.BOLD, 16));
        virusCountText.setForeground(new Color(-1));
        virusCountText.setOpaque(false);
        virusCountText.setText("Virus #:");
        gamePanel.add(virusCountText, new GridConstraints(0, 29, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(70, 25), new Dimension(70, 25), new Dimension(70, 25), 0, false));
        musicButton = new JButton();
        musicButton.setBorderPainted(false);
        musicButton.setContentAreaFilled(false);
        musicButton.setIcon(new ImageIcon(getClass().getResource("/MusicIcon.png")));
        musicButton.setInheritsPopupMenu(true);
        musicButton.setOpaque(false);
        musicButton.setText("");
        gamePanel.add(musicButton, new GridConstraints(0, 31, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(41, 41), new Dimension(41, 41), new Dimension(41, 41), 0, false));
        final Spacer spacer18 = new Spacer();
        gamePanel.add(spacer18, new GridConstraints(21, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer19 = new Spacer();
        gamePanel.add(spacer19, new GridConstraints(20, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer20 = new Spacer();
        gamePanel.add(spacer20, new GridConstraints(19, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer21 = new Spacer();
        gamePanel.add(spacer21, new GridConstraints(18, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer22 = new Spacer();
        gamePanel.add(spacer22, new GridConstraints(17, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer23 = new Spacer();
        gamePanel.add(spacer23, new GridConstraints(16, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer24 = new Spacer();
        gamePanel.add(spacer24, new GridConstraints(15, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer25 = new Spacer();
        gamePanel.add(spacer25, new GridConstraints(14, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer26 = new Spacer();
        gamePanel.add(spacer26, new GridConstraints(13, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer27 = new Spacer();
        gamePanel.add(spacer27, new GridConstraints(12, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer28 = new Spacer();
        gamePanel.add(spacer28, new GridConstraints(11, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer29 = new Spacer();
        gamePanel.add(spacer29, new GridConstraints(10, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer30 = new Spacer();
        gamePanel.add(spacer30, new GridConstraints(9, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer31 = new Spacer();
        gamePanel.add(spacer31, new GridConstraints(8, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer32 = new Spacer();
        gamePanel.add(spacer32, new GridConstraints(7, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer33 = new Spacer();
        gamePanel.add(spacer33, new GridConstraints(0, 10, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer34 = new Spacer();
        gamePanel.add(spacer34, new GridConstraints(0, 11, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer35 = new Spacer();
        gamePanel.add(spacer35, new GridConstraints(0, 12, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer36 = new Spacer();
        gamePanel.add(spacer36, new GridConstraints(0, 13, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer37 = new Spacer();
        gamePanel.add(spacer37, new GridConstraints(6, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer38 = new Spacer();
        gamePanel.add(spacer38, new GridConstraints(5, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer39 = new Spacer();
        gamePanel.add(spacer39, new GridConstraints(4, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer40 = new Spacer();
        gamePanel.add(spacer40, new GridConstraints(3, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer41 = new Spacer();
        gamePanel.add(spacer41, new GridConstraints(2, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer42 = new Spacer();
        gamePanel.add(spacer42, new GridConstraints(1, 21, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer43 = new Spacer();
        gamePanel.add(spacer43, new GridConstraints(0, 14, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer44 = new Spacer();
        gamePanel.add(spacer44, new GridConstraints(0, 15, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer45 = new Spacer();
        gamePanel.add(spacer45, new GridConstraints(0, 16, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer46 = new Spacer();
        gamePanel.add(spacer46, new GridConstraints(0, 17, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer47 = new Spacer();
        gamePanel.add(spacer47, new GridConstraints(0, 18, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer48 = new Spacer();
        gamePanel.add(spacer48, new GridConstraints(0, 19, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer49 = new Spacer();
        gamePanel.add(spacer49, new GridConstraints(0, 20, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return gamePanel;
    }
}

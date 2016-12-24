package ui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class PausePanel extends JPanel {
    private JButton resumeButton;
    private JButton helpButton;
    private JButton quitButton;
    private JPanel pausePanel;

    public PausePanel(final JFrame frame, final JPanel screens) {
        $$$setupUI$$$();
        resumeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((CardLayout) screens.getLayout()).show(screens, "GamePanel"); //Changes the panel in the screens
                super.mouseClicked(e);
            }
        });
        helpButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ((CardLayout) screens.getLayout()).show(screens, "HelpPanel2"); //Changes the panel in the screens
            }
        });
        quitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PausePanel");
        frame.setContentPane(new PausePanel(frame, new JPanel()).pausePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1135, 710);
        frame.setVisible(true);
    }


    private void createUIComponents() {
        pausePanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("resources/Pause-Background.png").getImage(), 0, 0, this);
            }
        };
    }

    public JPanel getPausePanel() {
        return pausePanel;
    }

    public void setPausePanel(JPanel pausePanel) {
        this.pausePanel = pausePanel;
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
        pausePanel.setLayout(new GridLayoutManager(5, 7, new Insets(0, 0, 0, 0), -1, -1));
        pausePanel.setOpaque(false);
        final Spacer spacer1 = new Spacer();
        pausePanel.add(spacer1, new GridConstraints(0, 2, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        pausePanel.add(spacer2, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        pausePanel.add(spacer3, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        resumeButton = new JButton();
        resumeButton.setBorderPainted(true);
        resumeButton.setContentAreaFilled(false);
        resumeButton.setEnabled(true);
        resumeButton.setIcon(new ImageIcon(getClass().getResource("/Resume-Button.png")));
        resumeButton.setOpaque(false);
        resumeButton.setText("");
        pausePanel.add(resumeButton, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(188, 48), new Dimension(188, 48), new Dimension(188, 48), 0, false));
        helpButton = new JButton();
        helpButton.setContentAreaFilled(false);
        helpButton.setIcon(new ImageIcon(getClass().getResource("/Pause-Help-Button.png")));
        helpButton.setOpaque(false);
        helpButton.setText("");
        pausePanel.add(helpButton, new GridConstraints(2, 2, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(188, 48), new Dimension(188, 48), new Dimension(188, 48), 0, false));
        quitButton = new JButton();
        quitButton.setContentAreaFilled(false);
        quitButton.setIcon(new ImageIcon(getClass().getResource("/Pause-Quit-Button.png")));
        quitButton.setOpaque(false);
        quitButton.setText("");
        pausePanel.add(quitButton, new GridConstraints(3, 2, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(188, 48), new Dimension(188, 48), new Dimension(188, 48), 0, false));
        final Spacer spacer4 = new Spacer();
        pausePanel.add(spacer4, new GridConstraints(1, 3, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        pausePanel.add(spacer5, new GridConstraints(2, 4, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer6 = new Spacer();
        pausePanel.add(spacer6, new GridConstraints(3, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer7 = new Spacer();
        pausePanel.add(spacer7, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer8 = new Spacer();
        pausePanel.add(spacer8, new GridConstraints(1, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return pausePanel;
    }
}

package ui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Author by Ulugbek, Mert on 12/14/2016.
 */
public class HelpPane extends Pane {
    private JTextPane helpTextPane;
    private JPanel helpPanel;
    private JButton backButton;
    private JTextPane helpInfo;

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelpPane");
        frame.setContentPane(new HelpPane().helpPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1135, 710);
        frame.setVisible(true);
    }

    public HelpPane() {
        this.setOpaque(false);
        $$$setupUI$$$();
    }

    public HelpPane(final JPanel screens) {
        $$$setupUI$$$();

        backButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                    ((CardLayout) screens.getLayout()).previous(screens); //Changes the panel in the screens
                }
        });
    }

    private void createUIComponents() {
        helpPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("resources/HighScore-Background.png").getImage(), 0, 0, this);
            }
        };
    }

    public JPanel getHelpPanel() {
        return helpPanel;
    }

    public void setHelpPanel(JPanel helpPanel) {
        this.helpPanel = helpPanel;
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
        helpPanel.setLayout(new GridLayoutManager(6, 5, new Insets(0, 0, 0, 0), -1, -1));
        helpTextPane = new JTextPane();
        helpTextPane.setBackground(new Color(-1));
        helpTextPane.setEditable(false);
        helpTextPane.setFont(new Font("Roboto", Font.PLAIN, 48));
        helpTextPane.setForeground(new Color(-1));
        helpTextPane.setOpaque(false);
        helpTextPane.setText("Help");
        helpPanel.add(helpTextPane, new GridConstraints(0, 3, 5, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        helpInfo = new JTextPane();
        helpInfo.setBackground(new Color(-1));
        helpInfo.setEditable(false);
        helpInfo.setOpaque(false);
        helpPanel.add(helpInfo, new GridConstraints(5, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        final Spacer spacer1 = new Spacer();
        helpPanel.add(spacer1, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        helpPanel.add(spacer2, new GridConstraints(4, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        helpPanel.add(spacer3, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        helpPanel.add(spacer4, new GridConstraints(5, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        backButton = new JButton();
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setIcon(new ImageIcon(getClass().getResource("/BackButton.png")));
        backButton.setOpaque(false);
        backButton.setText("");
        helpPanel.add(backButton, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        helpPanel.add(spacer5, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return helpPanel;
    }
}

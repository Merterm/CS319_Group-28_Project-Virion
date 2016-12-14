package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Ulugbek on 12/14/2016.
 */
public class HelpPane extends Pane {
    private JTextPane HelpTextPane;
    private JPanel helpPanel;
    private JButton backButton;

    public HelpPane(final JFrame infoFrame)
    {
        backButton = new JButton("Back");
        panel = new JPanel(new FlowLayout());
        panel.add(backButton);

        backButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e)
            {
                infoFrame.dispose();
            }

        });
    }
}

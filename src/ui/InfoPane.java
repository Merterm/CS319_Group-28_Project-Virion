package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Game information panel
 */

public class InfoPane extends Pane
{
    private JTextPane infoTextPane;
    private JPanel panel1;

    /**
     *
     * @param infoFrame
     */
    public InfoPane(final JFrame infoFrame)
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

package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.lang.Object;
import java.beans.*;

/**
 *game info
 */

public class InfoPane extends Pane
{
    /**
     *
     * @param infoFrame
     */
    public InfoPane(final JFrame infoFrame)
    {
        backButton = new JButton("Back");
        panel = new JPanel(new FlowLayout());
        panel.add(backButton);
        infoFrame.setContentPane(panel);
        infoFrame.pack();
        infoFrame.setSize(100,100);
        infoFrame.setVisible(true);

        backButton.addActionListener(new Action() {

            public void actionPerformed(ActionEvent e) {//todo mouse
                infoFrame.dispose();

            }
            public boolean isEnabled() {
                return false;
            }
            public void setEnabled(boolean b){

            }

            public Object getValue(String key) {
                return null;
            }

            public void putValue(String key, Object value) {

            }

            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }


        });
    }

    /*DOES NOT WORK OUTSIDE THE CONSTRUCTOR
    backButton.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            //back to main menu
        }
    });
    */
}

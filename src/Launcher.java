import gamecomponents.Cell;
import gamecomponents.protein.Protein;
import gamecomponents.virus.Virus;
import gamemanagement.*;
import ui.*;

import javax.swing.*;
import java.awt.*;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 19.12.2016.
 * Version: 1.0
 * Description: This is the class that combines the controllers
 *              with the UI. It contains the main method and it
 *              will be the one that will initiate the .jar file.
 */
public class Launcher {
    //*************************************************
    //  Variables
    //*************************************************
    private static JPanel screens;

    public static void main(String[] args) {
        //*************************************************
        //  Initializations
        //*************************************************
        // -----------
        // Controllers
        // -----------
        GameEngine gameEngine = new GameEngine();
        CellController cellController = new CellController();
        HighScoreManager highScoreManager = new HighScoreManager();
        IconManager iconManager = new IconManager();
        MovementController movementController = new MovementController();
        MusicController musicController = new MusicController();

        JPanel gamePanel = new GamePanel(musicController, screens) {
            @Override
            public boolean isOptimizedDrawingEnabled() {
                return false;
            }
        }; //Need to always add the inner panel
        UIController uiController = new UIController(gamePanel);

        VirusController virusController = new VirusController();

        // -----
        // Frame
        // -----
        JFrame virionFrame = new JFrame("Virion");

        // ------
        // Panels
        // ------
        screens = new JPanel(new CardLayout());
        JPanel mainMenuScreen = new MainMenu(virionFrame, screens, uiController, gameEngine, highScoreManager, iconManager, musicController);

        JPanel helpPanel1 = new HelpPane(screens).helpPanel;
        JPanel helpPanel2 = new HelpPane(screens).helpPanel;
        JPanel infoPane = new InfoPane();
        JPanel pausePanel = new PausePanel(virionFrame, screens).pausePanel;
        JPanel highScorePanel = new HighScorePanel(screens, highScoreManager).highScorePanel;
        //This is the important part. In order to switch between different screens CardLayout is used.

        screens.add(mainMenuScreen, "MainMenu");
        screens.add(helpPanel1, "HelpPanel1");
        screens.add(gamePanel, "GamePanel");
        screens.add(helpPanel2, "HelpPanel2");
        screens.add(infoPane, "InfoPanel");
        screens.add(pausePanel, "PausePanel");
        screens.add(highScorePanel, "HighScorePanel");
        ((CardLayout) screens.getLayout()).show(screens, "MainMenu");

        new Thread(musicController).start();
        virionFrame.add(screens, BorderLayout.CENTER);
        virionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        virionFrame.setSize(1135, 710);
        virionFrame.setVisible(true);

    }

    private void changeScreen(String screenName) {
        CardLayout cardLayout = (CardLayout) screens.getLayout();
        cardLayout.show(screens, screenName);
    }
}

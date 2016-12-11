package gamemanagement;

import java.io.*;

import javax.sound.sampled.*;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Mert İNAN on 5.12.2016.
 * Version: 1.0
 * Description:
 */
public class MusicController implements Runnable {
    //*************************************************
    //  Class Attributes
    //*************************************************
    private FileInputStream musicFile;
    private AudioInputStream stream1;
    private Clip clip1;
    private Line line1;

    //*************************************************
    //  Constructors
    //*************************************************
    /**
     *
     * @param musicFilename
     */
    public MusicController(String musicFilename) {
        try {
            stream1 = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream("resources" + musicFilename)));
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AudioFormat musicFormat = stream1.getFormat();
        try {
            clip1 = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

        DataLine.Info info1 = new DataLine.Info(Clip.class, musicFormat);
        try {
            line1 = AudioSystem.getLine(info1);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     */
    public MusicController() {
        try {
            stream1 = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream("resources/Game-Music.wav")));
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AudioFormat musicFormat = stream1.getFormat();
        try {
            clip1 = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

        DataLine.Info info1 = new DataLine.Info(Clip.class, musicFormat);
        try {
            line1 = AudioSystem.getLine(info1);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    //*************************************************
    //  Methods
    //*************************************************
    public void run() {
        //setup();
        toggleMusic();
    }

    private void setup() {
        try {
            stream1 = AudioSystem.getAudioInputStream(musicFile);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AudioFormat musicFormat = stream1.getFormat();
        try {
            clip1 = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

        DataLine.Info info1 = new DataLine.Info(Clip.class, musicFormat);
        try {
            line1 = AudioSystem.getLine(info1);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void toggleMusic() {
        if (!line1.isOpen()) {
            System.out.println("Inside isOpen()");
            if (!clip1.isOpen()) {
                System.out.println("Inside clip1.isOpen()");
                try {
                    clip1.open(stream1);
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (!clip1.isRunning()) {
                clip1.loop(Clip.LOOP_CONTINUOUSLY);
                clip1.start();
            }
            else if (clip1.isRunning())
                clip1.stop();
        }
    }

    //TODO Write the toggleAlarm method
}



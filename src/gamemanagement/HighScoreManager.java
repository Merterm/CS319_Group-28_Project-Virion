package gamemanagement;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Irmak Yılmaz on 10.12.2016.
 * Version: 1.0
 * Description:
 */
public class HighScoreManager {
    private ArrayList<String> credentials;

    public HighScoreManager() {
        credentials = new ArrayList<String>();
    }

    public boolean isHighScore(int score) throws FileNotFoundException {
        boolean result = false;
        for(String i : credentials){
            if(i.compareTo("" + score) <= 0)
                result=true;
            else
                result = false;
        }
        return result;
    }

    public void updateHighScoreList(int score, ArrayList<String> credentials){
        credentials.add("" + score);
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("resources/highscorelist.txt", true));

            writer.println("\n"+score);
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }

    public ArrayList readHighScoreList() throws FileNotFoundException {
        ArrayList <String> list = new ArrayList<String>();

        Scanner scanner = new Scanner(new File("resources/highscorelist.txt"));
        while(scanner.hasNext()){
            list.add(scanner.next());
        }
        return list;
    }

}


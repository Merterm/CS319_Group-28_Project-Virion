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
    private ArrayList<Integer> credentials;

    public boolean isHighScore(int score) throws FileNotFoundException {
        boolean result = false;
        ArrayList <Integer> list = this.readHighScoreList();
        for(int i : list){
            if(i<=score)
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
        ArrayList <Integer> list = new ArrayList<Integer>();

        Scanner scanner = new Scanner(new File("resources/highscorelist.txt"));
        while(scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }
        return list;
    }

}


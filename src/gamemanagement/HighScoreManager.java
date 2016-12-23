package gamemanagement;


import java.io.File;
import java.io.FileNotFoundException;
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
            if(i<score)
                result=true;
            else
                result = false;
        }
        return result;
    }

    public void updateHighScoreList(int score, ArrayList<String> credentials){
        credentials.add("" + score);
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


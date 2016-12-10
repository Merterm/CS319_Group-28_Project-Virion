package gamemanagement;

import java.util.ArrayList;

/**
 * CS319: Object-Oriented Software Engineering Course Project
 * Project Virion
 * Author: Irmak Yılmaz on 10.12.2016.
 * Version: 1.0
 * Description:
 */
public class HighScoreManager {
    public boolean isHighScore(int score){
        boolean result;
        ArrayList list = this.readHighScoreList();
        for(int i = 0; i< list.size(); i++){
            if(list[i]<score)
                result=true;
            else
                result = false;
        }
        return result;
    }
    public void update HighScoreList(int score, ArrayList credentials){
        int i = 0;
        while(i<credentials.size())
            i++;
        credentials[i]=score;
    }
    public ArrayList readHighScoreList(){
        ArrayList list = new ArrayList();
        return list;
    }

}


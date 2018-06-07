
package main;

import media.Radio;
import media.Television;

public class Main {


    public static void main(String[] args) {
        
        Television myTv = new Television();
        System.out.println("");
        myTv.setVolume(5);
        myTv.setCurrentProgram(55);
        myTv.setTurnOn(true);
        myTv.showData();
        
        
//        Radio myRadio = new Radio();
        
        
        
   
    }
    
}

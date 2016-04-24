package com.example.acab1.funfacts;

import java.util.Random;
/**
 * Created by acab1 on 4/15/2016.
 */
public class FactsList {
    private String[] mFacts = {
            "This is my first Android App",
            "I worked with DePaul Android to make this",
            "My roommmates also worked on their own similar apps",
            "I live with Giancarlo, Robert, and Brandon",
            "Giancarlo can't spell when he codes",
            "Brandon is technically a year ahead of us, AP credits",
            "Robert loves architecture"
    };

    public String getFact(){
        Random randNum = new Random();
        int rand = randNum.nextInt(mFacts.length);

        return mFacts[rand];
    }
}

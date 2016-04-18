package com.example.acab1.funfacts;

import java.util.Random;
/**
 * Created by acab1 on 4/15/2016.
 */
public class FactsList {
    private String[] mFacts = {
            "Giancarlo had chlamydia for two whole days",
            "Robert had his face made fun of by a dirty CTA nigga",
            "Brandon's room smells like shit",
            "We flooded the hallway by putting dish soap in the dishwasher",
            "Giancarlo can't spell when he codes",
            "Brandon thinks the honeymoon phase is over",
            "Robert smokes big weed and I could care less"
    };

    public String getFact(){
        Random randNum = new Random();
        int rand = randNum.nextInt(mFacts.length);

        return mFacts[rand];
    }
}

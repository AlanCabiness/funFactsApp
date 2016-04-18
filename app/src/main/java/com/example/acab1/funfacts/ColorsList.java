package com.example.acab1.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by acab1 on 4/15/2016.
 */
public class ColorsList{
    private  String[] mColors = {
            "#c2e2e5", // lighter blue
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor(){
        Random randNum = new Random();
        int rand = randNum.nextInt(mColors.length);
        int colorAsInt = Color.parseColor(mColors[rand]);
        return colorAsInt;
    }
}

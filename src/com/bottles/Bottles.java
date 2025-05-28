package com.bottles;

public class Bottles {

    public String singVerse(int i) {
        return onTheWallVerse(i)  + ", " + getNumberAndContainer(i) + " of Beer\n";
    }

    private static String getNumberAndContainer(int i) {
        String numberAndContainer;
        switch (i) {
            case 1:
                numberAndContainer = i + " " + "Bottle";
            break;
            case 0:
                numberAndContainer = "No More Bottles";
                break;
            default:
                numberAndContainer = i + " " + "Bottles";
            break;
        }
        return numberAndContainer;
    }

    private String onTheWallVerse(int i) {
        switch(i){
            case(-1):
                return onTheWallVerse(99);
            default:
                return getNumberAndContainer(i) + " of Beer on the Wall";
        }
    }

    public String singChorus(int i) {
        switch(i){
            case 1:
                return "Take it down and pass it around, ";
            case 0:
                return "Go to the store and buy some more, ";
            default:
                return "Take one down and pass it around, ";
        }
    }

    public String singWholeSong() {
        String song = "";
        for (int i = 99; i>=0; i--) {
            song = song + singVerse(i) + singChorus(i) + onTheWallVerse(i-1) + ".\n\n";
        }
        return song;
    }
}

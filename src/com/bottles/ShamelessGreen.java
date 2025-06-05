package com.bottles;

public class ShamelessGreen {
    public String singVerse(int i) {
        return switch (i) {
            case 2 -> 2 + " bottles of beer on the wall, " +
                    2 + " bottles of beer\n" +
                    "Take one down and pass it around, " +
                    1 + " bottle of beer on the wall.\n";
            case 1 -> 1 + " bottle of beer on the wall, " +
                    1 + " bottle of beer\n" +
                    "Take it down and pass it around, " +
                    "no more bottles of beer on the wall.\n";
            case 0 -> "No more bottles of beer on the wall, " +
                    "no more bottles of beer\n" +
                    "Go to the store and buy some more, " +
                    "99 bottles of beer on the wall.\n";
            default -> i + " bottles of beer on the wall, " +
                    i + " bottles of beer\n" +
                    "Take one down and pass it around, " +
                    (i - 1) + " bottles of beer on the wall.\n";
        };
    }

    public String verses(int start, int finish) {
        StringBuilder verses = new StringBuilder();
        for(int i = start; i >= finish; i--){
            verses.append(singVerse(i));
            if(i != finish) {
                verses.append("\n");
            }
        }
        return verses.toString();
    }

    public String song(){
        return verses(99,0);
    }
}

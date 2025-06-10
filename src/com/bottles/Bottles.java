package com.bottles;

public class Bottles {
    public String verse(int number) {
        return capitalize(quantity(number)) + " " + container(number) + " of beer on the wall, " +
                    quantity(number) + " " + container(number) + " of beer\n" +
                    action(number) + ", " +
                    quantity(successor(number)) + " " + container(successor(number)) + " of beer on the wall.\n";
    }

    private int successor(int number){
        if(number == 0){
            return 99;
        }
        return number-1;
    }

    public String action(int number){
        if (number == 0){
            return "Go to the store and buy some more";
        }
        return "Take " + pronoun(number) + " down and pass it around";
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String quantity(int number){
        if(number == 0){
            return "no more";
        }
        return Integer.toString(number);
    }

    private String pronoun(int number){
        if(number == 1){
            return "it";
        }
        return "one";
    }

    private String container(int number) {
        if(number == 1){
            return "bottle";
        }
        return "bottles";
    }


    public String verses(int start, int finish) {
        StringBuilder verses = new StringBuilder();
        for(int i = start; i >= finish; i--){
            verses.append(verse(i));
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

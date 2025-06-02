package com.bottles;

public class MyBottlesSolution {

    public String singVerse(int i) {
        return numberContainerAndBeverage(i)  + onTheWall() + ", " + numberContainerAndBeverage(i) +"\n";
    }

    private static String onTheWall() {
        return " on the Wall";
    }

    private static String getNumberAndContainer(int i) {
        return switch (i) {
            case 1 -> i + " " + "Bottle";
            case 0 -> "No More Bottles";
            default -> i + " " + "Bottles";
        };
    }

    private String numberContainerAndBeverage(int i) {
        if (i == -1) {
            return numberContainerAndBeverage(99);
        }
        return getNumberAndContainer(i) + " of Beer";
    }

    public String singChorus(int i) {
        return switch (i) {
            case 1 -> "Take it down and pass it around, ";
            case 0 -> "Go to the store and buy some more, ";
            default -> "Take one down and pass it around, ";
        };
    }

    public String singWholeSong() {
        StringBuilder song = new StringBuilder();
        for (int i = 99; i>=0; i--) {
            song.append(singVerse(i))
                    .append(singChorus(i))
                    .append(numberContainerAndBeverage(i - 1))
                    .append(onTheWall())
                    .append(".\n\n");
        }
        return song.toString();
    }
}

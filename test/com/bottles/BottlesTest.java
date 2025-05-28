package com.bottles;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BottlesTest {
    Bottles bottleSong = new Bottles();
    @Test
    public void testVerse99() {
        assertEquals("99 Bottles of Beer on the Wall, 99 Bottles of Beer\n", bottleSong.singVerse(99));
    }

    @Test
    public void testVerse1() {
        assertEquals("1 Bottle of Beer on the Wall, 1 Bottle of Beer\n", bottleSong.singVerse(1));
    }
    @Test
    public void testVerse0() {
        assertEquals("No More Bottles of Beer on the Wall, No More Bottles of Beer\n", bottleSong.singVerse(0));
    }


    @Test
    public void testChorus(){
        assertEquals("Take one down and pass it around, ", bottleSong.singChorus(99));
    }

    @Test
    public void testChorus1(){
        assertEquals("Take it down and pass it around, ", bottleSong.singChorus(1));
    }

    @Test
    public void testChorus0(){
        assertEquals("Go to the store and buy some more, ", bottleSong.singChorus(0));
    }

    @Test
    public void testWholeSong(){

        String song = "99 Bottles of Beer on the Wall, 99 Bottles of Beer\n" +
                "Take one down and pass it around, 98 Bottles of Beer on the Wall.\n" +
                "\n" +
                "98 Bottles of Beer on the Wall, 98 Bottles of Beer\n" +
                "Take one down and pass it around, 97 Bottles of Beer on the Wall.\n" +
                "\n" +
                "97 Bottles of Beer on the Wall, 97 Bottles of Beer\n" +
                "Take one down and pass it around, 96 Bottles of Beer on the Wall.\n" +
                "\n" +
                "96 Bottles of Beer on the Wall, 96 Bottles of Beer\n" +
                "Take one down and pass it around, 95 Bottles of Beer on the Wall.\n" +
                "\n" +
                "95 Bottles of Beer on the Wall, 95 Bottles of Beer\n" +
                "Take one down and pass it around, 94 Bottles of Beer on the Wall.\n" +
                "\n" +
                "94 Bottles of Beer on the Wall, 94 Bottles of Beer\n" +
                "Take one down and pass it around, 93 Bottles of Beer on the Wall.\n" +
                "\n" +
                "93 Bottles of Beer on the Wall, 93 Bottles of Beer\n" +
                "Take one down and pass it around, 92 Bottles of Beer on the Wall.\n" +
                "\n" +
                "92 Bottles of Beer on the Wall, 92 Bottles of Beer\n" +
                "Take one down and pass it around, 91 Bottles of Beer on the Wall.\n" +
                "\n" +
                "91 Bottles of Beer on the Wall, 91 Bottles of Beer\n" +
                "Take one down and pass it around, 90 Bottles of Beer on the Wall.\n" +
                "\n" +
                "90 Bottles of Beer on the Wall, 90 Bottles of Beer\n" +
                "Take one down and pass it around, 89 Bottles of Beer on the Wall.\n" +
                "\n" +
                "89 Bottles of Beer on the Wall, 89 Bottles of Beer\n" +
                "Take one down and pass it around, 88 Bottles of Beer on the Wall.\n" +
                "\n" +
                "88 Bottles of Beer on the Wall, 88 Bottles of Beer\n" +
                "Take one down and pass it around, 87 Bottles of Beer on the Wall.\n" +
                "\n" +
                "87 Bottles of Beer on the Wall, 87 Bottles of Beer\n" +
                "Take one down and pass it around, 86 Bottles of Beer on the Wall.\n" +
                "\n" +
                "86 Bottles of Beer on the Wall, 86 Bottles of Beer\n" +
                "Take one down and pass it around, 85 Bottles of Beer on the Wall.\n" +
                "\n" +
                "85 Bottles of Beer on the Wall, 85 Bottles of Beer\n" +
                "Take one down and pass it around, 84 Bottles of Beer on the Wall.\n" +
                "\n" +
                "84 Bottles of Beer on the Wall, 84 Bottles of Beer\n" +
                "Take one down and pass it around, 83 Bottles of Beer on the Wall.\n" +
                "\n" +
                "83 Bottles of Beer on the Wall, 83 Bottles of Beer\n" +
                "Take one down and pass it around, 82 Bottles of Beer on the Wall.\n" +
                "\n" +
                "82 Bottles of Beer on the Wall, 82 Bottles of Beer\n" +
                "Take one down and pass it around, 81 Bottles of Beer on the Wall.\n" +
                "\n" +
                "81 Bottles of Beer on the Wall, 81 Bottles of Beer\n" +
                "Take one down and pass it around, 80 Bottles of Beer on the Wall.\n" +
                "\n" +
                "80 Bottles of Beer on the Wall, 80 Bottles of Beer\n" +
                "Take one down and pass it around, 79 Bottles of Beer on the Wall.\n" +
                "\n" +
                "79 Bottles of Beer on the Wall, 79 Bottles of Beer\n" +
                "Take one down and pass it around, 78 Bottles of Beer on the Wall.\n" +
                "\n" +
                "78 Bottles of Beer on the Wall, 78 Bottles of Beer\n" +
                "Take one down and pass it around, 77 Bottles of Beer on the Wall.\n" +
                "\n" +
                "77 Bottles of Beer on the Wall, 77 Bottles of Beer\n" +
                "Take one down and pass it around, 76 Bottles of Beer on the Wall.\n" +
                "\n" +
                "76 Bottles of Beer on the Wall, 76 Bottles of Beer\n" +
                "Take one down and pass it around, 75 Bottles of Beer on the Wall.\n" +
                "\n" +
                "75 Bottles of Beer on the Wall, 75 Bottles of Beer\n" +
                "Take one down and pass it around, 74 Bottles of Beer on the Wall.\n" +
                "\n" +
                "74 Bottles of Beer on the Wall, 74 Bottles of Beer\n" +
                "Take one down and pass it around, 73 Bottles of Beer on the Wall.\n" +
                "\n" +
                "73 Bottles of Beer on the Wall, 73 Bottles of Beer\n" +
                "Take one down and pass it around, 72 Bottles of Beer on the Wall.\n" +
                "\n" +
                "72 Bottles of Beer on the Wall, 72 Bottles of Beer\n" +
                "Take one down and pass it around, 71 Bottles of Beer on the Wall.\n" +
                "\n" +
                "71 Bottles of Beer on the Wall, 71 Bottles of Beer\n" +
                "Take one down and pass it around, 70 Bottles of Beer on the Wall.\n" +
                "\n" +
                "70 Bottles of Beer on the Wall, 70 Bottles of Beer\n" +
                "Take one down and pass it around, 69 Bottles of Beer on the Wall.\n" +
                "\n" +
                "69 Bottles of Beer on the Wall, 69 Bottles of Beer\n" +
                "Take one down and pass it around, 68 Bottles of Beer on the Wall.\n" +
                "\n" +
                "68 Bottles of Beer on the Wall, 68 Bottles of Beer\n" +
                "Take one down and pass it around, 67 Bottles of Beer on the Wall.\n" +
                "\n" +
                "67 Bottles of Beer on the Wall, 67 Bottles of Beer\n" +
                "Take one down and pass it around, 66 Bottles of Beer on the Wall.\n" +
                "\n" +
                "66 Bottles of Beer on the Wall, 66 Bottles of Beer\n" +
                "Take one down and pass it around, 65 Bottles of Beer on the Wall.\n" +
                "\n" +
                "65 Bottles of Beer on the Wall, 65 Bottles of Beer\n" +
                "Take one down and pass it around, 64 Bottles of Beer on the Wall.\n" +
                "\n" +
                "64 Bottles of Beer on the Wall, 64 Bottles of Beer\n" +
                "Take one down and pass it around, 63 Bottles of Beer on the Wall.\n" +
                "\n" +
                "63 Bottles of Beer on the Wall, 63 Bottles of Beer\n" +
                "Take one down and pass it around, 62 Bottles of Beer on the Wall.\n" +
                "\n" +
                "62 Bottles of Beer on the Wall, 62 Bottles of Beer\n" +
                "Take one down and pass it around, 61 Bottles of Beer on the Wall.\n" +
                "\n" +
                "61 Bottles of Beer on the Wall, 61 Bottles of Beer\n" +
                "Take one down and pass it around, 60 Bottles of Beer on the Wall.\n" +
                "\n" +
                "60 Bottles of Beer on the Wall, 60 Bottles of Beer\n" +
                "Take one down and pass it around, 59 Bottles of Beer on the Wall.\n" +
                "\n" +
                "59 Bottles of Beer on the Wall, 59 Bottles of Beer\n" +
                "Take one down and pass it around, 58 Bottles of Beer on the Wall.\n" +
                "\n" +
                "58 Bottles of Beer on the Wall, 58 Bottles of Beer\n" +
                "Take one down and pass it around, 57 Bottles of Beer on the Wall.\n" +
                "\n" +
                "57 Bottles of Beer on the Wall, 57 Bottles of Beer\n" +
                "Take one down and pass it around, 56 Bottles of Beer on the Wall.\n" +
                "\n" +
                "56 Bottles of Beer on the Wall, 56 Bottles of Beer\n" +
                "Take one down and pass it around, 55 Bottles of Beer on the Wall.\n" +
                "\n" +
                "55 Bottles of Beer on the Wall, 55 Bottles of Beer\n" +
                "Take one down and pass it around, 54 Bottles of Beer on the Wall.\n" +
                "\n" +
                "54 Bottles of Beer on the Wall, 54 Bottles of Beer\n" +
                "Take one down and pass it around, 53 Bottles of Beer on the Wall.\n" +
                "\n" +
                "53 Bottles of Beer on the Wall, 53 Bottles of Beer\n" +
                "Take one down and pass it around, 52 Bottles of Beer on the Wall.\n" +
                "\n" +
                "52 Bottles of Beer on the Wall, 52 Bottles of Beer\n" +
                "Take one down and pass it around, 51 Bottles of Beer on the Wall.\n" +
                "\n" +
                "51 Bottles of Beer on the Wall, 51 Bottles of Beer\n" +
                "Take one down and pass it around, 50 Bottles of Beer on the Wall.\n" +
                "\n" +
                "50 Bottles of Beer on the Wall, 50 Bottles of Beer\n" +
                "Take one down and pass it around, 49 Bottles of Beer on the Wall.\n" +
                "\n" +
                "49 Bottles of Beer on the Wall, 49 Bottles of Beer\n" +
                "Take one down and pass it around, 48 Bottles of Beer on the Wall.\n" +
                "\n" +
                "48 Bottles of Beer on the Wall, 48 Bottles of Beer\n" +
                "Take one down and pass it around, 47 Bottles of Beer on the Wall.\n" +
                "\n" +
                "47 Bottles of Beer on the Wall, 47 Bottles of Beer\n" +
                "Take one down and pass it around, 46 Bottles of Beer on the Wall.\n" +
                "\n" +
                "46 Bottles of Beer on the Wall, 46 Bottles of Beer\n" +
                "Take one down and pass it around, 45 Bottles of Beer on the Wall.\n" +
                "\n" +
                "45 Bottles of Beer on the Wall, 45 Bottles of Beer\n" +
                "Take one down and pass it around, 44 Bottles of Beer on the Wall.\n" +
                "\n" +
                "44 Bottles of Beer on the Wall, 44 Bottles of Beer\n" +
                "Take one down and pass it around, 43 Bottles of Beer on the Wall.\n" +
                "\n" +
                "43 Bottles of Beer on the Wall, 43 Bottles of Beer\n" +
                "Take one down and pass it around, 42 Bottles of Beer on the Wall.\n" +
                "\n" +
                "42 Bottles of Beer on the Wall, 42 Bottles of Beer\n" +
                "Take one down and pass it around, 41 Bottles of Beer on the Wall.\n" +
                "\n" +
                "41 Bottles of Beer on the Wall, 41 Bottles of Beer\n" +
                "Take one down and pass it around, 40 Bottles of Beer on the Wall.\n" +
                "\n" +
                "40 Bottles of Beer on the Wall, 40 Bottles of Beer\n" +
                "Take one down and pass it around, 39 Bottles of Beer on the Wall.\n" +
                "\n" +
                "39 Bottles of Beer on the Wall, 39 Bottles of Beer\n" +
                "Take one down and pass it around, 38 Bottles of Beer on the Wall.\n" +
                "\n" +
                "38 Bottles of Beer on the Wall, 38 Bottles of Beer\n" +
                "Take one down and pass it around, 37 Bottles of Beer on the Wall.\n" +
                "\n" +
                "37 Bottles of Beer on the Wall, 37 Bottles of Beer\n" +
                "Take one down and pass it around, 36 Bottles of Beer on the Wall.\n" +
                "\n" +
                "36 Bottles of Beer on the Wall, 36 Bottles of Beer\n" +
                "Take one down and pass it around, 35 Bottles of Beer on the Wall.\n" +
                "\n" +
                "35 Bottles of Beer on the Wall, 35 Bottles of Beer\n" +
                "Take one down and pass it around, 34 Bottles of Beer on the Wall.\n" +
                "\n" +
                "34 Bottles of Beer on the Wall, 34 Bottles of Beer\n" +
                "Take one down and pass it around, 33 Bottles of Beer on the Wall.\n" +
                "\n" +
                "33 Bottles of Beer on the Wall, 33 Bottles of Beer\n" +
                "Take one down and pass it around, 32 Bottles of Beer on the Wall.\n" +
                "\n" +
                "32 Bottles of Beer on the Wall, 32 Bottles of Beer\n" +
                "Take one down and pass it around, 31 Bottles of Beer on the Wall.\n" +
                "\n" +
                "31 Bottles of Beer on the Wall, 31 Bottles of Beer\n" +
                "Take one down and pass it around, 30 Bottles of Beer on the Wall.\n" +
                "\n" +
                "30 Bottles of Beer on the Wall, 30 Bottles of Beer\n" +
                "Take one down and pass it around, 29 Bottles of Beer on the Wall.\n" +
                "\n" +
                "29 Bottles of Beer on the Wall, 29 Bottles of Beer\n" +
                "Take one down and pass it around, 28 Bottles of Beer on the Wall.\n" +
                "\n" +
                "28 Bottles of Beer on the Wall, 28 Bottles of Beer\n" +
                "Take one down and pass it around, 27 Bottles of Beer on the Wall.\n" +
                "\n" +
                "27 Bottles of Beer on the Wall, 27 Bottles of Beer\n" +
                "Take one down and pass it around, 26 Bottles of Beer on the Wall.\n" +
                "\n" +
                "26 Bottles of Beer on the Wall, 26 Bottles of Beer\n" +
                "Take one down and pass it around, 25 Bottles of Beer on the Wall.\n" +
                "\n" +
                "25 Bottles of Beer on the Wall, 25 Bottles of Beer\n" +
                "Take one down and pass it around, 24 Bottles of Beer on the Wall.\n" +
                "\n" +
                "24 Bottles of Beer on the Wall, 24 Bottles of Beer\n" +
                "Take one down and pass it around, 23 Bottles of Beer on the Wall.\n" +
                "\n" +
                "23 Bottles of Beer on the Wall, 23 Bottles of Beer\n" +
                "Take one down and pass it around, 22 Bottles of Beer on the Wall.\n" +
                "\n" +
                "22 Bottles of Beer on the Wall, 22 Bottles of Beer\n" +
                "Take one down and pass it around, 21 Bottles of Beer on the Wall.\n" +
                "\n" +
                "21 Bottles of Beer on the Wall, 21 Bottles of Beer\n" +
                "Take one down and pass it around, 20 Bottles of Beer on the Wall.\n" +
                "\n" +
                "20 Bottles of Beer on the Wall, 20 Bottles of Beer\n" +
                "Take one down and pass it around, 19 Bottles of Beer on the Wall.\n" +
                "\n" +
                "19 Bottles of Beer on the Wall, 19 Bottles of Beer\n" +
                "Take one down and pass it around, 18 Bottles of Beer on the Wall.\n" +
                "\n" +
                "18 Bottles of Beer on the Wall, 18 Bottles of Beer\n" +
                "Take one down and pass it around, 17 Bottles of Beer on the Wall.\n" +
                "\n" +
                "17 Bottles of Beer on the Wall, 17 Bottles of Beer\n" +
                "Take one down and pass it around, 16 Bottles of Beer on the Wall.\n" +
                "\n" +
                "16 Bottles of Beer on the Wall, 16 Bottles of Beer\n" +
                "Take one down and pass it around, 15 Bottles of Beer on the Wall.\n" +
                "\n" +
                "15 Bottles of Beer on the Wall, 15 Bottles of Beer\n" +
                "Take one down and pass it around, 14 Bottles of Beer on the Wall.\n" +
                "\n" +
                "14 Bottles of Beer on the Wall, 14 Bottles of Beer\n" +
                "Take one down and pass it around, 13 Bottles of Beer on the Wall.\n" +
                "\n" +
                "13 Bottles of Beer on the Wall, 13 Bottles of Beer\n" +
                "Take one down and pass it around, 12 Bottles of Beer on the Wall.\n" +
                "\n" +
                "12 Bottles of Beer on the Wall, 12 Bottles of Beer\n" +
                "Take one down and pass it around, 11 Bottles of Beer on the Wall.\n" +
                "\n" +
                "11 Bottles of Beer on the Wall, 11 Bottles of Beer\n" +
                "Take one down and pass it around, 10 Bottles of Beer on the Wall.\n" +
                "\n" +
                "10 Bottles of Beer on the Wall, 10 Bottles of Beer\n" +
                "Take one down and pass it around, 9 Bottles of Beer on the Wall.\n" +
                "\n" +
                "9 Bottles of Beer on the Wall, 9 Bottles of Beer\n" +
                "Take one down and pass it around, 8 Bottles of Beer on the Wall.\n" +
                "\n" +
                "8 Bottles of Beer on the Wall, 8 Bottles of Beer\n" +
                "Take one down and pass it around, 7 Bottles of Beer on the Wall.\n" +
                "\n" +
                "7 Bottles of Beer on the Wall, 7 Bottles of Beer\n" +
                "Take one down and pass it around, 6 Bottles of Beer on the Wall.\n" +
                "\n" +
                "6 Bottles of Beer on the Wall, 6 Bottles of Beer\n" +
                "Take one down and pass it around, 5 Bottles of Beer on the Wall.\n" +
                "\n" +
                "5 Bottles of Beer on the Wall, 5 Bottles of Beer\n" +
                "Take one down and pass it around, 4 Bottles of Beer on the Wall.\n" +
                "\n" +
                "4 Bottles of Beer on the Wall, 4 Bottles of Beer\n" +
                "Take one down and pass it around, 3 Bottles of Beer on the Wall.\n" +
                "\n" +
                "3 Bottles of Beer on the Wall, 3 Bottles of Beer\n" +
                "Take one down and pass it around, 2 Bottles of Beer on the Wall.\n" +
                "\n" +
                "2 Bottles of Beer on the Wall, 2 Bottles of Beer\n" +
                "Take one down and pass it around, 1 Bottle of Beer on the Wall.\n" +
                "\n" +
                "1 Bottle of Beer on the Wall, 1 Bottle of Beer\n" +
                "Take it down and pass it around, No More Bottles of Beer on the Wall.\n" +
                "\n" +
                "No More Bottles of Beer on the Wall, No More Bottles of Beer\n" +
                "Go to the store and buy some more, 99 Bottles of Beer on the Wall.\n\n";

        assertEquals(song, bottleSong.singWholeSong());
    }
}

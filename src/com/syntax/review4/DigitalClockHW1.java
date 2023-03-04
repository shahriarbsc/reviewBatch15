package com.syntax.review4;

public class DigitalClockHW1 {
    public static void main(String[] args) {

/*
        // HW Create a digital Clock
        // it should start printing 00:00 and end 23:59


        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 3; j++) {

                for (int k = 0; k <= 5; k++) {

                    for (int l = 0; l <= 9; l++) {
                        System.out.println(i + "" + j + " : " + k + "" + l);
                    }
                }

            }

        }

        System.out.println("*******************************"); */

        for (int hours = 0; hours < 24; hours++) {

            for (int minutes = 0; minutes < 60; minutes++) {
                for (int seconds = 0; seconds < 60; seconds++) {

                    System.out.println(hours + " : " + minutes + " : " + seconds);
                }

            }

        }

    }
}

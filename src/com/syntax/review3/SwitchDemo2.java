package com.syntax.review3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {

     /*
     using scanner ask user to enter browser
     based on the browser--> execute code

      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your favourite browser");
        String browser = scan.nextLine();

        switch (browser.toUpperCase()) {

            case "chrome":
                System.out.println("Test case executed in " + browser);
                break;
            case "safari":
                System.out.println("Test case executed in " + browser);
                break;
            case "microsoft edge":
                System.out.println("Test case executed in " + browser);
                break;

            default:
                System.out.println("Browser is unknown- no execution");
        }

    }
}

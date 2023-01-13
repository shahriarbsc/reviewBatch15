package com.syntax.review3;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean loginButtonDisplayed =true;

        boolean loginButtonClickable =false;


if(loginButtonDisplayed && loginButtonClickable){


    System.out.println("Test case is passed");
} else {

    System.out.println("Test case failed");
}
        System.out.println("******************************************");

boolean dashboard=false;
String message="Welcome admin";

if(dashboard || message.equals("Welcome admin")) { // true + true = true // false + true = true // false+false=false

    System.out.println("User is successfully logged in");
}else {

    System.out.println("User is not logged in");
}

        System.out.println("*************LOGICAL NOT *************");

boolean b=true;

        System.out.println(!true); // false

boolean agreeCheckboxSelected=true;


// ! false = true
if(!agreeCheckboxSelected){

    System.out.println("I am clicking on checkbox");
}

        System.out.println("I am clicking on submit button");

boolean boo=!false;
        System.out.println(boo); // true


    }
}

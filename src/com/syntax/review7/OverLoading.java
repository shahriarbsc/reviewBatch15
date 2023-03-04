package com.syntax.review7;
public class OverLoading {

    private void hello() {

    }

    public static void main(String[] args) {
        System.out.println("Hello");

    }

    static void bye (){

        System.out.println("Bye");
    }
    static void bye (String name){

        System.out.println("Bye "+name);
    }
}

package com.syntax.review6;

public class Garden {


        void hello(){
            String name="Adem";
            System.out.println("Hello "+name);
        }

        public static void main(String[] args) {

            //static String str;
    //cannot use static for local variables

            //System.out.println(name); error;since


            Flower flower1 = new Flower();
        //Accesing variables of flower class

//NOTE: left side= declaration of the object and flower 1 is referencing variable name refer to the object.
        //right side=object declaration
        // word new is a key word.

        System.out.println(Flower.pretty); // correct way to accesing static variables
        flower1.name = "Hibiscus";
        flower1.color = "red";
        flower1.price = 5;
        flower1.pretty = false; // not the right way to access static variables but it is


        //System.out.println(flower1.pretty);
        System.out.println("Hibiscus pretty? " + flower1.price);

        //flower1.size= error since variables size does not exist

        //Accesing methods of flower class


        System.out.println("Creating second object of the flower class");

        flower1.bloom();
        flower1.grow();
        flower1.smell();

        Flower flower2 = new Flower();

        System.out.println("Roses are pretty " + flower2.price);

        flower2.name = "Rose";
        flower2.color = "blue";
        flower2.price = 15;
        flower2.price = 18;
//flower2.stinks error-since method is not defined

        Flower flower3 = new Flower();
//varaible i - is a local to its block of code-loop

            for (int i = 1; i < 3; i++) {
                System.out.println(i);
            }

          //  System.out.println(i); error- since i is not visible outside of the loop{}


    }
}

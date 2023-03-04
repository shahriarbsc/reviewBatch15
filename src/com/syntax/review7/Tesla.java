package com.syntax.review7;

public class Tesla extends Car {

    //Tesla is a subclass of Car
    //Car class is a superclass of Tesla

    String type;
    boolean autoPilot;

   public Tesla(String make, String model, int year, int horsePower, String type, boolean autoPilot) {
        super(make, model, year, horsePower);
        this.type = type;
        this.autoPilot = autoPilot;

    }

    public void haveAutoPilot(){


            System.out.println(make + " have auto pilot " + autoPilot);
        }

        public void start () {

            System.out.println(make + " starts automatically");
        }
    }
    // Overriding = is when we have same method name in 2 DIFFERENT class (Parent -child)
// in Overriding - INHERITENCE IS A MUST
// In Overriding method signature should be SAME




    package com.syntax.review7;

public class Car {
    protected String make, model;
    int year, horsePower;




    public Car(String make, String model) {  // 2 parameters
        this.make = make;
        this.model = model;

    }

   public Car(String make, String model, int year, int horsePower) {    //4 parameters
        this(make, model); // Parenthesis making call for constructors
        this.year = year;  // Accessing current class instances variables
        this.horsePower = horsePower;

    }

    public void start() {   //method no parameter

        System.out.println(make + " start");
    }

    public void drive(int speed) {

        System.out.println(make + " drives with speed " + speed);
    }

    // Same class have 2 or more methods with same name = Method overloading
    // * How to implement ?


    //1. by using diffrenet numbers of parameters
    //2. by using different type of meters
    //3.sequence

    protected String drive(String destination) {

        System.out.println(make + " drives to " + destination);

        return destination;
    }

    void drive(int speed, String destination) {

        System.out.println(make + " drive to " + destination + " with speed = " +speed);
    }

    public void drive(String destination, int speed) {

        System.out.println(make + " drive to " +destination+ " with speed = " +speed);

    }

    // am I overloading

   /*
    private void drive (int wheel) -- NO
    by changing access modifier we are not overloading


    String drive(String destination){  - NO
        return destination;

        we cannot overload methods by changing it is return type
        in overloading methods signature must be DIFFERENT
        method signature involves and name and parameter only!!!

        in overloading we do not care about return type (can be changed)
        or access modifieres ( can be different)

    }
   */


}

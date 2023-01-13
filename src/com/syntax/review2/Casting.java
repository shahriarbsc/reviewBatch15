package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {

        /* Casting - convert 1 datatype into another
        1.widening/implicit/automatic

        (byte-> short-> int-> float-> double)


        2. narrowing/ explicit / manual
        casting of primitive

        (double -> float-> long -> short -> byte)
         */
        //widening integer to double
     double d = 5;
        System.out.println(d); //5.0

//narrowing
//double into integer
int i=(int)5.0;
System.out.println(i);

//integer into byte

byte b=(byte)128;
        System.out.println(b);
//some information did not fit in



    }
}

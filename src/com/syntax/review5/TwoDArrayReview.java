package com.syntax.review5;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int[][] array = {

                {1, 2, 3},   //0
                {11, 12}, //1
                {20, 21, 22}, //2
                {100, 101} //3
        };

        // getting all values from 2D arrays using for loop

        for (int row = 0; row < array.length; row++) { // outer loops iterates over rows

            for (int col = 0; col < array[row].length; col++) { //iterates over each column

                // i want to print values only from odd rows

                if (row % 2 != 0) {


                    System.out.print(array[row][col]+" ");
                }

            }
            System.out.println();
        }
        System.out.println("----------------------------");

/*

        //getting all values from 2d array;

        for (int[] arr:array){ //iterates over arrays

            for(int num:arr){ // iterates over each element
}


                System.out.print(num+" ");
            }
            System.out.println();
        }






     /*




        int numberOfArrays = array.length;

        System.out.println(numberOfArrays);


        int numbersOfElementsIn1Array = array[0].length;
        System.out.println(numberOfElementsIn1Array);

        int numbersOfElementsIn1Array = array[0].length;
        System.out.println(numberOfElementsIn4Array);
*/
        }
    }

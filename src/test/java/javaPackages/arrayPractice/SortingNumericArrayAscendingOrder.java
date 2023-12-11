/*
   Author name: Shifat Jahan
   Date: 11/28/2023
   project: Sorting Numeric Array in AscendingOrder.
   Ascending order = starts from the smallest number then go to largest in order

   Numeric array that was given for the question: {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
   The output should look like = { 2,3,3,5,7,20,23,30,67,70,79}


 */



package javaPackages.arrayPractice;  // package name
import java.util.Arrays;

public class SortingNumericArrayAscendingOrder {  // class
    public static void main(String[] args) { // main method

        //Here I'm first creating array and assigned some random numbers
        int [] number = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2 };

        // This line Arrays is the class name .sort is method I import it , its a predefined in library
        // this will sort numbers.
        Arrays.sort(number);

        // doing for loop i = 0 ( index value starts from 0 and will go until 9)
        for (int i = 0; i < 9; i++){ // loop starts from here

            System.out.println(" " +number[i]); // printing number of array. will go i value each array to check and print.

        } // loop ending




    }
}

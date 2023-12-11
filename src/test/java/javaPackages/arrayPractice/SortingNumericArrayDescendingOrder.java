/*
    Author name: Shifat Jahan
   Date: 11/28/2023
   project: Sorting Numeric Array in DescendingOrder.
   Ascending order = starts from the largest number then go to smallest in order

   Numeric array that was given for the question: {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
   output = {  79 70 67 30 23 20 5 3 3 2}


 */


package javaPackages.arrayPractice; // package name
 import java.util.Arrays;

public class SortingNumericArrayDescendingOrder {  // class name

    public static void main(String[] args) {
        //Here I'm first creating array and assigned some random numbers
        int [] numbers = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2 };

        // This line Arrays is the class name .sort is method I import it , its a predefined in library
        // this will sort numbers.
        Arrays.sort(numbers);

        for (int i = 9; i >=0; i--) { // decrement, going yo index value starts 9-0 (noOfIndex 10.)

            System.out.print(" "+numbers[i]); // [i] going each index at a time and printing the value.

        }

    }
}

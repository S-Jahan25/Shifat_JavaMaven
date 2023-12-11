/*
      Shifat Jahan
      project : using array & loop how to find the sum and average.
 */

package javaPackages.arrayPractice;  // package
import java.util.Scanner;

public class ArraySumAndAverage {  // class

    public static void main(String[] args) {  // main method
        Scanner input = new Scanner(System.in);  // imported scanner for taking user import.
        int[] number = new int[4]; // created an array of 4 and int type data variables .
        int sum = 0;
        // taking 5 number from users
        System.out.print("Please Enter 4 numbers : ");

        /*
           this is with using array index

         */
        //  number[0] = input.nextInt();
        //  number[1] = input.nextInt();
        //  number[2] = input.nextInt();
        //   number[3] = input.nextInt();

        /*
            can get same result using for loop
            this loop is for taking input from user

         */
        for (int i = 0; i < 4; i++) { // loop will run
            number[i] = input.nextInt();

        }

        // sum = number[0] + number[1] + number[2] + number[3];  // adding all 4 numbers
        // System.out.println("The sum of all number is : "+sum);  // sum is printing
        /*
           using loop to find the same.
         */
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];


        }
        System.out.println("The sum is : "+sum);
        /*
            finding acerage
         */
        int avg = sum/ number.length;
        System.out.println("Average is : "+avg);

        // finding the maximum number

        int max = number[0];// initial max value for now 0
        for (int i = 1; i <4; i++){
            if(max<number[i]){
                max = number[i];
        }


        }
        System.out.println("Maximum = "+max);


    }
}
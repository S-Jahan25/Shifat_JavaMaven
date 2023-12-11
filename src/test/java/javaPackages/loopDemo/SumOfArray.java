
/*
Author name: Shifat Jahan
Date: 11/26/2023
project:
   consider an array of the following numbers
   25, 26, 28, 29, 30 35
   print the sum of even numbers only from the array elements



 */


package javaPackages.loopDemo;

public class SumOfArray {  // class name

    public void SumOfArrayNumbers(){  // created custom method

        // the question is asking I need to add the even number and get sum .

        int [] numbers = {25, 26, 28, 29, 30,35}; // last index is 5, total length is 6
        // this loop will run  6 times. starts from 0-5
        int sum = 0;

        for (int i = 0; i<6;i++){ // first it will be 0 , 1, 2, 3, 4, 5 it will print 6 times
            //   System.out.println("The value of i is " +i); // printing value of i
            if (numbers[i]%2 ==0){
                System.out.println(numbers[i]+" this is an even number");
                sum = sum + numbers[i]; // 26+ 0 = 26 first value of sum, 28+26 =
            }

        }
        System.out.println(sum);



    }

    public static void main(String[] args) {  // main method starts here

        SumOfArray obj = new SumOfArray();
        obj.SumOfArrayNumbers();
    }
}

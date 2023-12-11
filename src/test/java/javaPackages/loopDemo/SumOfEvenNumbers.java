/*
Author name : shifat jahan
Project:  write a program to  find the sum of 20-30
 */


package javaPackages.loopDemo;  // package name

public class SumOfEvenNumbers {  // class name

    public void sumofNumbers(){   // created a custom method
        int sum = 0;
        for (int i = 20;i<=30; i++){
            //System.out.println(i);
            sum = sum+i; // 20 is first value of sum, sum = 41, sum = 63,
            //  System.out.println(sum); // if I print here it will giving 1 by 1
        }
        System.out.println(sum); // if I print after the loop here it will give me just sum.




    }

    public static void main(String[] args) { // main method
        SumOfEvenNumbers obj = new SumOfEvenNumbers();  // created an obj of the class
        obj.sumofNumbers();  // calling the method.

    }

}

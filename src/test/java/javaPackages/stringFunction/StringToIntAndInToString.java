/*
    Author name: Shifat Jahan
    Project: StringToInt
 */

package javaPackages.stringFunction;  // package name

public class StringToIntAndInToString {  // class

    public static void stringToIntExample(){ // custom method

        //int a = 200;
        // System.out.println(a +100); // printing a int value
        // in java its a expections so we can not convert String / Name to int
        // numberFormat expections.



        String dollar = "200"; // 200 is string but will print 200.
        System.out.println(dollar+100); // string and int cant be added together.
        // to convert "200" string 200 to int 200
         int newDollar = Integer.valueOf(dollar);
        System.out.println(newDollar+100);

    }
     public static void intToStringExample(){  // custom static method

        int a = 200;
         System.out.println(a+300);
             String newValue = String.valueOf(a);
         System.out.println(newValue);
     }


    public static void main(String[] args) {  // main method.
        stringToIntExample();
        intToStringExample();


    }
}

/*
Author name: Shifat Jahan
Date: 11/25/2023

Project: Multiplication using parameter
 */

package javaPackages.javaVariableTypes;  // package name

public class ParameterDemo5Multiplication {  // class name

    public void multiply(int a, int b){// created a parameter and inside declared and initialized
        int total = a*b; // multiplying both values a & b
        System.out.println("My Total value is : "+total); // printing the total of a*b

    }

    public static void main(String[] args) { // main method starts here

        ParameterDemo5Multiplication obj = new ParameterDemo5Multiplication(); // created an object
        obj.multiply(73, 9); // calling the method and giving their value
        obj.multiply(6, 4); //calling the method and giving their value
        obj.multiply(8,30);// calling the method and giving their value



    }


}

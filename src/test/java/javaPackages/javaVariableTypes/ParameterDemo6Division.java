/*
Author name: Shifat Jahan
Date: 11/25/2023

Project: divisor using parameter
*/

package javaPackages.javaVariableTypes;  // package name

public class ParameterDemo6Division {  //Class name

    public void divide(int a, int b) {// created a parameter and inside declared and initialized
        int total = a / b; // dividing both values a & b
        System.out.println("My Total value is : " + total); // printing the total of a/b
    }

    public static void main(String[] args) { // main method starts here

        ParameterDemo6Division obj = new ParameterDemo6Division(); // created an object
        obj.divide(8, 2); // calling the method and giving their value
        obj.divide(10, 2); //calling the method and giving their value
        obj.divide(8,4);// calling the method and giving their value

    }

}

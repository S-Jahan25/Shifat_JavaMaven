/*

Author name: Shifat Jahan
Date: 11/25/2023

Project: subtraction using parameter
*/


package javaPackages.javaVariableTypes;  // package name

public class ParameterDemo4Subtraction {  // class name

    public void subtract(int a, int b){ // created a parameter and inside declared and initialized

        int total = a-b; // adding both values a & b
        System.out.println("My Total value is : "+ total); // printing the total of a-b

    }

    public static void main(String[] args) {  // main method
        ParameterDemo4Subtraction obj = new ParameterDemo4Subtraction(); // created an object
        obj.subtract(67, 7); // calling the method and giving their value
        obj.subtract(76, 4); //calling the method and giving their value
        obj.subtract(98,30);// calling the method and giving their value


    }

}

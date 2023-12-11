/*

Author name: Shifat Jahan
Date: 11/25/2023

Project: addition using parameter
 */


package javaPackages.javaVariableTypes;  // package name

public class ParameterDemo3Addition {  // class name

    //* This fucniton is used to add two numbers
    public void add(int a, int b){ // created a parameter and inside declared and initialized

        int total = a+b; // adding both values a & b
        System.out.println("My Total number is : "+ total); // printing the total of a+b

    }

    public static void main(String[] args) { // main method starts here

        ParameterDemo3Addition obj = new ParameterDemo3Addition(); // created an object
        obj.add(4, 7); // calling the method and giving their value
        obj.add(8, 4); //calling the method and giving their value
        obj.add(78,30);// calling the method and giving their value


    }

}

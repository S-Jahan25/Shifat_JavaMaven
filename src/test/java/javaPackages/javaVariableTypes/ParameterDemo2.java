
/*
Author name: Shifat Jahan
Date: 11/25/2023
 */

package javaPackages.javaVariableTypes;  // package name

public class ParameterDemo2 {  // class name


    public void add() { // created a custom method named add
        int a = 2; // declared & initialized the variable value of  a is 2 here.
        int b = 3; // declared & initialized the variable value of  b is 3 here.
        int total = a + b; // adding both together for total value.
        System.out.println(total); // printing the total value of both a & b
    }


    public void secondAdd(){ // created a custom method named secondadd
        int a = 20; // declared & initialized the variable value of  a is 20 here.
        int b = 50; // declared & initialized the variable value of  b is 50 here.
        int total = a + b; // adding both together
        System.out.println(total);
    }

    public void thirdAdd(){ // created a custom method named thirdadd
        int a = 40;// declared & initialized the variable value of  a is 40 here.
        int b = 60;// declared & initialized the variable value of  b is 60 here.
        int total = a + b;// adding both together.
        System.out.println(total); // printing total value after adding them both.


    }

    public static void main(String[] args) {  // main method starts here.

        // first I have to create the object of the class for to proper use and run,
        // my class name is parameterDemo2,so I have to put that first when I create an object.


        ParameterDemo2  obj = new ParameterDemo2();//  CREATED an object
        obj.add();  // calling my add method that I created custom.
        obj.secondAdd(); // calling my secondAdd method that I created customely.
        obj.thirdAdd();// calling my thirdAdd method that I created customely.

    }



}

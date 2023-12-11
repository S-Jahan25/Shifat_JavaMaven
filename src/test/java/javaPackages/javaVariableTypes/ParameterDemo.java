/*
Author name: Shifat Jahan
Date: 11/25/2023
 */

package javaPackages.javaVariableTypes;  // package name

public class ParameterDemo { // class name ParameterDemo

    // public void location (String location) = here is that method signature
    // (String location) = its parameter. inside of method signature I declared the location
    public void location(String location) { //creating custom method named location.

        //   String location = "Florida"; // declaring and initializing at the same time.
        System.out.println("My location is :"+ location); // will print florida.

    }

    public static void main(String[] args) {  // main method starts here.

        ParameterDemo obj1 = new ParameterDemo();// creating object here parameterDemo and obj is the reference variable here.
        obj1.location("Florida");
        System.out.println("----------------");

        ParameterDemo obj2 = new ParameterDemo();//creating object here parameterDemo and obj is the reference variable here
        obj2.location("Newyork");
        System.out.println("-------------");

        ParameterDemo obj3 = new ParameterDemo();//creating object here parameterDemo and obj is the reference variable here
        obj3.location("Dallas");



    }





}

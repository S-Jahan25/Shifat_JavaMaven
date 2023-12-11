/*
Author name: Shifat Jahan
Date: 11/25/2023

There are few Types of variables: instance, local variables, static, parameter.

Parts of variables: 1. variables type, name , values
* variables those declares into the method = local variables
* variables those declares into the class = instance variable/ global/ object variables.
*  instance/global/ object variables = can be use in any method
* local variable = can be only use inside of that own method. that variable born inside of the method and dies inside of the method.

 */

package javaPackages.javaVariableTypes;  // package name

public class LocalGlobal {  // LocalGlobal is  class name

    // batchNo and id : is my instance variables that I  declared .
    String name;
    int batchNo;
    int id;


    public void attendingCourse(){ // This is a custom method that I have created name attendingCourse.
        // course is my local variable
        String course; // course name is being declared locally
        course = "Selenium"; // course name is being initialized locally in the custom method.
        System.out.println("My course is "+ course); //here printing the course value.

        String name = "shifat"; // here is my name being initialized that I declared in the class which is my instance variables.
        System.out.println("My name is "+ name); // here is printing the value of name.

    }


    public void location(){ // here I created another custom method named location.
        String state = "Florida"; // here my location:state name being declared & initialized at the same time.
        System.out.println("My State name is "+ state);



    }

    public static void main(String[] args) {  // main method starts here.
        //  String location; // location is my local variables
        // If I need to run then I have to create an object first then call the method by their name.

        LocalGlobal obj1 = new LocalGlobal(); // here is creating an object and obj is my reference variables here
        obj1.name = "Shifat Jahan";
        obj1.batchNo = 7;
        System.out.println("My batch number is ");
        obj1.id = 3200;
        obj1.attendingCourse(); //  here I called the method name attendingCourse.
        obj1.location(); // here I called the method and name is location



    }


}

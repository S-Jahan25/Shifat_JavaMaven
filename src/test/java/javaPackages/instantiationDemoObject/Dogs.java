/*
Author name : Shifat Jahan
Date: 11/24/2023

 */

package javaPackages.instantiationDemoObject;  // package name

public class Dogs {  // class name . //here dogs is my class name
    //class can hold 2 things: properties and behaviors.

    // Declared variables // properties
    String name;
    String color;
    int age;
    String tail;
    byte eyes;

    public static void main(String[] args) { // main method / behaviors.

        Dogs doggy = new Dogs(); // creats objects for dog class
        doggy.name="Tom";
        doggy.color="Black";
        doggy.tail="long";
        doggy.eyes= 2;

        // printing their values.
        System.out.println(doggy.name);
        System.out.println(doggy.color);
        System.out.println(doggy.age);
        System.out.println(doggy.tail);
        System.out.println(doggy.eyes);


        Dogs petty = new Dogs();
        petty.name="petty";
        petty.color="Red";
        petty.tail="short";
        petty.eyes=2;

        System.out.println(petty.name);
        System.out.println(petty.color);


    }



}

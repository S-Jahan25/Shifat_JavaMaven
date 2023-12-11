/*
Author: Shifat Jahan
Date: 11/25/2023
project: Biodata of shifat : Taking input from the user by using Scanner.
 */


package javaPackages.scannerDemo;  // package name
import java.util.Map;
import  java.util.Scanner; // scanner imported from java library

public class ShifatsBio {  // class name // class name ShifatsBio.

    public void ShifatsBiodata(){  //created custom method

        Scanner scan = new Scanner(System.in); // it will scan / taking input from user.

        System.out.println("Please Enter your name here:  "); // asking user enter their name
        String name = scan.nextLine(); // taking the input from user and strong the value
        System.out.println("You name is : "+ name ); // printing the value what the user input.

        System.out.println("what is your favorite hobby name ?");
        String name2 = scan.nextLine();
        System.out.println("Your favorite hobby name is :"+ name2);

        System.out.println("what is the color of your car ?");
        String name3 = scan.nextLine();
        System.out.println("Your car name is :"+ name3);

        System.out.println("How old are you?");
        byte age = scan.nextByte();
        System.out.println("You are "+age+" years old.");

        System.out.println("What is you home zipCode");
        int zipCode = scan.nextInt();
        System.out.println("Your home zipcode is :"+zipCode);

        System.out.println("How much balance you have in the card?");
        float userInput = scan.nextFloat();
        System.out.println("Your balance is "+userInput);


    }

    public static void main(String[] args) { // main method
        ShifatsBio obj = new ShifatsBio(); // created an new object for calling my method .
        obj.ShifatsBiodata(); // calling my custom method .

    }

}

/*
Author: Shifat Jahan
Date: 11/25/2023
project: Taking input from the user by using Scanner.

 */


package javaPackages.scannerDemo;  // package name
import java.util.Scanner;  // import it from the library


public class ScannerPractice {  // class name


    public void shifatScanner(){ // created custom method named myScanner.
        Scanner scan = new Scanner(System.in); //
        System.out.println("Please Enter a number for a ");
        int a = scan.nextInt(); // taking Integer value from users.
        System.out.println("The number of a is : "+ a);

        System.out.println("Please Enter a number for b");
        int b = scan.nextInt();
        System.out.println("The number of b is : "+ b);
        //scan.nextInt(); // taking input from user integer value.
        // scan.nextLine(); // taking input from user string value
        //  scan.nextByte(); // taking input from user byte value
        //  scan.nextFloat(): // taking input from user decimal  value
        int total = a+b;
        System.out.println("The total of a+b is = "+ total);
        System.out.println("My Daughter name is Aaliyah");

    }

    public static void main(String[] args) { // main method

        //  creating an object of the method for calling them
        ScannerPractice obj = new ScannerPractice();
        obj.shifatScanner(); // calling the objects from the method.

    }

}

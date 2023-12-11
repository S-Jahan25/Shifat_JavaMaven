/*
 Author Name: Shifat Jahan
 Date: 11/22/2023
 Class: Java DataType & variables.
 */


package javaPackages.javaVariableTypes;  // package name

public class VariablesTypes {  // class name
    //variable is a place holder. inside of variables we can store numbers,boolean value and characters.
    /* There are three types of variables:
    1. Instance/Global Variables = the variables declares inside the class is called Instance variables
    2. Local Variables = The variables declare inside the method, are called local variables.Local variables
       born inside the method and die inside the method.
    3. Static Variables/ methods -- static variables belongs to the class.This is called class variable.
       static variables we create when we see the variable/ variables are common to all objects.
    */
    Byte age = 100;// we declare the variable and initialize/define the variable
    Short checkingAccount; // we declare the variable


    public void study () { // custom function--Method can Hold Variables, statements
        System.out.println(age);
        checkingAccount = 32767; // initialize/ define the variable
        System.out.println(checkingAccount);
        boolean snoringInTheClass;
        snoringInTheClass = true;
    }

    public static void main(String[] args) {  // main method starts here.
        String name = "My name is Shifat Jahan";
        System.out.println(name);

        System.out.println("-------------");
        //example of integer variable.
        int x; // here I declared
        x = 85; // here assigning the value of x
        System.out.println(x); //This now will print the value of x.
        // or I can write all together same time
        int b = 24; //this will give declare and initialization.
        System.out.println("My number is: "+b); //This now will print the value of b along with printing something is "+b.


    }


}

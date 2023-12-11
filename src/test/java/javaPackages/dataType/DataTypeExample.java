/*
 Author Name: Shifat Jahan
 Date: 11/22/2023
 Class: Java DataType
 */


package javaPackages.dataType; // package name.

public class DataTypeExample {  //DataTypeExample is the class name.
     /*
    byte = stores whole numbers from -128 to 127
    short = stores whole numbers from -32,768 to 37,767
    int = stores whole numbers from -2,134,123,233, to 4,432,543,465
    long = stores whole numbers from -9,654,876,876,654,877,094 to 9,654,876,876,654,877,094
    float = stores fractional numbers 6 to 7 decimal numbers
    double = stores fractional numbers. 15 decimal numbers
    boolean = stores true or false values
    char = stores a single character 'a' single ''
     */

    public static void main(String[] args) { // here is the main method starts.

        // primitive (old ) data type.

        byte age = 115;
        System.out.println(age); // for print the age value.
        System.out.println(" short type number:");
        short myId = 32004;
        System.out.println(myId);
        System.out.println("integer type number:");
        int myScore = 654754789;
        System.out.println(myScore);
        System.out.println("long type number");
        long monthlyBills = 5673763489876546789l;
        System.out.println(monthlyBills);

        System.out.println("float type number");
        float myHeight = 5.887654f;
        System.out.println(myHeight);
        System.out.println("double type number");
        double bankBalance = 209.98754367896543;
        System.out.println(bankBalance);
        System.out.println("boolean statements");
        boolean isFemale = true;
        System.out.println(isFemale);
        System.out.println("char type data");
        char myInitial = 's';
        System.out.println(myInitial);

        // Non-primitive data type
        System.out.println("string type data:");
        String myName = "Shifat Jahan"; //String starts with upper case.
        System.out.println(myName);



    }




}

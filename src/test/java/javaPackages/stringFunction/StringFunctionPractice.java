/*
    Author name: Shifat Jahan
    Project: Use of StringFunction method and practice
    * String = a reference data type that can store one or more characters
    //              reference data type have access to useful methods.
        * String is Sequence of character.

    examples of :
     1. .equals & .equaalsIgnoreCase = boolean value
     2.   Example: How to use .length
                .length will find how many character is this string has
                length = starts from 1.
                length = int data type

       3.  Example: How to use
                    charAt = it will return index value.
                    index = counts from 0.
        4.  indexOf = will find what number of position is the letter at
        5. .isEmpty = boolean data type . will find if the string is empty of not.

 */


package javaPackages.stringFunction;  // package name

public class StringFunctionPractice {  // class name

    // this is the static custom method. when its static we don't need to create an object for calling from main method.
    public static void safasShoppingList() {

        // created a string .
        String safasShoppingList = "Safa needs puree of sweet potatoes, pumkin, Apple sauce, diapers";

        /*
        Example: how to use .equals.
        and .equalsIgnoreCse = will igore case sensetive issue like uppercase and lower case.

        .equal will check for if my original string and this string are exactly same of not
        .equal is boolean data type and it will retuen true & false.

         */
        boolean result = safasShoppingList.equals("Safa needs puree of sweet potatoes, pumkin, Apple sauce, diapers");
        System.out.println("Both string is equal : " + result); // this will print either two string are same or not true/false value

        boolean result2 = safasShoppingList.equals("Safa doesnt wants to eat");

        System.out.println("The original string and this string not same so the result is : " + result2);

        // equalsIgnoreCase will ignore the upper case and lower case.
        boolean result3 = safasShoppingList.equalsIgnoreCase("SAFA needs puree of sweet potatoes, pumkin, Apple sauce, diapers");
        // this will print true and ignore the upper and lower case.
        System.out.println("The result is true even few letter at upper case but .equalsIgnore will ignore the casesensetive part: " + result3);

            /*
                Example: How to use .length
                .length will find how many character is this string has
                length = starts from 1.
                length = int data type
             */
        int sizeOftheFullString = safasShoppingList.length(); // this line will print how many letters are in the string
        System.out.println("The size of full String is : " + sizeOftheFullString); // print total letters.

             /*
                    Example: How to use
                    charAt = it will return index value.
                    index = counts from 0.
              */
        char sizeOfIndexValue = safasShoppingList.charAt(11); // this will print letter p .
        System.out.println(sizeOfIndexValue + " is printing because its at 11 number index ");

           /*
                    Example: How to use
                    .isEmpty = this will check if true/false boolean value if the string is empty or not.
              */
        boolean ifTheStringisEmpty = safasShoppingList.isEmpty();
        System.out.println("The string is not empty " + ifTheStringisEmpty);


    }



             public static void main(String[] args) {
                    safasShoppingList();
            }



     }


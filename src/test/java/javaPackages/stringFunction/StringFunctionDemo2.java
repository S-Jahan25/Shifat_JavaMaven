/*
Author: shifat jahan
Project: more example of how to use stringfunction. without creating an object.

 */


package javaPackages.stringFunction; // package.

public class StringFunctionDemo2 { // class

    public static void StringDemo2 () {  // created custom static method. so i dont have to create obj in the main

        // this is one way of writing string function with creating objet
        // String obj = new String("I love to travel because I enjoy it");

        // // this is one way of writing string function without creating objet
        String firstString = "I love to travel because I enjoy it";
       String upperCase = firstString.toUpperCase(); // this will print all in uper case. uppercase is String type data.
        System.out.println(upperCase);

        String lowerCse = firstString.toLowerCase(); // will print all lowercase. String type data is loLowercase.
        System.out.println(lowerCse); // will print all lowercase.

        int length = firstString.length(); // this will count on the string length . how many letters.
        System.out.println(length); // printing how many letters are there in the string.

        char firstletter = firstString.charAt(0);
        System.out.println(firstletter); // this will print I

        /*
             Length always one more than index. index starts with 0 and length starts with 1.

           to get a word from the string have to use substring then index number .
         */
        String oneWord = firstString.substring(2, 6); // substring starts with 0 and ends with index+1 . will print love.
        System.out.println(oneWord); // this will print word love from the whole string

        // contains is boolean/ true false value holding
        boolean loveWord = firstString.contains("love"); // this will give me either love word is there or not
        System.out.println(loveWord);

        boolean safaWord = firstString.contains("safa"); // this will give true/false either safa word is there or not.
        System.out.println(safaWord);




    }

    public static void main(String[] args) {  // main method.
        // here im calling my static method without creating obj of the method since its static.
        StringDemo2();


    }



}

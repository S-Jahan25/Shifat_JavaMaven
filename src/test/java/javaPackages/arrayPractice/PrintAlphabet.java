/*
Author name : Shifat Jahan
Date: 11/ 28/2023
project: This program will print all English Alphabet in lower case and upper case a-z & A-Z
 */


package javaPackages.arrayPractice;  // package

public class PrintAlphabet {  // class
    public static void main(String[] args) {

        char alphabet;   // here I used char for getting character type data. declared.

        for (alphabet = 'a'; alphabet <= 'z'; ++alphabet) { // here using for loop ,starts from a and go until z with pree increment order.

            System.out.print(alphabet + " "); // printing all

        }

        System.out.println("-----------");
        for (alphabet = 'A'; alphabet <= 'Z'; ++alphabet) {
            System.out.println(alphabet);


        }


    }

}

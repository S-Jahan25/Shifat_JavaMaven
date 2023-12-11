/*
     Autor name : Shifat Jahan
     Date: 11/28/2023
     Project: Checking vowels in the name/ string

     How this program will work: This program first take a string / name variable and
     then by loop and if statements it will check if inside of  name/ sting has any vowel it
     will print those vowel.
 */


package javaPackages.loopDemo;  // package name
import java.util.Locale;

public class CheckVowel {  // class name is CheckVowel

    public static void main(String[] args) {  // main method

        String name = "Shifat jahan"; // declared and initialized my string type variable here.


        //This is  a pre-defined in library that I import for lower case.
        name = name.toLowerCase(); // here I used this for to convert the name variable to lower case

        System.out.println("Vowels in the name are: "); // printing the Vowels in the name

        // using for loop here:
        for (int i = 0; i < name.length(); i++){ // here this line will iterates inside of// ecah character of the name.

            char shifatjahan = name.charAt(i); // going to the current index and check then go next

            // This line is check if the current character is vowel or not by putting if statements.
            if (shifatjahan == 'a' || shifatjahan == 'e' || shifatjahan == 'i' || shifatjahan == 'o' || shifatjahan == 'u') {

                System.out.println(shifatjahan + " "); // This line will print if any vowels found within the name.
            }
        }








    }



}

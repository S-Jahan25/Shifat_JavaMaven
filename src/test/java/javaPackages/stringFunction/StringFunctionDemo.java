/*
    Author name: Shifat Jahan
    project : StringFunction

     /* String is a class. non primitive data type.  when theres a class there is an object . no class no obj
    * Java is not 100% object oriented programing. primitive data type
    * int = a , int is not a class int is a variable .

 */


package javaPackages.stringFunction;   // package name

public class StringFunctionDemo {  // class name



    public static void main(String[] args) {
        String obj = new String("Shifat"); // created obj of the string

        char firstLetter = obj.charAt(0); // it will give s . going by index so start with 0. we keep char in char type data.
        System.out.println(firstLetter);

        int length = obj.length(); // we keep length in int data type . this will go to each letter to count each character.
        System.out.println(length); // this will print how many character in my string.

       String lower =  obj.toLowerCase(); // toLowercase we keep in string data type. This will make all my string in the lowercase.
        System.out.println(lower);  // will print all my string in lowercase.

        String upper = obj.toUpperCase(); // string type data toUppercase. it will make the whole string to upper case.
        System.out.println(upper); // print full string in upper case.

       String newSpelling =  obj.replace( 'i', 'e'); // replace is String type data.i will replace with e.
        System.out.println(newSpelling);

        String fullName = obj.concat(" Jahan"); // concat means to add something in the string. and its string type data
        System.out.println(fullName);

        // one string can be inside of string but more than one needs an array

       String[]twoNames =  fullName.split(" "); // this will split name
        System.out.println(twoNames[0]); // will print one name shifat
        System.out.println(twoNames[1]); // will print jahan




    }

}

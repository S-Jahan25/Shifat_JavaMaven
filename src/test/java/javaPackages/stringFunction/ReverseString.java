/*
    Author name : Shifat Jahan
    Project: Reverse string
 */

package javaPackages.stringFunction;  // package

public class ReverseString {  // class

    public static void revereString(){  // custom method

        // one way to reverse String .

        String name = "Shifat";   // if I reverse then it will be tafihS

        for (int i = name.length()-1 ; i>0; i--){  // index always 1 less than length that's why used -1
            System.out.print(name.charAt(i));

        }
        System.out.println("-----------");

    }


        /*
          Another way of reversing String.
         */
       public static void reverString2(){
           String name = "Shifat Jahan";
           String reverse = "";
           for (int i = name.length()-1; i>=0; i--){
               reverse = reverse +name.charAt(i); // String + char = String
           }
           System.out.println(reverse);
       }




    public static void main(String[] args){ // main method.
        revereString();  // calling the static method that I created.
        reverString2();



    }

}

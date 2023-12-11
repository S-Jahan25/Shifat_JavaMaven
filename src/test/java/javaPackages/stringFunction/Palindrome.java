/*
    Author name : Shifat
    Project: palindrome= when reverse its pronunce same. if I opossite its same thing.
 */

package javaPackages.stringFunction;  // package

public class Palindrome {  //class


    public static void palindromeExample(){  // custom function
        String name = "level";
        String reverse = "";

        for (int i = name.length()-1; i>=0; i--){
            reverse = reverse +name.charAt(i);

        }
        System.out.println(reverse);
        if (reverse.equals(name)){
            System.out.println("level is palindrome");
        }
            else {
            System.out.println("level is not palindrome");
        }
    }

      public static void palindrome2(){
          String name = "Shifat";
          String reverse = "";

          for (int i = name.length()-1; i>=0; i--){
              reverse = reverse +name.charAt(i);

          }
          System.out.println(reverse);
          if (reverse.equals(name)){
              System.out.println("Shifat is palindrome");
          }
          else {
              System.out.println("Shifat is not palindrome");
          }
      }


    public static void main(String[] args) {  // main method
        palindromeExample(); // calling function
        palindrome2();

    }
}

/*
  Author name: Shifat Jahan
  Date: 11/30/2023

 */

package javaPackages.instantiationDemoObject;  // package name

public class Cats {  // class name

   //  variable declared here but not given the value yet.
    String name;
    String color;
    String size;
    String Eyes;
    String Tail;

    public static void main(String[] args) { // main method
        Cats myCat = new Cats();// created an object of the class.
        //  declared variable and given value

        myCat.name = "kitty";
        myCat.color = "gray";
        myCat.size = "small";
        myCat.Eyes = "dark brown";
        myCat.Tail = "long";

        // printing the value
        System.out.println(myCat.name);
        System.out.println(myCat.color);
        System.out.println(myCat.size);
        System.out.println(myCat.Eyes);
        System.out.println(myCat.Tail);

        System.out.println("------------------");

        // printing the value using sout.

        Cats safasCat = new Cats();// created an object of the class.
        safasCat.name = "jerry";
        safasCat.color = "white and black";
        safasCat.size = "medium";
        safasCat.Eyes = "black";
        safasCat.Tail = "medium";

        System.out.println(safasCat.name);
        System.out.println(safasCat.color);
        System.out.println(safasCat.size);
        System.out.println(safasCat.Eyes);
        System.out.println(safasCat.Tail);

    }



}

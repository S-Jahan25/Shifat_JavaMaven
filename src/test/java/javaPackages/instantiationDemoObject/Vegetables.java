/*
Author name : Shifat Jahan
Date: 11/25/2023
project: how to create an object and calling them from main method
 */


package javaPackages.instantiationDemoObject; // package name



public class Vegetables {  // class
    // variables  declared but not given vaue yet

    String name;
    String Color;
    String Size;
    String Vitamin;
    String Nutrition;
    String type;

    public static void main(String[] args) {  // main method

        // to create an object of the class first use name of the class the referance variable in this case broccoli
        // then = new again class name.

        Vegetables broccoli = new Vegetables(); // created an object of the class.
        broccoli.name = "Broccoli";
        broccoli.Color = "dark green";
        broccoli.Size = "small";
        broccoli.Vitamin = "c";
        broccoli.Nutrition = "Potassium";


       // printing them:
        System.out.println(broccoli.name);
        System.out.println(broccoli.Color);
        System.out.println(broccoli.Size);
        System.out.println(broccoli.Nutrition);

        System.out.println("----------------");


        Vegetables lettuce = new Vegetables(); // created an object of the class.
        lettuce.name = "roman lettuce";
        lettuce.Color = "pale green";
        lettuce.Size = "Long";
        lettuce.Vitamin = " a, b, c, k";
        lettuce.Nutrition = "Potassium";

        //printing values
        System.out.println(lettuce.name);
        System.out.println(lettuce.Color);
        System.out.println(lettuce.Size);
        System.out.println(lettuce.Vitamin);
        System.out.println(lettuce.Nutrition);
        System.out.println(" my name is shifat");

        System.out.println("This is gitgub");
    }


}

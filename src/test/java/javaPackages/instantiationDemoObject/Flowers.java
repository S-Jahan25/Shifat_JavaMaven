package javaPackages.instantiationDemoObject;  // package name

public class Flowers {  // class name


    String name;
    String Color;
    String Size;


    public static void main(String[] args) {  // main method

        Flowers Rose = new Flowers();  // created obj of the class
        Rose.name = "Red Rose";
        System.out.println(Rose.name);
        Rose.Color = "Dark red";
        System.out.println(Rose.Color);
        Rose.Size = "Small";
        System.out.println(Rose.Size);



    }
}

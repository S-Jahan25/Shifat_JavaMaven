


package oop.polymorphismDemo;  // package name

public class MethodOverridingExample2 extends MethodOverridingExample{  // extending methodOverridingexample class (parent)



    // name, age. displayInformation getting from parents class.

    String qualification;
    @Override
    void displayInformation(){  // this function is from the parent clas. trying to update of override using same method
       // declaring again  but using same method
       // System.out.println("Name : "+name); dont want to use this parents ,

        System.out.println("my name is shifat jahan");
        System.out.println("my qualifaction ");


    }

    public static void main(String[] args) {  // main method
        MethodOverridingExample2 obj = new MethodOverridingExample2();
        obj.displayInformation();



    }

}

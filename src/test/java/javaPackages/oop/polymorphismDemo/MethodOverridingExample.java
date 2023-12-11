/*

polimorphism = poly = many and morphism = form
it ia a greek word whose meaning is "same object having different behavior.

        Whar is method orverriding: Its a proccess that declaring method in subclass which already
        present in Superclass .
        why do we use this: to resure code and one interface with multiple interface.
        run time polymorphism

        Some rules: name, signature type and parameter must be same.

        overriding = runtime polymorphism

 */


package oop.polymorphismDemo;  // package name

public class MethodOverridingExample {  // class name
    // instance variable declared in the class

    String name;
    int age;

    void displayInformation(){  // custom method
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);

    }




}

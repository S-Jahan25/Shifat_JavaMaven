package javaPackages.oop.inheritanceDemo.multilevel; // package name
// in multilevel inheritance has 1 supper class and many subclass.

// here the child is classC and parents is classB
// the relation between class C & b here is ( grandparents and grandson)

public class ClassC extends InheritanceClassB { // class name


    public static void main(String[] args) {

        //  always create object of the current class.
        // these properties coming from class B and class B got these properties from class A
        // class, A is parent, class b is son and class c is grandson relationship
        // by defaults they get the inheritance properties.

        ClassC obj = new ClassC();  // created an object of class C
        // these coming from class B
        System.out.println(obj.property1);
        System.out.println(obj.proerty2);
        System.out.println(obj.hasCar);
        obj.sellproperties();

    }
}

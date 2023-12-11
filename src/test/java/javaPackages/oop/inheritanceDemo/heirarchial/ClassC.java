// Heirachial has only 1 parents and 2 child. not like multillevel . nno chain extentions.

package javaPackages.oop.inheritanceDemo.heirarchial;

public class ClassC extends ClassA{  // here Class A is parents and class C is child.
    public static void main(String[] args) {  // main method

        ClassC obj = new ClassC(); //// create obj for current class

        // these things coming from class A and child is getting by defaults.

        System.out.println(obj.property1);
        System.out.println(obj.hasCar);
        System.out.println(obj.proerty2);
        obj.sellproperties();

    }
}

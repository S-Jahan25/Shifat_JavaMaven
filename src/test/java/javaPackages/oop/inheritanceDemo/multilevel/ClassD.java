// This is a multilevel inheritance.


package javaPackages.oop.inheritanceDemo.multilevel;



public class ClassD extends ClassC {  // here class Cis parents and Class D is child.


    public static void main(String[] args) { // main method
        // create obj for current class
        // this is called chain extension
        // all this properties first belogns to classA then ClassB extends it then classC then now class D .

        ClassD obj = new ClassD();
        System.out.println(obj.hasCar);
        System.out.println(obj.property1);
        System.out.println(obj.proerty2);
        obj.sellproperties();
    }

}

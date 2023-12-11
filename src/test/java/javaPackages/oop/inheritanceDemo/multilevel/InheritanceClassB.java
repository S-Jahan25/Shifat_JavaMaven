package javaPackages.oop.inheritanceDemo.multilevel; // package name




// Class B is child here and extends from class A ( parents class is class A)
// creating object of child/ current class here to get properties from class A parents.
public class InheritanceClassB extends InheritanceClassA { // class name



    // child can get parents properties by defaults.
    // this example called Inheritance . one of the oop concepts.
    // when I extend a class,  by defaults child class gets automatically .
    // to comind / join 2 classes needs to use word extend.


    public static void main(String[] args) { // main method starts here.

      // InheritanceParent obj = new InheritanceParent(); // created obj of parent class and printing them in child class.
        // these line printing from parent class before doing extentions
      //  System.out.println(obj.property1);
       // System.out.println(obj.proerty2);
       // System.out.println(obj.hasCar);

        // if I extends then always make object of the current class.

        InheritanceClassB obj = new InheritanceClassB(); // created obj of the current class since I extended. for getting parents porties
        // this is parents properties, child is getting it by defaults.
        System.out.println(obj.property1);
        System.out.println(obj.proerty2);
        System.out.println(obj.hasCar);

        // child gets all properties by defaults.

        obj.sellproperties(); // this method coming from the parents method propeties.








    }
}

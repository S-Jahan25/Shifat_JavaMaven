/*
    Author name : Shifat Jahan
    Date: 11/30/2023
    Project: FinalKeyword
 */

package javaPackages.finalKeyword; // package name

public class FinalDemo {  // class name

    /*Final Keyword can be used 3 place = before Class,Method and Variables.

   final class cannot be extended.This class cannot have any child
   final variable cannot be modified the value is final.
   final method cannot be overridden.

   * final keyword: 3 places can be use.
   1. if its in the class = cant be extended
   2. if its in the method = no one can override it
   3. if its in the variable = can not change the value.


     */


    // instance variable.
    String name = "Shifat";

    final String name2 = "shifat"; // final means can


    public void printName() {  // custom method


        System.out.println("print name");

    }

    public static void main(String[] args) {  // main method.

        FinalDemo obj = new FinalDemo(); // created obj of class

        // I declared this String type name in the class but I can still change the value in the main method.
        obj.name = "Shifat Jahan";  // updated name from class updated in the main.System.out.println(obj.name);
        System.out.println(obj.name);

        System.out.println("---------------");
        // I can  print this name but cant update the value because ots final in the class declared.
        System.out.println(obj.name2);

    }
}

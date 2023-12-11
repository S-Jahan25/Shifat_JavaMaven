/*
    Author name: Shifat Jahan
    Date: 11/30/2023
    Project : AccessModifier practice.

    * void method only accessible withn package. , no access, default.
    * privet : only its own class
    *public: whole project has access
   * protected:  can go outside the package but needs inheritance , extends
 */


package javaPackages.accessModifier;

import javaPackages.myAccessPractice.HomeWorkAccess4;

// extending to get Homework4 properties from diffrents package class.

public class HomeWorkAccess5 extends HomeWorkAccess4 {  // Homework5 is child and Homework4 is parents.

    public static void main(String[] args) {  //main method starts here.

        HomeWorkAccess5 obj = new HomeWorkAccess5(); // created obj of current class

        /*
        Calling the methods from differerent Packages class.
        name : myAccessPractice , class name HomeWork4
        even Homework4 has more properties, this homework5 cant have access because of access modifier mode.
         */
        obj.printHours(); // this is printing because its public mode. whole project can have access
        obj.printYear(); // this is printing because of extends. even its on protecetd mode.


    }
}

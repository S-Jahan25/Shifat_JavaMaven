/*
    Author name: Shifat Jahan
    Date: 11/30/2023
    Project : AccessModifier practice.

    * void method only accessible withn package. , no access, default.
    * privet : only its own class
    *public: whole project has access
   * protected:  can go outside the package but needs inheritance , extends



 */


package javaPackages.myAccessPractice; // package name

public class HomeWorkAccess4 {  // class name
    // class can hold 2 things : variables and methods.

    public void printHours(){ // created a custom method

        System.out.println("This is a public method and can be accessible throught the entire project");
    }
    private void printMinutes(){  // created a custom method
        System.out.println("This is a privet method and can be access only its own class.");

    }

     void printDay(){
         System.out.println("This is package privet, no access, default, only within the package.");
     }

     protected void printYear(){
         System.out.println("This is a protected method , only by extending can be accessible with other package/ class");
     }




    public static void main(String[] args) { // main method starts here
        HomeWorkAccess4 obj = new HomeWorkAccess4(); // created obj
        // calling the methods

        // calling the method

        obj.printMinutes();
        obj.printHours();
        obj.printDay();
        obj.printYear();




    }
}

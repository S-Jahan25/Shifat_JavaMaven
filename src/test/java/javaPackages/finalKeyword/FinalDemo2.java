/*
  Author name : Shifat Jahan
  Date: 11/30/2023
  Project Override/ final oop concept


  Override: is a part of OOP concept

  Example: Dharti & Shifat working in a same project
  * same project shared through github for working
  *if shifats write a method then dharti cant created a new method. she must use shifats method.
  * if its similar catagory then dharti can override by using same method from shifat. but can not write new one

 */


package javaPackages.finalKeyword;  // package

public class FinalDemo2{ // class


    /*
    Created by Shifat
    Date: 11/12/23


     */
    public void printName() {  // custom method


        System.out.println("print name");

    }

    public final void peoplesName(){ // method custom final / no one can use or override this method. cant not use same name.

        System.out.println("Printing my name name");  // original by shifat.
        String anotherName  = " opu";  //
        String anotherName2 = " Aaliyah";  //
        System.out.println(anotherName+" "+anotherName2);

    }

    public static void main(String[] args) { // main

        FinalDemo2 obj = new FinalDemo2(); // created obj

        obj.printName(); // calling method
    }


}

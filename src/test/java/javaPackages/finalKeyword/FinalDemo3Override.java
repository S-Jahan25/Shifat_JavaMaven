
/*
  Author name : Shifat Jahan
  Date: 11/30/2023
  Project Override oop concept


  Override: is a part of OOP concept

  Example: Dharti & Shifat working in a same project
  * same project shared through github for working
  *if shifats write a method then dharti cant created a new method. she must use shifats method.
  * if its similar catagory then dharti can override by using same method from shifat. but can not write new one



 */
package javaPackages.finalKeyword; // package name

public class FinalDemo3Override extends FinalDemo2 {  // class name

    /*
    created by Dharti
    date:
    Dharti using same method by created shifat for change or update but cannot do similar method

     */
    @Override // annotation
    public void printName(){ // method nemae is same dharti using same method by shifat but can changing / update the value

        System.out.println("Printing name");  // original by shifat.
        String anotherName  = " Shifat";  // changed by dharti
        String anotherName2 = " Safa";  // changed
        System.out.println(anotherName+" "+anotherName2);

    }
   // @Override   //
  //  public final void peoplesName(){ // this method same name shifat created and in the final mode so Dharti cant use it.
    // or change it .

  //  }

    public static void main(String[] args) { // main method

        FinalDemo3Override obj = new FinalDemo3Override(); // creating obj of current

        obj.printName();  // calling method
    }





}

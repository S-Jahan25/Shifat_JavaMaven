package javaPackages.abstractDemo;

public abstract class AbstractASupperClass { // class , Abstract class always needs to be Abstract.

    /*
    Abstract is a proccess when Hiding the implementation showing only functionally.
    // parent class A is the User Interface. what the user will see in the front.
    // Abstract class can be 0-100% abstraction.
    // Abstract class cannot be instantiated.
    // they have 2 method. 1. abstract and 2. normal method
    // Abstract class can hold both abstract and non abstract method.
     */

    // these are variables
    int cardNo;
    String customerName;
    int cvvNo;
    String billingAddress;
    int exp;


    /*
     I can not do any implementation here. and cant have body = {}. needs to implements in the other place.
     This is just a place order method and implement in the other place.
     custom abstract  body and I can not give anything inside. this doesn't have body but still custom method
     */
    public abstract void placeOrder();  // this is a functionality. User can see

   public abstract void emailMessage(); //this is a functionality. User can see

    // user needs to input the information.
    public void cardInfo(){  // normal method
      cardNo = 45678868;
      customerName = "Shifat";
      cvvNo = 243;
      billingAddress = "560 Oak bracnh";
      exp = 2325;

      }




// an abstract class we can not create any object and never.
    public static void main(String[] args) {  // main method
        /*
              an abstract class we can not create any object and never.
              Why we cant create an object ? = because nothing inside of the method.
              we create obj of the class for calling the method, since our method dont have body
              int the abstract class and nothing inside , thats the reason why  can not creat obj in the main.
         */
      //  AbstractA obj = new AbstractA();


            }


    }



package javaPackages.abstractDemo;

public class ImplementAbstract extends AbstractASupperClass { // This is child class and extrends from supper class
    /*
    THis is a regular class , which is doing the implementation but its supper class is abstract.
    * In the Abstract supper class should be abstract and whoever implement should be regular.
       If supper class has more than one method then all of them needs to come here in order to correct way
       working the code.

     */


   // needs to give body {}
    public void placeOrder(){ //this is a functionality. User can see. and this taken from supper class. for implementation
        /*
            * Connect with the bank Server
            * Verify info
            * return positive or negative response.
         */

        super.cardInfo();
        System.out.println(cardNo);
        System.out.println(customerName);
        System.out.println(cvvNo);
        System.out.println(billingAddress);
        System.out.println(exp);
        System.out.println("Your order has been placed.");

    }

    //needs to give body {}
    public  void emailMessage(){ //this is a functionality. User can see, needs to give body {}
        System.out.println("Your order has been successfull.");
        placeOrder();  // we can call a method into another method.

    }



    public static void main(String[] args) {  // main method
        ImplementAbstract obj = new ImplementAbstract(); // created obj of the class for calling them
        // by calling this method placeOrder method will also print since I put that inside of emailmessage method
      //  obj.emailMessage(); // calling my method.
        obj.placeOrder();


    }


}

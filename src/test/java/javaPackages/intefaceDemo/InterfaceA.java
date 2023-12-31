package javaPackages.intefaceDemo;

public interface InterfaceA {

    /*
       * Interface is a proccess when Hiding the implementation showing only functionality.
       * no method body.
       Interface can hold only abstract method
       *  Interface cannot be instantiated
       * real job interface is very popular not just abstract
       * we can not create a obj in the interface
       * Interface can be 100% abstraction
       * Interface can hold only abstract methods. no non abstract method.
       * by default it is public and abstract
       * in interface variables are final by default. I odnt need to write final keyword.
     */

    /*
            since interface variable are final , so I have to declare and initialized in this interface.
     */
    int cardNo = 78574747;
    String CustomerName = "Shifat";
    int cvvNo = 654;
    String billingAddress = "560 oak branch";
    int exp = 1231;


    public void placeOrder();

    public void emailMessage();

    public void orderTRackingNO();


    //interface doesn't allow to create object because no body in the method.
  //  public static void main(String[] args) {
     //   InterfaceA obj = new InterfaceA(); //
    }

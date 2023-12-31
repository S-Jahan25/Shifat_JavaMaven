package javaPackages.intefaceDemo;

public class ImplementInterface implements InterfaceA { // in interface we need to use implement. no extend word.

// needs to give body from supper class.

    public void placeOrder(){  // giving body and implementing here
        System.out.println("Your card number: "+ cardNo);
        System.out.println("Your name: "+ CustomerName);
        System.out.println("Your card cvv" + cvvNo);
        System.out.println("Your Billing Address infor" + billingAddress);
        System.out.println("Your card exp date :" +exp);

    }

    public void emailMessage(){  // giving body and implementing here
        System.out.println("Your order has been successfull.");
        placeOrder(); // putting one method inside of another method
        orderTRackingNO();// putting one method inside of another method

    }
    public void orderTRackingNO(){ // giving body and implementing here
        System.out.println("Your order has been shipped and here is the tracking number: 89562426813357 ups ");
    }


    public static void main(String[] args) {
        ImplementInterface obj = new ImplementInterface();
        obj.emailMessage(); // calling only one method since the other 2 method is inside of this method. no need to call again here

    }








}

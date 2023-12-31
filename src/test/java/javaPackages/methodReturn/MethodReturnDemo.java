package javaPackages.methodReturn;

import javaPackages.constructionDemo.ConstructionPractice;

public class MethodReturnDemo {

    /*
     1. Void means returning nothing. just printing what inside by calling the method.
     2. String return,will give the return value.
     */


    public void location(){ // this method not returning anything . just inside is printing
        System.out.println("Shifat");
    }


    public String location1(){  //  This method will return string . its not void

        return "Shifat Jahan";
    }



    // This method is also returning int value. its not void.

    public int zipCode(){

        int myZip = 34758;
        return myZip;
    }


    public static void main(String[] args) {

        MethodReturnDemo obj = new MethodReturnDemo();
        obj.location(); // calling method , the method is not returning, just printing what inside.


        // when method is returning something, need to use sout .
        System.out.println(obj.location1());// this method is returning String.

        System.out.println(obj.zipCode()); // this will return int zipcode. its not void method.


        // creating object of the class ConstructionPractice.
        ConstructionPractice obj1  = new ConstructionPractice( "Florida");
        System.out.println(obj1.name);
        System.out.println(obj.location1());





    }
}

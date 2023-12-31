package javaPackages.collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /*
       Difference between Array and arrayList:
      * Array is static / size is fixed but ArrayList is dynamic ( size is changable)
      * on array we can use for or for each loop but ArrayList we must use for each loop and iterator.
      * Array : Fast   ArrayList : Slow
      * to check Array size : need to use ( array.length )  Arraylist : ( array.size() )



     */


    public static void main(String[] args) {

        // creating ArrayList

        ArrayList<Integer> number = new ArrayList<>(); // import java.Arraylist from library need to use.

        System.out.println("size = "+number.size()); // this is how to check arrayList size. but size is now 0 because no size declared yet

        // adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(1,50); // this is how to add number od existing index value.
        //System.out.println(number);

        // this is how to check how many array are there ( size ) is 4
        System.out.println("size = "+number.size());



    }
}

package javaPackages.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class ArrayListDemo{

    // Array we cannot add or delete but arraylist we can.
    // Array is static but arraylist is dynamic
    // Array can hold both primitive data tyoe and object but ArrayList are limited to object

    //Array list and array are 2 different thing but same concepts

    // List is a Interface and ArrayLyst Implements List
    // ArrayList is not fixed. it is dynamic
    // ArrayList can hold duplicate value.
    // ArrayList follows insesation order
    // we can print 2 time same name.

    public void arrayListPractice(){


        // array always fixed
      //  String name[] ={"shifat", "opu","safa"};

       // System.out.println(name.length);

        ArrayList<String> name = new ArrayList<>();

      boolean isEmptyOrNot =   name.isEmpty();
        System.out.println(isEmptyOrNot);  // this will print true.

        name.add("shifat");
        name.add("safa");

        System.out.println(name);
        System.out.println(name.size());

    }


       public void arrayListPractice2(){

        ArrayList<Integer> number = new ArrayList<>(); // Integer is a wrapper Class

           boolean isEmptybefore = number.isEmpty();
           System.out.println(isEmptybefore);
          number.add(50);
          number.add(60);
          number.add(70);
          number.add(80);
          number.add(80);
          number.add(90);

          boolean isEmptyAfter = number.isEmpty();
           System.out.println(isEmptyAfter);

           int size = number.size();
           System.out.println("Size of the numberList is " +size); // size starts with 1
           System.out.println(number);

           int thirdNumber = number.get(2);   // this will give me 70 index
           System.out.println("the third number is " +thirdNumber);

           number.remove(3); // to remove number
           System.out.println(number);

           // to add number
           number.add(2, 70);
           System.out.println(number);


           // to check if number is there or not

           boolean ninetyIsThereOrNot = number.contains(90);
           System.out.println(ninetyIsThereOrNot);

        // to get random numberlist . not in order shuffle meaning

           Collections.shuffle(number);
           System.out.println(number);

           // sorting
           Collections.sort(number);
           System.out.println(number);

           // going backward
           Collections. reverse(number);
           System.out.println(number);

           Collections.sort(number);
           System.out.println(number);

           int minimumNumber = Collections.min(number);
           System.out.println(minimumNumber);

           int maxmimumNumber = Collections.max(number);
           System.out.println(maxmimumNumber);



           // using for loop to get acces all the number
           // used 0 here for index

           for (int i = 0; i < number.size(); i ++){

               System.out.println("The list contains " +number.get(i));
           }



           /*
              For each loop

            */
             for (Integer n : number){
                 System.out.println(n);
             }

           //  for (String n : name){
          //       System.out.println(n);
          //   }

           System.out.println("Shifat");


           }


    public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        obj.arrayListPractice();
        obj.arrayListPractice2();
    }
}

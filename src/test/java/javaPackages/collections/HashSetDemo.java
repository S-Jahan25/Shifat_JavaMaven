package javaPackages.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {


    /*
       Set is an Interface and HashAet is a class. HasSet implements set
       HasSet does not allow duplicate value
       * HasSet does not follow insesation  order
     */


    public void HashSetPractice() {
        HashSet<String> cars = new HashSet<>();  // created an obj of the class
        cars.add("Rickshaw");
        cars.add("Toyota");
        //    cars.add("Tomtom");
        cars.add("CNG");
        cars.add("Tomtom");

        int carSize = cars.size();
        System.out.println(carSize);
        System.out.println(cars);

        boolean Honda = cars.contains("Honda");
        System.out.println(Honda);

        Set<Integer> Num = new HashSet<>();

        Num.add(8);
        Num.add(87);
        Num.add(76);
        Num.add(89);

        // for (int i = 1; i<20; i++) {
        //       if (Num.contains(i)) ;
        //       System.out.println(i + "is there");

    }
            public static void main (String[]args){

            }
        }




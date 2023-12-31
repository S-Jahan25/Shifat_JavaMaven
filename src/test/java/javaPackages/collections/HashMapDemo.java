package javaPackages.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    /*
        *MAP is an Interface but HasMap is a class. HasMap Implements Map
        *  HasMap can Hold two dataType
        * Hashmap is a key value pairs
        * One object is used as Key and another is used as value
        * The key should be unique
     */

    public void hashMapPractice(){
        Map<Integer, String> cars = new HashMap<>();

        cars.put(1, "Toyota");  // here 1 is key and "Toyota is value. key and value pair
        cars.put(2,"Tesla");
        cars.put(3,"BMW");
        cars.put(7,"Toyota");

        System.out.println(cars);

        cars.remove(3);
        System.out.println(cars);

        cars.put(3, "BMW");
        System.out.println(cars);

    }

    public void hashMapPractice2(){
        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("India", "Delhi");
        capitalCity.put("Pakistan", "Islamabad");
        System.out.println(capitalCity);

      Map<String, Integer> zipCode = new HashMap<>();
     zipCode.put("Shifat", 330);

    }


    public static void main(String[] args) {
        HashMapDemo ref = new HashMapDemo();
        ref.hashMapPractice();
        ref.hashMapPractice2();
    }
}

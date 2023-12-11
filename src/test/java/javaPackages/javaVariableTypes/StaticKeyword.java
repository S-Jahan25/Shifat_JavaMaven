/*
Author name : Shifat Jahan
Date: 11/25/2023

 */


package javaPackages.javaVariableTypes;  // package name

public class StaticKeyword {  // class name
    // Static keyword can be used before variable and method. which are common to the all objects
// static= upper level
// 2nd object variable
// 3rd local variable

    /*
    Class -- UprightStudents-- name , id , group , batch -- Properties
    Objects -- shifat, opu , safa

  */
    String name;
    int batchNo;
    int id;
    static String school = "Upright Tech Solutions";


    static public void attendingCourse(){ // my custom method i created

        String course; // local variable course
        course = "Selenium"; //declared and initialized
        System.out.println("My course is: "+ course);


    }

    public void location() {  // custom method
        String location = "Florida"; // declare and initialized. cant be static because its not come to all objects
        System.out.println(location);

    }

    public static void main(String[] args) {  // main method starts here
        StaticKeyword obj1 = new StaticKeyword(); // creating object
        obj1.name = "shifat";
        System.out.println("My name is : "+ obj1.name);
        obj1.batchNo = 7;
        System.out.println("My batchNo is : "+ obj1.batchNo);
        obj1.id = 65;
        System.out.println("My id is : "+ obj1.id);

        // obj1.school = "Upright Tech Solution";
        System.out.println("My school name is : "+ obj1.school);
        obj1.attendingCourse(); // here calling my method
        //obj1.location(); I can not make this because this will print same location for all in this case I have to use parameter.


        System.out.println("-----------------");
        StaticKeyword obj2 = new StaticKeyword(); // creating object
        obj2.name = "opu";
        System.out.println("My name is : "+ obj2.name);
        obj2.batchNo = 73;
        System.out.println("My batchno is : "+ obj2.batchNo);
        obj2.id = 8986;
        // obj2.school ="Upright Tech Solution";
        System.out.println("My school name is : " + obj2.school);
        obj2.attendingCourse(); // here calling my method


        System.out.println("--------------");
        StaticKeyword obj3 = new StaticKeyword(); // creating object
        obj3.name = "Safa";
        obj3.batchNo = 87;
        obj3.id = 85;
        // obj3.school = "Upright Tech Solution";
        System.out.println("My school name is : "+ obj3.school);
        obj3.attendingCourse(); // here calling my method




    }


}

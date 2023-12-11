/*
Author : shifat Jahan
Date: 11/20/2023
project : how to create an object and calling from the main method

 */


package javaPackages.instantiationDemoObject;  // package name

public class UprightStudents {  // class name

    /* Class can hold two things... 1: properties 2: behavior
   properties( identity) : variables
   behavior: method
   * each objects can use all properties.

    */
    // Here I declared variables in the class
    String name;
    int batchNo;
    int id;
    String course;
    String location;

    // methods = Behavior (action)
    public void homeWork(){   // custom method



    }



    public void attendingClass(){  // custom method



    }

    public void conductingMentoring(){   // custom method


    }

    public static void main(String[] args) { // main method

        //Shifat, Opu, Safa, Lota ( These are objects of the class)

        UprightStudents shifat = new UprightStudents(); // Here is creating an object of the class. here is shifat is reference variables, class name uprightsStudents
        shifat.name = "Shifat Jahan"; // variables is being  Initialization with values
        shifat.homeWork(); // here is calling the method

        UprightStudents opu = new UprightStudents(); // opu is a name of the object / reference variables.
        opu.name = "Ibrahim Opu";
        opu.homeWork();

        UprightStudents safa = new UprightStudents();
        safa.name = "Aaliyah Aayat safa";
        safa.homeWork();


    }




}

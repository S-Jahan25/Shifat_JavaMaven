package myAccessPractice; //package

/*
Author name : shifat Jahan
Date: 11/30/2023
Project: Access practice.

* we can bring one class properties to another class 2 ways
1. extentions
2. by creating object of old class not current class.


 */


import javaPackages.accessModifier.Access1;

// extending from different package , name is Accessmodifier and class AccessA.
public class Access3 extends Access1 {  // class. Access3 is child & Access1 parent.


    public static void main(String[] args) {  // main method

       //

        // by doing this I can get some properties without extending
        // but needs to create obj of previous class not current
        //  Access1 obj = new Access1();


        Access3 Obj = new Access3(); // created obj of current class always.

        System.out.println(Obj.hours); // printing public hours coming from access1 class. by extending getting it

       //  System.out.println(Obj.minutes); // cant get this because of its privet mode by Access1.

        //System.out.println(Obj.day); // only can be Access within its own package . this is a different package

        System.out.println(Obj.year); // accessing it because of using extention even its protected mode.
    }

}


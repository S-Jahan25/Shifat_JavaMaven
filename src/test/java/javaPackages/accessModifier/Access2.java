package javaPackages.accessModifier;  // package name

public class Access2 extends Access1{  // class . Child is Access2 and parent is Access1


    public static void main(String[] args) {  // main method starts here.
        Access2 obj = new Access2(); // created obj of the current/child class.

        // printing them from Access1

        System.out.println(obj.hours); // this is printing because Access1 has public mode


        // cant print this even child get parents properties still parents/Access1 have privet mode.
        //System.out.println(obj.minutes); // cant print Access1 have privet mode.

        System.out.println(obj.day); // printing this because it has access withhin the package no mode.

        System.out.println(obj.year); // this is printing only because of the extendes/ inheritance without that cant be accssible.


    }
}

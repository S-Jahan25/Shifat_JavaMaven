/*
Author name : shifat jahan

Date: 11/29/2023


Modifies is : we can restrict access or give access as per of the needs or requirement.

Access modifier :  keywords.

1.  public = is accessible throughout the whole project. anywhere in the project
2.  privet = is accessible only its own class but not with other class.
3.  String = no access at all only can be access with  its own package. default means no keyword or modifies required.
4. protected = can be access but needs to be extends / inheritance,


 */

package javaPackages.accessModifier;  // package name

public class Access1 { // class name
    // these are instance variables and declared, initialized.

    public int hours = 24;// is accessible throughout the project. anywhere in the project.

    private int minutes=60;// is accessible only its own class,  but not with other class. only in this class.

    String day="Tuesday";// no access modifier, package privet., default, is accessible within the package, no mode assign need.

    protected int year = 365;//it can be used in other package but needs inheritance.


    public void printhours(){  // custom method  named public and can be accessible to everyone.

        System.out.println("This is public method"); // printing
    }

    public static void main(String[] args) { // main method

        Access1 obj = new Access1();  // created obj of the class
        // printing them
        System.out.println(obj.hours); // public can be accessible anywhere in the project

        System.out.println(obj.minutes); // privet only can be access in this class not other packages or classes.

        System.out.println(obj.day); // only within the package accessible.

        System.out.println(obj.year);// can print here but for other package/class needs extends.
    }


}

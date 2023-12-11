package oop.polymorphismDemo;  // package name

// super class == parents class
// child class == subclass

public class OverRidingDemo2  extends OverRidingDemo1{  // class name OverRidingDemo2 is the child class
    // and extending the parents class here . OverRidingDemo1 is the parents class here.



/*
    This created by dharti but extends function from shifat from the parents / supper class.
    dharti can not write new function only can override from supper class if its similar method.
 */

    @Override  // without @Override it will print but for new member / person who wants to use it for their referance
    // so that next person know that this method was taken from a supper class.

    public void courseMembers(int members){  // created a custom method with inside parameters int members// .
        // int member number will print or give value when i call it from the mai function
        System.out.println(members);
        String group = "Selenium";
        System.out.println(group);



    }


    public static void main(String[] args) {
        OverRidingDemo2  obj = new OverRidingDemo2();
        obj.courseMembers(6);


    }









}

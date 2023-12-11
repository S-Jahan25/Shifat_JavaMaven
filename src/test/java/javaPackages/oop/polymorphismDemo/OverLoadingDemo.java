/*
   Author : Shifat Jahan
 */

package oop.polymorphismDemo;  // package name

public class OverLoadingDemo {  // class name
    /* overloading can be Achieved by the same method name but
   1. different number of parameter
   2, different data type
   3. different order of parameter



 ********  Overloading called compile time polymorphism : got caught in the compilation it wont work.
 */
// count as different method only parameter change

    public void add (int a, int b){  // custom method
        System.out.println(a+b);
    }

    public void add (int a ,int b,int c){  // custom method
        System.out.println(a+b+c);
    }

    public void add (int a, float b){  // custom method
        System.out.println(a+b);
    }

    public void add (float b, int a){  // custom method
        System.out.println(b+a);
    }

    public static void main(String[] args) {  // main method starts here.
        OverLoadingDemo obj = new OverLoadingDemo();  // obj of current class
        // one parameters can not be matching with other parameters
        // method same name
        // data type different

        obj.add(2,8);
        obj.add(5,8,8);
        obj.add(5,8.7f);
        obj.add(76,23);


    }


}

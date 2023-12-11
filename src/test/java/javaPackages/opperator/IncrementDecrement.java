package javaPackages.opperator;

public class IncrementDecrement {
    public static void main(String[] args) {
        //initialized the variable
        int a = 5;
        int b;

        System.out.println(++a); // output 6
        System.out.println(a++);// = 6
        System.out.println(a++ +4); // output =11
        System.out.println(a); // output = 8
        b = ++a +8 + a++;  // output = 26
        System.out.println(b);
    }
}

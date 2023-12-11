package javaPackages.opperator;

public class AssignmentOperator {
    public static void main(String[] args) {
        // variable we only use 1
        int a;
        int b = 20;
        a = 10; // simple assignmnet operator.
        System.out.println(a);

        //compound operator +=

        a+=40;  // adding value of a which is 10 + 40
        System.out.println(a);
        b+= 50;
        System.out.println(b);

        a-=10; // decrement .
        System.out.println(a);
    }
}

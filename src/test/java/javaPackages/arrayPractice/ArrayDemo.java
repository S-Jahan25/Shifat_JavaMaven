package javaPackages.arrayPractice;

public class ArrayDemo {

    // Array can hold multiple elements.
// Array length is fixed in size.
// We cannot add or remove any element later.
    String [] studentName= {"shifat","opu","Sadia","safa"};// ArrayData
    // length of this array= 4
// what is the last index=3
// student is arrayVariable
    String Location = "Texas";

    public void arr(){
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);
        // System.out.println(studentName[4]);//indexoutofboundException
        // System.out.println(location);
        // print 10,15,30,60

        // int []myNum={10,15,30,60};
    }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.arr();
    }

}

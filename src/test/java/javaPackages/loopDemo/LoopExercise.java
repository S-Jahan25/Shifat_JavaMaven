/*
Author: Shifat Jahan
Date: 11/25/2023


loop : few types of loop:
1. while loop
2. for loop
3. Do-while loop
4. foreach loop
 */


package javaPackages.loopDemo;

public class LoopExercise {

    public void Whileloop() {

        int a = 10; //initialization
        while (a<=50) { //condition
            System.out.println(a);
            a++; // increase by 1-- increment
        }
        // print 10-50 using while loop
        System.out.println("-----------------------------------");
        // print 50-10 using while loop
        int b = 50; // initialization
        while (b>=1) { // condition
            System.out.println(b);
            b--; // 50,49,48,47, decrement
        }
        System.out.println("-----------------------------------");
        // print 1-50 in 2 intervals
        int c = 1; //initialization
        while (c<=50) { // condition
            System.out.println(c);
            c = c + 2; // increase by 2 -- increment
        }
    }
    // for loop
    public void forloop () {

        for (int a = 1; a <= 10; a++) { //increment by 1
            System.out.println(a);
        }
        for(int a =10; a>=1; a--){   // decrement
            System.out.println(a);
        }
        for (int a =10; a>=1; a=a-2){ //decrement by 2
            System.out.println(a);
        }
    }
    // do-while loop --- it will run the block at least 1 time
    public void dowhileloop(){
        //print 5-10
        int d = 5;
        do {
            System.out.println(d);
            d++;
        }
        while (d<=4);
    }
    public void arr(){
        String [] studentName= {"shifat","lota","Sadia","Dharti"};// ArrayData
        //   System.out.println(studentName[0]);
        //    System.out.println(studentName[1]);
        //    System.out.println(studentName[2]);
        //    System.out.println(studentName[3]);

        for(String m: studentName) {
            System.out.println(m);
        }
        for (int i=0;i<studentName.length;i++);
        {
            System.out.println(studentName[0]);
        }
    }

    public static void main(String[] args) {
        LoopExercise obj = new LoopExercise();
        // obj.loopIntroduction();
        // obj.Whileloop();
        // obj.forloop();
        // obj.dowhileloop();
        //obj.foreachloop();
    }
}

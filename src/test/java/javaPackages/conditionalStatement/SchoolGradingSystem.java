
/*
Author : Shifat Jahan
Date: 11/29/2023

project: A school has following rules for grading system:
a. Below 25 - F
b. 25 to below 45 - E
c. 45 to below 50 - D
d. 50 to below 60 - C
e. 60 to below 80 - B
f. 80 to above - A
Ask user to enter marks and print the corresponding grade

 */



package javaPackages.conditionalStatement;  // package name
import java.util.Scanner;

public class SchoolGradingSystem {  //class name
    public static void main(String[] args) {
        SchoolGradingSystem obj = new SchoolGradingSystem();
        obj.grade();
    }

    public void grade() {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if (mark == 25) {
            System.out.println("the student got F");
        } else if (mark == 45) {
            System.out.println("the student got E");
        } else if (mark == 50) {
            System.out.println("D");
        } else if (mark == 60) {
            System.out.println("C");
        } else if (mark == 80) {
            System.out.println("B");
        }

    }
}

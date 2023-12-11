package javaPackages.opperator;
import java.util.Scanner;

public class LogicalOperators {
    // and/or and (&&) or(//) -- these are also returning true/false
    int a = 15;
    int b = 8;
    int c = 12;


    public void logical() {
  /*
     int a = 15;
     int b = 8;
     int c = 12;
     */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // when there is && either one is false == total is false
        boolean result1 = (a > b) && (b > c);
        System.out.println(result1);

        boolean result2 = (a < b) && (b == c);
        System.out.println(result2);

        // when there is || either one is true === total is true
        boolean result3 = (a < b) || (b < c);
        System.out.println(result3);

        boolean result4 = (a > b) || (b < c);
        System.out.println(result4);
    }

    public static void main(String[] args) {
        LogicalOperators obj = new LogicalOperators();
        //  obj. logical();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name below : ");
        String myName = scan.nextLine();
        System.out.println("my name is " + myName);

        System.out.println("Enter your age below : ");
        int myage = scan.nextInt();
        System.out.println("age is " + myage);

        System.out.println("Enter your regNo below : ");
        short myregNo = scan.nextShort();
        System.out.println("regNo is " + myregNo);

        System.out.println("Enter your stockBalance below : ");
        float mystockBalance = scan.nextFloat();
        System.out.println("stockBalance is " + mystockBalance);
        // Homework-- get input from Console age ( int), regNo(short), stockBalance(float)



        // ifElse statement -- conditional statement

        String veg = "tomato";

        if (veg == "tomato") {
            System.out.println("bring it home");
        }
        else {
            System.out.println("bring something else");

        }

    }

}

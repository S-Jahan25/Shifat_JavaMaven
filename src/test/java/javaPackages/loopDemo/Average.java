/*
 Autor name: Shifat Jahan
 Date: 11/25/2023
 project : using loop
    Take 5 numbers like: 100, 200, 300, 400
    as an array and find the average of these numbers.


 */

package javaPackages.loopDemo;  // package name

public class Average {  // class name
    {
        int [] num = {100, 200, 300, 400, 500};
        int sum = 0;

        for (int i = 0; i <num.length; i++){
            // System.out.println(num[i]);
            sum = sum+num[i];
        }
        System.out.println(sum);

        float average =  sum/num.length;
        System.out.println(average);
    }

    public static void main(String[] args) { // main method

        Average obj = new Average();
        System.out.println("I am a new number");


    }


}

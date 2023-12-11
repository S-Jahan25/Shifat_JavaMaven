  /*
          Author : Shifat Jahan
          Project: intro to Array , what is array, how to use Array.

   1.   What is an Array = An array is a collection of variables of same type. store more than one value at a time.
      for example:
      i. if we use int then all has to be integer value
      ii. if we use float then all has to be float data type.
      ii. if we use string then has to be use string type value
     * Array can hold multiple elements.
     *  Array length is fixed in size.
     * we cannot add or remove any element later.

     2. why do we use Array = Arrays make strong and finding values easier and efficiently.
         * we can accessing an element is very easy by using index number.


   */


package javaPackages.arrayPractice;  // package name

public class JavaArray {   // class name
    public static void main(String[] args) {

        int[] number; // this is how to declared array, first create size / how many variavlabe should be
        number = new int[7];  // this is how to create an array in this case we have 7 variables stored in single array.

        // This is how to initialized array.
        number [0] = 34;
        number [1] = 38;
        number [2] = 4;
        number [3] = 24;
        number [4] = 54;
        number [5] = 84;
        number [6] = 64;
        // printing the index value
        System.out.println("The index array 0 is "+ number[0]); // this will print 0 number index value which is 34.
        System.out.println("The index array 4 is "+ number[4]); // this will print 4 number index value which is 54.

        // THIS IS how to find size of array.
        int sizeOfArray = number.length; // int = array size is int value and sizeOF is my referance variable.
        System.out.println("Size of array is : "+ sizeOfArray);


         // this is how to get sum of all number from arraylist
        int sum = number[0] + number[1] + number[2] + number[3] + number[4] + number[5] + number[6];
        System.out.println("The total sum is = "+ sum);




    }

}

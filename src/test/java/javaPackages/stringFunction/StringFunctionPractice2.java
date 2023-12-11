  /*
  Author name: Shifat Jahan
    Project: Use of StringFunction method and practice
    * String = a reference data type that can store one or more characters

    * String is Sequence of character.
    //              reference data type have access to useful methods.

    Few example of using stringFunction:

    1.  Example on using .concat
    2.  .trim
    3. .replaceAll
    4.  .repeat
   */

package javaPackages.stringFunction;  // package name

public class StringFunctionPractice2 {  // class name

    // when there is static void function the no object creation required when calling from main method
    public static void travelPlaning(){
        // created two  strings
        String travelList = " My first Goal is to Travel Europe, Second Dubai, Egypt, Turkey";
        String nextTravelList = "      India,   Maldive, Thailand      ";

        /* Example on using .concat
           .concat = add two strings together.
         */
           String fullTravelList = travelList.concat(nextTravelList);
        System.out.println("This is my full TravelList : "+fullTravelList);
        /*
           .trim will remove empty space

         */

           String nextTravel = nextTravelList.trim();
           System.out.println(nextTravel);

           /*
           .replaceAll will replace all existing  i = e

            */
               String newTrvelList =   nextTravelList.replaceAll("i", "ee");
                  System.out.println(newTrvelList);


                  /*
                        .repeat will repeat each line
                   */
               //   String repeatWord = travelList.repeat(5);
                //   System.out.println(repeatWord);

                   /*
                           .substring = will print letter or word.
                    */
                       String printoneWord =   nextTravelList.substring( 12, 18);
                             System.out.println(printoneWord);


    }

    public static void main(String[] args) {  // starts main method.

        travelPlaning(); // calling the method
       // StringFunctionPractice2 obj = new StringFunctionPractice2();
       // obj.travelPlaning();

    }


}

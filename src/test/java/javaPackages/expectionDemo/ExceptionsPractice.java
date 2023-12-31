package javaPackages.expectionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsPractice {


    /*
          * There are two types of expection
          * i. compile time
          * a) InteruptionExpection
          * b) file not found Exception
          * ii. Run time
          * Number format expection
     */



    public void compileTimeException() throws InterruptedException, FileNotFoundException { // need to throws InterruptedExpection
        System.out.println(3+3);
        Thread.sleep(5000);  // this will sleep for 5 sec

// after 5 sec waiting these next 2 line will run

        System.out.println(4*4);

        System.out.println(9+8);

  // need to create obj and put class name FileInputStream to connent with the externl properties.

        FileInputStream fs = new FileInputStream("src/test/java/info.properties");
        //int number = fs.available();
      //  System.out.println(number);



    }
    public void runtimeExpection(){
        String name[] ={"shift" , "jahan" , "aaliyah"};

        System.out.println(name[1]);

     //   String location = "Florida";
     //   char lastLetter = location.charAt(0);
      //  int locationNumber = Integer.valueOf(location);
        //System.out.println(locationNumber);
    }

    public static void main(String[] args) throws InterruptedException, FileNotFoundException{
        ExceptionsPractice obj = new ExceptionsPractice();
       // obj.compileTimeException();
        obj.runtimeExpection();


    }

}



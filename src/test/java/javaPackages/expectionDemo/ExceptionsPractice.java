package javaPackages.expectionDemo;

public class ExceptionsPractice {


    /*
          * There are two types of expection
          * i. compile time
          * ii. Run time
     */



    public void compileTimeException() throws InterruptedException {
        System.out.println(3+3);
        Thread.sleep(5000);

        System.out.println(4*4);

        System.out.println(9+8);

    }

    public static void main(String[] args) throws InterruptedException{
        ExceptionsPractice obj = new ExceptionsPractice();
        obj.compileTimeException();
    }

}



package javaPackages.testNG_Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Pre_Requisit {


    @BeforeClass

    public void bc(){
        System.out.println("Before class --- Opening the browser");
    }







    @AfterClass
       public void ac(){
        System.out.println("After class ");
    }


}

package javaPackages.testNG_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNGPractice extends Pre_Requisit{
WebDriver driver;

    /*
       TestNg = used for unit test
       unit test = is run individual . only run 1 module
       integrate test = when run from class all together. when multiple modules are connected each other

***Execuation order of testing annotation**
* before class
* mefore method
* test
*after method
*after class

 @Test (priority = 1) we use when we decide / want to run function by my priority / order .which one to run first

** if there is no priority then priority 0 will run first
** when there is no priority that will run first.


     */




    @BeforeMethod
              public void  bm (){
        System.out.println("Before method");
    }

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\suboj\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
          driver = new ChromeDriver();
          driver.get("https://netflix.com");
        System.out.println(driver.getTitle());

    }



    @Test (priority = 1)
      public void test2(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\suboj\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.get("https://macys.com");
        System.out.println(driver.getTitle());


    }

/*
    @Test (priority = 2)
       public void test3(){
        System.out.println("Test3");
    }
*/

    @AfterMethod
    public void am(){
        System.out.println("After method");
    }
}

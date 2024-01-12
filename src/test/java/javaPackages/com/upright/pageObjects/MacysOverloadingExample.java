package javaPackages.com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class MacysOverloadingExample {
    static WebDriver  driver;

    @Test
       public  void browser() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome

        driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(1000);




    }
    @Test
     public static void selectBirthday(String day) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome

        driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");


         WebElement element1 = driver.findElement(By.id("ca-profile-birth-day"));
         Select select1 = new Select(element1);
         select1.selectByVisibleText("25");
         Thread.sleep(1000);

     }

     @Test
     public  static void selectBirthday(int Index) throws InterruptedException{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver(); // opeing chrome

         driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
         WebElement element = driver.findElement(By.id("ca-profile-birth-month"));
         Select select = new Select(element);
         select.selectByIndex(3);
         Thread.sleep(1000);



     }
}

package javaPackages.com.upright.pageObjects;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MacysSignUpPage {

    WebDriver driver;

    @Test




    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome

        driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.name("ca-profile-firstname"));
        firstName.sendKeys("Shifat");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.id("ca-profile-lastname"));
        lastName.sendKeys("Jahan");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Subo0325@yahoo.com");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("ca-profile-password"));
        password.sendKeys("Subo@0325");
        Thread.sleep(1000);

        // method over loading . OOP Concepts polymorphism. same method with differnet parameter. complie time




       WebElement element = driver.findElement(By.id("ca-profile-birth-month"));
        Select select = new Select(element);
        select.selectByIndex(3);
        Thread.sleep(1000);



        WebElement element1 = driver.findElement(By.id("ca-profile-birth-day"));
        Select select1 = new Select(element1);
        select1.selectByVisibleText("25");
        Thread.sleep(1000);


        WebElement textalert = driver.findElement(By.id("ca-profile-text-msg"));
        textalert.click();

        Thread.sleep(2000);
        WebElement phnnotxt = driver.findElement(By.id("ca-profile-phone"));
        phnnotxt.sendKeys("321-900-7545");


       WebElement getsecurityAlert = driver.findElement(By.id("ca-profile-security-alerts"));
        getsecurityAlert.click();
        Thread.sleep(2000);

      WebElement clickSubmit = driver.findElement(By.id("ca-profile-submit"));
      clickSubmit.click();

     //driver.quit();



    }

}

package javaPackages.com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Jahans_Page {


    WebDriver driver;
@Test

    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome

        driver.get("http://jahanprofile.click");
         Thread.sleep(2000);
        driver.findElement(By.id("projectTool")).sendKeys("JIRA");

        Thread.sleep(1000);
        driver.findElement(By.name("documentationTool")).sendKeys("Confluence");

        Thread.sleep(1000);
        driver.findElement(By.id("oopLanguage")).sendKeys("Java");

        Thread.sleep(1000);
        driver.findElement(By.name("automationTool")).sendKeys("Selenium");

        Thread.sleep(1000);
        driver.findElement(By.id("apiTool")).sendKeys("Postman");

        Thread.sleep(1000);
        driver.findElement(By.name("backendTool")).sendKeys("Mysql");

        Thread.sleep(1000);
        driver.findElement(By.id("mobileTool")).sendKeys("Appium");

        /*
           There are 2 type of xpath
           1. absolute xpath
           2. relative

           To find with xpath: first inspect the elemet then cntrl F then type
         */
         driver.findElement(By.xpath("/html/body/label[2]")).click();


        Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/label[4]")).click();

    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/label[5]")).click();


        Thread.sleep(1000);

       driver.findElement(By.linkText("Facebook")).click();
       driver.navigate().back();

       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

          driver.findElement(By.linkText("Linkdin")).click();


   // WebElement doctool = driver.findElement(By.name("documentationTool"));
    //doctool.sendKeys();

      driver.close();// driver.close will close the current browser
       //driver.quit(); // This will close all tabs / windows open by selenium. will close whole selenium session if its open 3 windows will close and clear background proccess




    }

}

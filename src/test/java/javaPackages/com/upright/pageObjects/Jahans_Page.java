package javaPackages.com.upright.pageObjects;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Jahans_Page {


    WebDriver driver;
@Test

    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome

        driver.get("http://jahanprofile.click");
         Thread.sleep(2000);
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

  Thread.sleep(2000);

    WebElement mode = driver.findElement(By.xpath("//img[@id = 'modeToggle']"));
    mode.click();

    WebElement About = driver.findElement(By.linkText("About"));
    About.click();

    driver.navigate().back();
   Thread.sleep(3000);
    WebElement Experience = driver.findElement(By.linkText("Experience"));
    Experience.click();


    Thread.sleep(2000);

    WebElement tool = driver.findElement(By.xpath("//input[@name = 'projectTool']"));
    tool.sendKeys("JIRA");
    Thread.sleep(2000);


    WebElement tool2 = driver.findElement(By.xpath("//input[@name = 'documentationTool']"));
    tool2.sendKeys("CONFLUENCE");

    Thread.sleep(2000);

    WebElement tool3 = driver.findElement(By.xpath("//input[@name = 'oopLanguage']"));
    tool3.sendKeys("JAVA");
    Thread.sleep(2000);


    WebElement tool4 = driver.findElement(By.xpath("//input[@name = 'automationTool']"));
    tool4.sendKeys("Selenium");

    Thread.sleep(2000);

    WebElement tool5 = driver.findElement(By.xpath("//input[@name = 'apiTool']"));
    tool5.sendKeys("postman");

    Thread.sleep(2000);

    WebElement tool6 = driver.findElement(By.xpath("//input[@name = 'backendTool']"));
    tool6.sendKeys("Mysql");
    Thread.sleep(2000);


    WebElement tool7 = driver.findElement(By.xpath("//input[@name = 'mobileTool']"));
    tool7.sendKeys("appium");
    Thread.sleep(2000);

   /* WebElement getCV = driver.findElement(By.xpath("//button[@class = 'btn btn-color-2']"));
    getCV.click();
  */




        /*
           There are 2 type of xpath
           1. absolute xpath
           2. relative

           To find with xpath: first inspect the elemet then cntrl F then type
         */






      //driver.close();// driver.close will close the current browser
       //driver.quit(); // This will close all tabs / windows open by selenium. will close whole selenium session if its open 3 windows will close and clear background proccess




    }

}

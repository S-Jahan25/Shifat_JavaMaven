package javaPackages.com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UprightAutomation {
    WebDriver driver;



    @Test

    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome
        driver.get("https://uprightautomation.online/");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement Registration = driver.findElement(By.linkText("Registration"));
        Registration.click();
        Thread.sleep(4000);

        WebElement firstName = driver.findElement(By.id("inputfname"));
        firstName.sendKeys("Shifat");

        WebElement lastName = driver.findElement(By.name("inputlname"));
        lastName.sendKeys("Jahan");
        Thread.sleep(4000);

        WebElement userName = driver.findElement(By.name("inputusername"));
        userName.sendKeys("Subo@2022");
        Thread.sleep(3000);

        WebElement enterEmail = driver.findElement(By.id("inputemail"));
        enterEmail.sendKeys("subo0325@yahoo.com");
        Thread.sleep(2000);

        WebElement enterPW = driver.findElement(By.name("inputpassword"));
        enterPW.sendKeys("Subo@2022");
        Thread.sleep(2000);

        WebElement confirmPW = driver.findElement(By.id("inputRePassword4"));
        confirmPW.sendKeys("Subo@2022");
        Thread.sleep(2000);

        WebElement birthDay = driver.findElement(By.id("inputbirth"));
        birthDay.sendKeys("03-25");
        Thread.sleep(2000);

        WebElement enterphn = driver.findElement(By.id("inputphone"));
        enterphn.sendKeys("3219007545");

        WebElement adress = driver.findElement(By.name("inputaddress"));
        adress.sendKeys("560 Oak Branch Cir");

        WebElement city = driver.findElement(By.id("inputCity"));
        city.sendKeys("Kissimmee");

        WebElement zipcode = driver.findElement(By.id("inputZip"));
        zipcode.sendKeys("34758");

        WebElement country = driver.findElement(By.id("inputcountry"));
        country.sendKeys("USA");

        WebElement submit = driver.findElement(By.name("inputsubmit"));
        submit.click();

        
    }
}
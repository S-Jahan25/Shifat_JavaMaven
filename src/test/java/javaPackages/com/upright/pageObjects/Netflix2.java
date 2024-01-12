package javaPackages.com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Netflix2 {
    WebDriver driver;

    @Test

    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome
        driver.get("https://www.netflix.com/");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement element = driver.findElement(By.xpath("//select[@name = 'LanguageSelect']"));
        Select select = new Select(element);
        select.selectByIndex(0);
        Thread.sleep(3000);

        WebElement signin = driver.findElement(By.xpath("//a[@id = 'signIn']"));
        signin.click();



        Thread.sleep(3000);
        WebElement signup = driver.findElement(By.xpath("//div[@class = 'login-signup-now']"));
        signup.click();

        Thread.sleep(3000);

        WebElement enterEmail = driver.findElement(By.xpath("//input[@autocomplete = 'email']"));
        enterEmail.sendKeys("subo0323@yahoo.com");
        Thread.sleep(3000);


        WebElement clickSubmit = driver.findElement(By.xpath("//button[@role = 'button']"));

        clickSubmit.click();




    }

}

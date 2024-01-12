package javaPackages.com.upright.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UprightForumSignUPPage {

    WebDriver driver;

@Test
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opening chrome

        driver.get("https://uprightforum.tech/registration/");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(1000);

    WebElement userName = driver.findElement(By.name("your-username"));
     userName.sendKeys("Shifat0325");
    Thread.sleep(1000);

    WebElement firstName = driver.findElement(By.name("your-first-name"));
    firstName.sendKeys("Shifat");
    Thread.sleep(1000);


      WebElement lastName = driver.findElement(By.name("your-last-name"));
      lastName.sendKeys("Jahan");
      Thread.sleep(1000);

      WebElement email = driver.findElement(By.name("your-email"));
      email.sendKeys("Subo0325@yahoo.com");
      Thread.sleep(1000);

      WebElement password = driver.findElement(By.name("your-password"));
      password.sendKeys("Shifat@0325");
      Thread.sleep(1000);

      WebElement confirmPassword = driver.findElement(By.name("your-confirm-password"));
      confirmPassword.sendKeys("Shifat@0325");
    Thread.sleep(1000);

    WebElement element = driver.findElement(By.id("your-account-type"));
    Select select = new Select(element);
    select.selectByVisibleText("Student");
    Thread.sleep(1000);


    WebElement element1 = driver.findElement(By.id("your-country"));
    Select select1 = new Select(element1);
    select1.selectByVisibleText("United States");
    Thread.sleep(1000);
// WebElement Linkdin = driver.findElement(By.linkText("in"));
  // Linkdin.click();


 WebElement register = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/form/div[9]/button"));
    register.click();
Thread.sleep(3000);
   // driver.quit();
}

// Interview QA: How did you handel alert?
    // I have to first switch to alert, then I use different methods like gettext, accept, dismiss. sendkeys.

  @Test
     public void handlingAlert(){


    String alertText =  driver.switchTo().alert().getText();
      System.out.println(alertText);

      driver.switchTo().alert().accept(); // it will click ok or yes
     // driver.switchTo().alert().dismiss(); // it will click NO or now now or igonore
      //driver.switchTo().alert().sendKeys("hello");


  }

}

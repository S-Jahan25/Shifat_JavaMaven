package javaPackages.com.upright.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class UprightForumSignupPage2 {

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

        // Test cases: Verify that " REGISTRATION Text is there or not.
        // text is another xpath method.
        // need to validate expect and actual rest matching or not
        // if expected and acrual matches then console will not show any error or give anything
        // otherwise it will show error and give me expected and actual.

        WebElement RegistrationText = driver.findElement(By.xpath("//a[text() = 'Registration']")); // this line identifying the text
       String uprightRegistrationText =  RegistrationText.getText(); // this line giving the exact text

        // with the help of soft assert we can go to next code and run even previous code  fails.
        SoftAssert obj = new SoftAssert();
        obj.assertEquals(uprightRegistrationText,"REGISTRATION");

        // this is hard assert . when this used and if test case fail it wont go next line.
     // Assert.assertEquals(uprightRegistrationText,"REGISTRATION");



        WebElement userName = driver.findElement(By.xpath("//input[@name = 'your-username' ]"));
        userName.sendKeys("Shifat0325");
        Thread.sleep(1000);


        // sending shifat to the first name inputbox
        WebElement firstName = driver.findElement(By.xpath("//input[@name = 'your-first-name']"));
        firstName.sendKeys("Shifat");
        Thread.sleep(1000);

// inserting jahan to the last name inputbox
        WebElement lastName = driver.findElement(By.xpath("//input[@name = 'your-last-name']"));
        lastName.sendKeys("Jahan");
        Thread.sleep(1000);


   // inserting email
        WebElement email = driver.findElement(By.xpath("//input[@name = 'your-email']"));
        email.sendKeys("Subo0325@yahoo.com");
        Thread.sleep(1000);

        // inserting pw
        WebElement password = driver.findElement(By.xpath("//input[@name ='your-password']"));
        password.sendKeys("Shifat@0325");
        Thread.sleep(1000);

// confirm pw

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name ='your-confirm-password']"));
        confirmPassword.sendKeys("Shifat@0325");
        Thread.sleep(1000);

        // account type student
        WebElement element = driver.findElement(By.xpath("//select[@name ='your-role']"));
        Select select = new Select(element);
        select.selectByVisibleText("Student");
        Thread.sleep(1000);

// selecting country
        WebElement element1 = driver.findElement(By.xpath("//select[@name = 'your-country']"));
        Select select1 = new Select(element1);
        select1.selectByVisibleText("United States");
        Thread.sleep(1000);


   //     WebElement Linkdin = driver.findElement(By.xpath(" //i [@class = 'fab fa-linkedin-in']"));
     //    Linkdin.click();



//clicking on registration button

      WebElement register = driver.findElement(By.xpath("//button[@type = 'submit']"));
       register.click();
        Thread.sleep(3000);

    obj.assertAll();    // using this and soft assert console will show wheres the error and fails the test casses.
        Thread.sleep(3000);
    }


  @Test
    public void handlingAlert() throws InterruptedException {
      Thread.sleep(3000);

        String alertText =  driver.switchTo().alert().getText();
      System.out.println(alertText);

      //   Assert is for condition validation check if the story requirement meets or not with the expected result.
        Assert.assertEquals(alertText,"Username is already exist");


       //  instead of assert I can use if else statements to validate the condition
     //  if (alertText.equalsIgnoreCase("Username is already exist")){
      //     System.out.println("Attempting to create a duplicate account");
      //  }


        driver.switchTo().alert().accept(); // it will click ok or yes
     //  driver.switchTo().alert().dismiss(); // it will click NO or now now or igonore
     //   driver.switchTo().alert().sendKeys("hello");



   }
}
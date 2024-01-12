package javaPackages.com.upright.pageObjects;

import io.cucumber.messages.types.Exception;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class MacysSignupPage2 {
    WebDriver driver;
    WebElement getsecurityAlert;

    @Test
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome

        driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(1000);

     //   WebElement Extra25percentOFF = driver.findElement(By.xpath("//span [ text () = 'EXTRA 25% OFF']"));
       // String EXTRA25percentOFF = Extra25percentOFF.getText();
        //SoftAssert obj = new SoftAssert();
        //obj.assertEquals(Extra25percentOFF, "EXTRA 25% OFF");






        WebElement firstName = driver.findElement(By.xpath("//input[@ name = 'ca-profile-firstname']"));
        firstName.sendKeys("Shifat");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.xpath("//input[@ name = 'ca-profile-lastname']"));
        lastName.sendKeys("Jahan");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.xpath("//input[@ name = 'email']"));
        email.sendKeys("Subo0325@yahoo.com");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.xpath("//input[@ name = 'password']"));
        password.sendKeys("Subo@0325");
        Thread.sleep(1000);


        WebElement element = driver.findElement(By.xpath("//select[@ name = 'ca-profile-birth-month']"));
        Select select = new Select(element);
        select.selectByIndex(3);
        Thread.sleep(1000);

        WebElement element1 = driver.findElement(By.xpath("//select[@ name = 'ca-profile-birth-day']"));
        Select select1 = new Select(element1);
        select1.selectByVisibleText("25");
        Thread.sleep(1000);

        WebElement textalert = driver.findElement(By.xpath("//input[@name = 'ca-profile-text-msg']"));
        textalert.click();

        Thread.sleep(2000);
        WebElement phnnotxt = driver.findElement(By.xpath("//input[@name = 'phone2']"));
        phnnotxt.sendKeys("321-900-7545");



/* selecting security allert checkbox and want to make sure that it is clicking or  or not. by using .isSelected method
    but when I only use .isSelected if its return false then My other functions scripts will stop. it wont go next line of code.
    if I use TRY CATCH and function/ condition returns false still my whole code/scripts will run. and at the end it will give me the
    expections / error . it wont stop my scripts.
     // finally { // finally means what ever I write in the code it will always run
            // boolean .isSelected will will be either security alert checkbox is selected or not. if selected then true else return false.
            // if I spell wrong or something it will return false. and it wont go to the next line

        //}

  */


        try {
            getsecurityAlert = driver.findElement(By.xpath("//input[@name = 'security-alerts']"));

        }
        catch (NoSuchContextException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finaly");
        }
        boolean getsecurityAlertisSelectedorNot = getsecurityAlert.isSelected();
        System.out.println(getsecurityAlertisSelectedorNot);
        if (getsecurityAlertisSelectedorNot==false){

            getsecurityAlert.click();
        }



        WebElement clickSubmit = driver.findElement(By.xpath("//button[@id = 'ca-profile-submit']"));
        clickSubmit.click();

   // obj.assertAll();
// driver.quit();
    }

}
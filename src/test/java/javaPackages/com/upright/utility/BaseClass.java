package javaPackages.com.upright.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass  {

    WebDriver driver;  // WebDriver is a interface . should not contain any body. it has many many method inside.
    String myBrowser; // global variable




    // methods
    // Intialize the browser
    // different browser has it own driver... 1. Chrome driver, firefox driver ( gecko driver), iedriver, operadriver,
    // safaridriver, edgedriver.
     /*
         The most popular and used one is Chrome st , 2nd firefox driver.
         to make it work , at first I need to download these driver after download the selenium dependency.

         go to : https://www.selenium.dev/downloads/
         * scroll down to Platforms Supported by Selenium and click on the -Browsers

         *.get , .navigate both are method...
         .naviget has = back, forward, refresh.
         .get = doesnt have anything but it will work as fully loaded the page.

         * Browser dont understand java comand, but with the help of driver = new ChromeDriver(); browser will make the connection.
         for that we need to install the driver first to our matchine and give the path.
         driver will go to the chrome path and establish the connection between the browser and java comand.
         * after the file path will transfer all my java comand to the browser.


      */

    public void loadProperties() throws IOException {   // this function is for loading the properties files information


        FileInputStream obj = new FileInputStream("C:\\Users\\suboj\\Batch7ShifatMaven\\src\\test\\java\\javaPackages\\com\\upright\\utility\\info.properties");


        // to get loaded all the information from the properties class first I ahve to create obj
        Properties prop = new Properties();  // created obj of the properties class
        prop.load(obj); // this line is loading all the properties file information.

        // I have to use String because its string type data.
      myBrowser = prop.getProperty("browser"); // this line will return the browser type from the info properties file.
        System.out.println(myBrowser);

       //String myUrl =  prop.getProperty("url");
        //System.out.println(myUrl);

    }



    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\suboj\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");


        if (myBrowser.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if (myBrowser.equals("firefox")) {
            driver = new FirefoxDriver(); // this is a constructor which is establish the connection with the browser.

        }
        else {
            System.out.println("Please Check your driver");
        }


        // driver.get mean it will wait until the driver gets loaded the whole page.
      //  driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");

        driver.navigate().to("https://d345bgfysrajcd.cloudfront.net"); //navigate.to , it will not wait until whole page loaded. it will go to next page

       driver.navigate().to("https://uprightforum.tech"); // This .navigate line will land right way not will until page fully loaded.
        

        driver.navigate().back(); // this line will take to the previous page
        driver.navigate().forward(); // this line will go to the next page.
        driver.navigate().refresh(); // it will refresh the page.


       String myCurrentURL =  driver.getCurrentUrl();
        System.out.println(myCurrentURL);

        String theTitle = driver.getTitle();
        System.out.println(theTitle);







       // driver.findElement(By.id("ca-profile-firstname")).sendKeys("Shifat");
       Thread.sleep(10000);

     //   driver.manage().window().maximize();  // this line comand will maximize the screen of window.
     //   driver.findElement(By.id("projectTool")).sendKeys("JIRA");
       // driver.quit();

      //  Select drop = new Select(driver.findElement(By.tagName("select")));
     //   drop.selectByIndex(1);


    }



    public static void main(String[] args) throws InterruptedException, IOException {
        BaseClass obj = new BaseClass();
        obj.loadProperties(); // calling method
        obj.launchBrowser();

    }
}

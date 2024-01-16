package javaPackages.testNG_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

    WebDriver driver;

   @Parameters ("myBrowser")
    @Test
    public void launchBrowser(String myBrowser) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\suboj\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");


       if (myBrowser.equals("chrome")) {
           driver = new ChromeDriver();
       } else if (myBrowser.equals("firefox")) {
           driver = new FirefoxDriver(); // this is a constructor which is establish the connection with the browser.

       } else {
           System.out.println("Please Check your driver");
       }

       driver.get("https://netflix.com");

   }
    }

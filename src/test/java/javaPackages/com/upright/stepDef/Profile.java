package javaPackages.com.upright.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Profile {
    WebDriver driver;
    String myTitle;
    String myUrl;
    String inputBox;


    @Given("The profile link is loaded in the browser")
    public void the_profile_link_is_loaded_in_the_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // opeing chrome
        Thread.sleep(3000);
        driver.navigate().to("http://jahanprofile.click/");

    }


    @When("user capture the title")
    public void user_capture_the_title() {
        myTitle = driver.getTitle();

    }
    @Then("the title should be something meaningful")
    public void the_title_should_be_something_meaningful() {
   //     if(myTitle.equalsIgnoreCase("Shifats Jahan")){
     //       System.out.println("The title is meaningful");
       // }
        //else {
          //  System.out.println("The title is not meaningful");
        //}
// Assert is also testing frame work tool. its coming from TESTNG & Junit. we cam we this instead of if else statement to validate.
        // Assert.assertEquals also method over loading from java.
        // actual is coming from application and expected is from story

        Assert.assertEquals(myTitle,"Shifats Jahan"); // this is another way of validation. this test will fail because my title which is from web is not match the expected


    }

    @When("user capture the url")
    public void user_capture_the_url() {

        myUrl = driver.getCurrentUrl();
        System.out.println(" the Url captured by Selenium is "+ myUrl);

    }
    @Then("the url should be with http and the name")
    public void the_url_should_be_with_http_and_the_name() {
        Assert.assertEquals(myUrl, "http://jahanprofile.click/");

    }








}

    



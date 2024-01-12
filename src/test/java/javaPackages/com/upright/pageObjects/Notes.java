package javaPackages.com.upright.pageObjects;

public class Notes {



    /*
       There are two types of expections.
       1. Implicitly wait -- it will wait a certain period (seconds) before thrpwing an exception during
       runtime if applicable. to all over the script whereever the class is extended

       2.explicitly wait: it will wait a certain period (seconds) before throwing an expection during runtime is applicable to only
       certain element.


       * There are 2 types of xpath:
       1. Absolute xpath: starts from root (/html/body/---
       disadvantage: sometimes developer change/delete/update the DOM stractures thats why then xpath wont be the same.



       2. reletive xpath: real time we use relative xpath. starts from aNywhere in the document and starts with // (double slash).
       Syntax - //tagname[@attritutibe = 'value']


       ***  What is the Root class/ interface of selenium : SearchContext.
        very common validation we do in selenium: they all reaturn True or False value
       1. boolean : isSelected();
       2. bollean isEnabled();
       3. String getText();
       4. boolean isDisplayed();
       5. assert , softassert and if else statements.

      *** Assert / soft assert : only use for validiton not all the time we need to use

*** selecting security allert checkbox and want to make sure that it is clicking or  or not. by using .isSelected method
but // boolean .isSelected will will be either security alert checkbox is selected or not. if selected then true else return false.
        // if I spell wrong or something it will return false. and it wont go to the next line
        my whole scripts will stop if its returning false.

     */

    /*        TRY CATCH : its a blocks of code. for Expection Handling
    Every important functionality we use Try catch
    It can be use everywhere unline assert only for validation.

     TRY CATCH / .isSelected is used for when particular element xpath is not found for many network/ and technical reason, server
     error,
     at that time using try catch will help other code/function/scripts running and at the end will give me error if any
     found. if I dont use it and for any reason x-path or any techinical issues any function / element is missing
     then my whole script/code will stop.

     */

    //
    // List <WebElements> traveling = driver.findElemets(By.xpath)
    //
    // when more than 1 elements like 2,3,4, or more than we need to use list <WebElements> and go by index to check which
    // element to use

   /*
       EXAMPLE OF HOW TO USE LIST<WebElement>

       List<WebElement> reading = drivier.findElements(By.xpath("//input[@name = 'hobby']"));
       reading.get(0).click();
       reading.get(1).click();
       reading.get(2).click();


    */





}

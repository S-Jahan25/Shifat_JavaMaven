package javaPackages.com.upright.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\suboj\\Batch7ShifatMaven\\src\\test\\java\\javaPackages\\com\\upright\\features\\Login.feature"}, glue={"javaPackages.com.upright.stepDef"},
plugin = { "pretty", "html:target/cucumber-reports/Cucumber.html"},
        publish = true)

public class RunnerClass {

}

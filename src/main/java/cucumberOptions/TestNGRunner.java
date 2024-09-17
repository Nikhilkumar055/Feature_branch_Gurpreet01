package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "com.Trailshoppy.com.Trailshoppy_Seller_Dashboard_step_defination", monochrome = true, 
tags = "@fillSignUpPage")
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
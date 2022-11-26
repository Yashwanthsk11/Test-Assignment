package CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/Features/Login.feature",
glue="stepDefinitions",monochrome=true,
plugin= {"pretty","html: target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	

}

package stepDefinitions.feature;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.uimap;

public class Geiger {
	public static WebDriver driver;
		

	@Given("user navigates to yourlogo Geiger website")
	public void user_navigates_to_yourlogo_Geiger_website() throws IOException {
	    
		System.setProperty("Webdriver.Chrome.driver","C:\\Program Files\\drivers");
		driver = new ChromeDriver();
		driver.get("https://yourlogo.geiger.com");  
		driver.manage().window().maximize();
		TakeScreenshot("Homepage");
	    System.out.println("Landed on geiger application");
	}
	
	@Given("user gets Register to Geiger application")
	public void user_gets_Register_to_Geiger_application() throws IOException {
		
		driver.findElement(uimap.register).click();
		driver.findElement(uimap.firstName).sendKeys("Harsha54");
		driver.findElement(uimap.LastName).sendKeys("Sai");
		driver.findElement(uimap.Email).sendKeys("Harshasai54@gmail.com");
		driver.findElement(uimap.PhoneNumber).sendKeys("7090709070");
		driver.findElement(uimap.Password).sendKeys("Harshasai1");
		driver.findElement(uimap.PasswordConf).sendKeys("Harshasai1");
		
		WebElement ddown = driver.findElement(uimap.SelectDropdown);
		Select select = new Select(ddown);
		select.selectByValue("Africa/Accra");
		select.selectByVisibleText("Accra");
		select.selectByIndex(3);
		TakeScreenshot("Registration page");
		driver.findElement(uimap.Registerbutton).click();
		
	}
	
	@When("user login into application with username and password")
	public void user_login_into_application_with_username_and_password() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(uimap.SignoutDropdown).click();  
		TakeScreenshot("Sign out page");
	    driver.findElement(uimap.SignoutButton).click();
	    Thread.sleep(2000);
	    TakeScreenshot("Application Logged out");
	    driver.findElement(uimap.SigninButton).click();
	    Thread.sleep(2000);
	    driver.findElement(uimap.Email).sendKeys("Harshasai54@gmail.com");
        driver.findElement(uimap.Password).sendKeys("Harshasai1");
       driver.findElement(uimap.Login).click();
       TakeScreenshot("Application Logged in");
	   System.out.println("Login Successful");
}
	
	@Then("Add product to cart and Validate the Product in payment page")
	public void Add_product_to_cart_and_Validate_the_Product_in_payment_page() throws InterruptedException, IOException {
		Thread.sleep(2000);
		WebElement Element=driver.findElement(uimap.Searchbar);
		Element.sendKeys("Sling bags");
		TakeScreenshot("Search Product");
		Element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	    driver.findElement(uimap.SelectProduct).click();
	    driver.findElement(uimap.AddtoOuote).click();
	    TakeScreenshot("Product added to cart");
	    Thread.sleep(2000);
	    
	    driver.findElement(uimap.Checkout).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(uimap.Address).sendKeys("5th Cross road");
	    driver.findElement(uimap.City).sendKeys("Florida");
	    driver.findElement(uimap.StateDropdown).click();
	    driver.findElement(uimap.Selectstate).click();
	    Thread.sleep(2000);
	    driver.findElement(uimap.PostalCode).sendKeys("123456");
	    TakeScreenshot("Product Checked out");
	    driver.findElement(uimap.ProceedtoCheckout).click();
	
	    System.out.println("Product Matched and checkedout");
	    driver.quit();
	}
	
	public static void TakeScreenshot(String FileName)
	        throws IOException
	    {
	      
	        File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	        FileUtils.copyFile(File, new File("C:\\Users\\YashwanthSaiKumar\\eclipse-workspace\\SeleniumTest1\\test-output\\Screenshots\\" +FileName+ ".jpeg"));
            
	                                    	    }

	}




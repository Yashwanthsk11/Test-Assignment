package pageObjects;

import org.openqa.selenium.By;

public class uimap {

	public static By register = By.xpath("(//a[@class='text-danger'])[2]");
	public static By firstName = By.xpath("//input[@id='first_name']");
	public static By LastName = By.xpath("//input[@id='last_name']");
	public static By Email = By.xpath("//input[@id='email']");
	public static By PhoneNumber = By.xpath("//input[@id='phone']");
	public static By Password = By.xpath("//input[@id='password']");
	public static By PasswordConf = By.xpath("//input[@id='password-confirm']");
	public static By SelectDropdown = By.name("timezone");
	public static By Registerbutton = By.xpath("(//button[@type='submit'])[3]");
	public static By SignoutDropdown = By.xpath("//button[@id='userDropdownButton']");
	public static By SignoutButton = By.xpath("(//button[@type='submit'])[3]");
	public static By SigninButton = By.xpath("(//a[@class='text-danger'])[1]");
	public static By Login = By.xpath("//button[contains(text(),'Log In')]");
	public static By Searchbar = By.xpath("//input[@type='search']");
	public static By SelectProduct = By.xpath("(//img[@class='card-img-top'])[1]");
	public static By AddtoOuote = By.xpath("(//button[@type='submit'])[4]");
	public static By Checkout = By.xpath("//a[contains(text(),'Checkout')]");
	public static By Address = By.xpath("//input[@id='street1']");
	public static By City = By.xpath("//input[@id='city']");
	public static By StateDropdown = By.xpath("//button[@class='btn dropdown-toggle btn-light bs-placeholder']");
	public static By Selectstate = By.xpath("(//button[@type='button'])[6]");
	public static By PostalCode = By.xpath("//input[@id='postal']");
	public static By ProceedtoCheckout = By.xpath("//button[@class='btn btn-success']");


	
	
	}


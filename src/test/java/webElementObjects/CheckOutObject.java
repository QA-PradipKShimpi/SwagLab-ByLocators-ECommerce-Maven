package webElementObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutObject 
{
	WebDriver driver;
	
	public CheckOutObject(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By cartLogo=By.xpath("//div//a[@data-test='shopping-cart-link']");
	
	private By checkout=By.xpath("//button[@name='checkout']");
	
	private By firstName=By.xpath("//input[@name='firstName']");
	private By lastName=By.xpath("//input[@name='lastName']");
	private By pincode=By.xpath("//input[@name='postalCode']");
	
	private By continuetext=By.xpath("//input[@name='continue']");
	
	public void cartLogo() 
	{
		driver.findElement(cartLogo).click();
	}
	
	public void checkout() 
	{
		driver.findElement(checkout).click();
	}
	
	public void details(String firstname, String lastname, String postcode) 
	{
		driver.findElement(firstName).sendKeys(firstname);
		
		driver.findElement(lastName).sendKeys(lastname);
		
		driver.findElement(pincode).sendKeys(postcode);
		
		System.out.println("details are passed");
	}
	
	public void continuetext() 
	{
		driver.findElement(continuetext).click();
		
		System.out.println("welcome to finish page");
	}

}

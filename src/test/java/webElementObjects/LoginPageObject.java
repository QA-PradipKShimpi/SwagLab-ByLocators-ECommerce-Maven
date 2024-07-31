package webElementObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageObject
{
	WebDriver driver;		// declared instance variable object
	
	public LoginPageObject(WebDriver driver) //Constructor to initialise object, WebDriver drive is coming from BAse class
	{
		this.driver= driver;
	}
	
	// Locate Web-Elements
	
	private By userName = By.xpath("//input[@id='user-name']");
	private By passWord	= By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//input[@id='login-button']");
		
	// Actions on located Web-Elements
	
	public void getTitle() 
	{
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Swag Labs"),"Title not matched");
		System.out.println("title matched..title is: "+title);
	}
	
	public void login(String username, String password) throws Exception 
	{
		Thread.sleep(3000);		
		driver.findElement(userName).sendKeys(username);
		driver.findElement(passWord).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	
	public void getCurrentUrl() 
	{
		String curl=driver.getCurrentUrl();
		Assert.assertTrue(curl.contains("inventory"),"looks like current url is incorrect");
		System.out.println("current url is: "+curl);
	}
	
			
}
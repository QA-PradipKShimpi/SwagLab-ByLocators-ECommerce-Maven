package webElementObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartListObject
{
	
	WebDriver driver;
	
	public CartListObject(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By cartList = By.xpath("//div[@id='checkout_summary_container']");
	
	private By finish = By.xpath("//button[@id='finish']");
	
	private By backtoHome= By.xpath("//button[@id='back-to-products']");

	public void cartList() 
	{
		List <WebElement> ite = driver.findElements(cartList);
		
		System.out.println("*****My cart details are******");
		
		for(WebElement i:ite)
		{
			System.out.println(i.getText());
			
		}
	}
	
	public void finish() throws Exception 
	{
		driver.findElement(finish).click();
		
		Thread.sleep(2000);
		driver.findElement(backtoHome).click();
	}
	
	
	
}

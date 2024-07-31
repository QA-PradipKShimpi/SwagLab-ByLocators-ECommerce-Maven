package webElementObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject
{
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By socials = By.xpath("//ul/li//a");
	
	private By menu = By.xpath("//button[@id='react-burger-menu-btn']");
	
	private By options = By.xpath("//div/nav[@class='bm-item-list']//a");
	
	
	
	public void socialLinks() 
	{
		List<WebElement>ite=driver.findElements(socials);
		
		System.out.println("***Social links are***");
		
		for(WebElement i:ite) 
		{
			System.out.println(i.getText()+":"+i.getAttribute("href"));
		}		
	}
	
	public void menu() 
	{
		driver.findElement(menu).click();
	}
	
	public void options() throws Exception 
	{
		List<WebElement>ite2=driver.findElements(options);
		
		System.out.println("***Menu options are****");
		
		for(WebElement ii:ite2) 
		{
			Thread.sleep(2000);
			System.out.println(ii.getText());
		}
	}
	
}	
	
	
	
	
	


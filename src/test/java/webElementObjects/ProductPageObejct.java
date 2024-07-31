package webElementObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageObejct
{
	WebDriver driver;
	
	public ProductPageObejct(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By item1=By.xpath("//div//button[@id='add-to-cart-sauce-labs-backpack']");
	
	private By productList=By.xpath("//a//div[@class='inventory_item_name ']");
	
	private By item2=By.xpath("//a//div[@class='inventory_item_name ']");
	
	public void item1() 
	{
		driver.findElement(item1).click();
		System.out.println("item1 selected");
	}
	
	public void productList() 
	{
		List <WebElement> ite= driver.findElements(productList);
		
		for(WebElement i:ite) 
		{
			System.out.println("Listed product is: "+i.getText());
		}
		System.out.println("count of listed products is: "+ite.size());		
	}
	
	public void item2(String product2) 
	{
		List <WebElement> ite2 = driver.findElements(productList);
		
		for(WebElement ii:ite2) 
		{
			if(ii.getText().contains(product2)) 
			{
				ii.click();
				driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
				break;
			}
			System.out.println("Selected item2 is: "+product2);
		}
	}
	
	
}	
package webElementObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductSortObject
{
	WebDriver driver;
	
	public ProductSortObject(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	private By sortItems = By.xpath("//select[@data-test='product-sort-container']");
	
	private By sortList = By.xpath("//select[@class='product_sort_container']");
	
	private By productsList = By.xpath("//a//div[@class='inventory_item_name ']");
	
	private By menus = By.xpath("//button[@id='react-burger-menu-btn']");
	
	private By logout = By.xpath("//div/nav[@class='bm-item-list']//a");
	
	public void sortitems() 
	{
		driver.findElement(sortItems).click();		
	}
	
	public void sortList() 
	{
		WebElement list = driver.findElement(sortList);		
		Select sel=new Select(list);
		
		System.out.println("*** sort options are ***");
		
		List<WebElement> ite=sel.getOptions();
		
		System.out.println("Options count is : "+ite.size());
		
		for(WebElement i:ite) 
		{
			System.out.println(i.getText());
			
		}		
		
	}
	
	public void ascending() 
	{
		WebElement ele =driver.findElement(sortList);
		Select sel=new Select(ele);
		
		sel.selectByVisibleText("Name (A to Z)");
				
		List<WebElement>allAsc=driver.findElements(productsList);
		
		System.out.println("***items sort Name (A to Z) order **** ");
		
		for(WebElement i:allAsc) 
		{
			System.out.println(i.getText());
		}		
	}
	
	public void descending() 
	{
		WebElement ele =driver.findElement(sortList);
		Select sel=new Select(ele);
		
		sel.selectByVisibleText("Name (Z to A)");
				
		List<WebElement>allDesc=driver.findElements(productsList);
		
		System.out.println("***items sort Name (Z to A) order **** ");
		
		for(WebElement i:allDesc) 
		{
			System.out.println(i.getText());
		}		
	}
	
	public void lowToHigh() 
	{
		WebElement ele =driver.findElement(sortList);
		Select sel=new Select(ele);
		
		sel.selectByVisibleText("Price (low to high)");
		
		List<WebElement>lth=driver.findElements(productsList);
		
		System.out.println("***items sort Price (low to high) order **** ");
		
		for(WebElement i:lth) 
		{
			System.out.println(i.getText());
		}		
	}

	public void highToLow() 
	{
		WebElement ele =driver.findElement(sortList);
		Select sel=new Select(ele);
		
		sel.selectByVisibleText("Price (high to low)");		
		
		List<WebElement>lth=driver.findElements(productsList);
		
		System.out.println("***items sort Price (high to low) order **** ");
		
		for(WebElement i:lth) 
		{
			System.out.println(i.getText());
		}		
	}
	
	
	public void menu() 
	{
		driver.findElement(menus).click();
	}
	
	public void logOut() throws Exception 
	{
		List<WebElement>ite2=driver.findElements(logout);
		
		System.out.println("***Thanks you for being here..signing off..****");
		
		for(WebElement ii:ite2) 
		{
			Thread.sleep(1000);
			if(ii.getText().contains("Logout")) 
			{
				ii.click();
				break;
			}
			
		}
	}
	
	
	
}

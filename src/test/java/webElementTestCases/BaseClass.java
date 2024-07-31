package webElementTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import webElementObjects.CartListObject;
import webElementObjects.CheckOutObject;
import webElementObjects.HomePageObject;
import webElementObjects.LoginPageObject;
import webElementObjects.ProductPageObejct;
import webElementObjects.ProductSortObject;

public class BaseClass
{
	public WebDriver driver;
	
	public LoginPageObject lpo; 
	
	public HomePageObject hpo;
	
	public ProductSortObject pso;
	
	public ProductPageObejct ppo;
	
	public CheckOutObject coo;
	
	public CartListObject clo;
	
	@BeforeTest
	public void openBrowserSetUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/"); 
		
		lpo=new LoginPageObject(driver);
		
		ppo=new ProductPageObejct(driver);
		
		coo=new CheckOutObject(driver);
		
		clo=new CartListObject(driver);
		
		hpo=new HomePageObject(driver);
		
		pso=new ProductSortObject(driver);
		
		System.out.println("browser setup completed");
	
	}
	
	
	
}

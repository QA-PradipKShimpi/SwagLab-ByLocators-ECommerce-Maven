package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductPageTestCase extends BaseClass
{
	@BeforeTest
	public void preRequisite() throws Exception 
	{
		lpo.getTitle();
		
		lpo.login("standard_user", "secret_sauce");
	
		lpo.getCurrentUrl();	//login preRequisites
	}
	
	@Test(priority=1)
	public void shopping() 
	{
		ppo.item1();
		
		ppo.productList();
		
		ppo.item2("Sauce Labs Bike Light");
		
	}
/*	
	@Test(priority=2)
	public void productList() 
	{
		ppo.productList();
	}	
	
	@Test(priority=3)
	public void item2() 
	{
		ppo.item2("Sauce Labs Bike Light");
	}
*/	
}

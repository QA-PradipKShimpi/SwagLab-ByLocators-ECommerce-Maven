package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckOutPageTestCase extends BaseClass
{
	@BeforeTest
	public void preRequisite() throws Exception 
	{
		lpo.getTitle();		
		
		lpo.login("standard_user", "secret_sauce");	
		
		lpo.getCurrentUrl();					//LoginPageObjects preRequisites
		
		//ProductPageObjects preRequisites
		ppo.item1();
		
		ppo.productList();
		
		ppo.item2("Sauce Labs Bike Light");		//ProductPageObjects preRequisites
		
	} 
	
	@Test
	public void checkout()
	{
		coo.cartLogo();
		
		coo.checkout();
		
		coo.details("Pradip", "Shimpi", "411041");
		
		coo.continuetext();
	}
	
	
}

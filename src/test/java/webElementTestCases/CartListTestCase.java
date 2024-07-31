package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartListTestCase extends BaseClass
{
	@BeforeTest
	public void preRequisite() throws Exception 
	{
		lpo.getTitle();		
		lpo.login("standard_user", "secret_sauce");			
		lpo.getCurrentUrl();					//LoginPageObjects preRequisites
		
		
		ppo.item1();		
		ppo.productList();		
		ppo.item2("Sauce Labs Bike Light");		//ProductPageObjects preRequisites
		
		coo.cartLogo();		
		coo.checkout();		
		coo.details("Pradip", "Shimpi", "411041");		
		coo.continuetext();						//CheckOutPageObjects preRequisites		
		
	} 
	
	@Test
	public void cartDetails() throws Exception
	{		
		clo.cartList();		
		
		clo.finish();
	}
}


















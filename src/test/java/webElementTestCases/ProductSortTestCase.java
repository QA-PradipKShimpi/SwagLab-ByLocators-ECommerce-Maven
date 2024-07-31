package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductSortTestCase extends BaseClass
{
	
	@BeforeTest
	public void preRequisite() throws Exception 
	{
		lpo.getTitle();		
		lpo.login("standard_user", "secret_sauce");			
		lpo.getCurrentUrl();						//LoginPageObjects preRequisites
	}
	
	@Test
	public void sortItems() throws Exception
	{
		pso.sortitems();
		
		pso.sortList();
		
		pso.ascending();	Thread.sleep(2000); 	
		
		pso.descending();	Thread.sleep(2000);		
		
		pso.lowToHigh();	Thread.sleep(2000); 	
		
		pso.highToLow();	Thread.sleep(2000); 		
		
		pso.menu();
		
		pso.logOut();
		
	
	}
}

package webElementTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTestCase extends BaseClass
{
	
	@BeforeTest
	public void preRequisite() throws Exception 
	{
		lpo.getTitle();		
		lpo.login("standard_user", "secret_sauce");			
		lpo.getCurrentUrl();						//LoginPageObjects preRequisites
	}
	
	
	@Test
	public void Home() throws Exception
	{
		
		hpo.socialLinks();	
	
		hpo.menu();
		
		hpo.options();
	}
}

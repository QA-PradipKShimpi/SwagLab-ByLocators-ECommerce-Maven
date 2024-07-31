package webElementTestCases;

import org.testng.annotations.Test;

public class LoginTestCase extends BaseClass // LoginTestCase inherited BaseClass to launch browser
{
	
	@Test
	public void LoginPage() throws Exception
	{
		lpo.getTitle();
		
		lpo.login("standard_user", "secret_sauce");
	
		lpo.getCurrentUrl();
	}
	
	
	
	
	
}

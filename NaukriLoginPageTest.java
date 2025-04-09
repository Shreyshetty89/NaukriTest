package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.NaukriHomePagePOM;
import pageObjects.NaukriLoginPagePOM;
import testBase.BaseClass;

public class NaukriLoginPageTest extends BaseClass {
	
	
	@Test
	public void LoginPageTest() throws InterruptedException {
		
		NaukriLoginPagePOM lp = new NaukriLoginPagePOM(driver);
		lp.login();
		lp.enter_username();
		lp.enter_pwd();
		lp.submit();
		Thread.sleep(10000);
		
		
		
		
	}

}

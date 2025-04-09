package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.NaukriHomePagePOM;
import testBase.BaseClass;

public class NaukriHomePageTest extends BaseClass {

	
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void basic_test() throws InterruptedException {
		
		NaukriHomePagePOM nhp = new NaukriHomePagePOM(driver);
		nhp.skill_search();
		nhp.total_experience();
		nhp.location_entry();
		nhp.submit();
		
		
	}
}

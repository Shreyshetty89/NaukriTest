package allure_reports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() {
		WebElement google_searchbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		google_searchbox.sendKeys("IPL", Keys.ENTER);
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}

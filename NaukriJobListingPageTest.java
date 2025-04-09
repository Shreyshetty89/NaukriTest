package testCases;

import org.testng.annotations.Test;

import pageObjects.NaukriHomePagePOM;
import pageObjects.NaukriJobListingPage;
import pageObjects.NaukriLoginPagePOM;
import testBase.BaseClass;

public class NaukriJobListingPageTest extends BaseClass {

	
	@Test
	public void joblistingpage() throws InterruptedException {
		
		
		NaukriLoginPagePOM lp = new NaukriLoginPagePOM(driver);
		lp.login();
		lp.enter_username();
		lp.enter_pwd();
		lp.submit();
		Thread.sleep(10000);
		
		NaukriHomePagePOM nhp = new NaukriHomePagePOM(driver);
		nhp.skill_search();
		nhp.total_experience();
		nhp.location_entry();
		nhp.submit();
		Thread.sleep(5000);
		
		NaukriJobListingPage jlp = new NaukriJobListingPage(driver);
		jlp.select_office_work_mode();
		jlp.job_search();
		jlp.sort_by();
		jlp.deselect_office_work_mode();
		jlp.select_hybrid_work_mode();
		jlp.deselect_hybrid_work_mode();
		jlp.select_remote_work_mode();
		jlp.deselect_remote_work_mode();
		jlp.years_of_experience();
		Thread.sleep(5000);
		
		
		
		
	}
}

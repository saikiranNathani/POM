package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LaunchPage;

public class TestCase1 {
	@Test
	public void tc01() {
		
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ebay.com");
		LaunchPage lp = PageFactory.initElements(driver, LaunchPage.class);
		lp.enterTextInToEbaySrchBox();
		lp.selectItemFromEbayDropDown();
		lp.clickOnEbaySrchBtn();

	}

}

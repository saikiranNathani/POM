package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.OR;

public class LaunchPage {

	@FindBy(id = OR.ebaySrchBoxObject)
	WebElement ebaySrchBoxObject;

	@FindBy(id = OR.ebayDropDownBoxObject)
	WebElement ebayDropDownBoxObject;

	@FindBy(id =OR.ebaySrchBtnObject )
	WebElement ebaySrchBtnObject;

	public void enterTextInToEbaySrchBox() {
		ebaySrchBoxObject.sendKeys("mobiles");
	}

	public void selectItemFromEbayDropDown() {
		Select sel = new Select(ebayDropDownBoxObject);
		sel.selectByVisibleText("Crafts");
	}

	public void clickOnEbaySrchBtn() {
		ebaySrchBtnObject.click();
	}

}

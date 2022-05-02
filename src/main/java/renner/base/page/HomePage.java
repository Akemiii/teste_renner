package renner.base.page;

import org.openqa.selenium.WebDriver;

import renner.base.locator.HomePageLocators;
import renner.base.webHelperUtils.WebActionsHelperUtils;

public class HomePage extends WebActionsHelperUtils implements HomePageLocators{

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
		
	public void EnterProductName(String productName) {
		clearField(Search_box);
		waitForElementToBeClickAble(Search_box, 10);
		enterTextIntoElement(Search_box, productName);
	}
	
	public void SearchProduct() {
		safeClick(Search_button);
	}
	
	public void LoginButton() {
		safeClick(Sign_button);
	}
	
}

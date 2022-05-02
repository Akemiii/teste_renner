package renner.base.page;

import org.openqa.selenium.WebDriver;

import renner.base.locator.ProcuraPageLocators;
import renner.base.webHelperUtils.WebActionsHelperUtils;

public class ProcuraPage extends WebActionsHelperUtils implements ProcuraPageLocators{
	
	public ProcuraPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void SelectProduct() {
		waitForElementToBeClickAble(Select_product, 10);
		safeClick(Select_product);
	}
	
	
}

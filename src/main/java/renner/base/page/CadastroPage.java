package renner.base.page;

import org.openqa.selenium.WebDriver;

import renner.base.locator.CadastroPageLocators;
import renner.base.webHelperUtils.WebActionsHelperUtils;

public class CadastroPage extends WebActionsHelperUtils implements CadastroPageLocators{

	public CadastroPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	
	
	
}

package renner.base.page;

import org.openqa.selenium.WebDriver;

import renner.base.locator.LoginPageLocators;
import renner.base.webHelperUtils.WebActionsHelperUtils;

public class LoginPage extends WebActionsHelperUtils implements LoginPageLocators{

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public void PreencherEmail(String email) {
		enterTextIntoElement(Email, email);
	}
	
	public void PreencherPassword(String password) {
		enterTextIntoElement(Password, password);
	}

	public void Logar() {
		safeClick(Login_button);
	}
	
}

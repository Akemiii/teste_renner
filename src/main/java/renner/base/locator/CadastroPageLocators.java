package renner.base.locator;

import org.openqa.selenium.By;

public interface CadastroPageLocators {
	By Email_create = By.id("email_create");
	By Submite_create = By.id("SubmitCreate");
	By Id_gender = By.id("id_gender1");
	By First_name = By.id("customer_firstname");
	By Last_name = By.id("customer_lastname");
	By Password = By.id("passwd");
	By Adress = By.id("address1");
	By City = By.id("city");
	By State = By.id("id_state");
	By PostCode = By.id("postcode");
	By Mobile = By.id("phone_mobile");
	By Alias = By.id("alias");
	By Account_create = By.id("submitAccount");
	By My_account = By.className("page-heading");
}

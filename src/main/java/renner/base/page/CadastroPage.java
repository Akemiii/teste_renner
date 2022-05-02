package renner.base.page;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import renner.base.locator.CadastroPageLocators;
import renner.base.webHelperUtils.WebActionsHelperUtils;

public class CadastroPage extends WebActionsHelperUtils implements CadastroPageLocators{

	public CadastroPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void CadastrarEmail() {
		safeClick(Submite_create);
	}
	
	public void PreencherEmail(String email) {
		enterTextIntoElement(Email_create, email);
	}
	
	public void PreencherPrimeiroNome(String first_name) {
		waitForElementToBeDisplayed(First_name, 10);
		enterTextIntoElement(First_name, first_name);
	}
	
	public void PreencherSobreNome(String last_name) {
		enterTextIntoElement(Last_name, last_name);
	}
	
	public void PreencherSenha(String password) {
		enterTextIntoElement(Password, password);
	}
	
	public void PreencherEndereco(String adress) {
		enterTextIntoElement(Adress, adress);
	}
	
	public void PreencherCidade(String city) {
		enterTextIntoElement(City, city);
	}
	
	public void PreencherEstado(String state) {
		enterTextIntoElement(State, state);
	}
	
	public void PreencherCodigoPostal(String postCode) {
		enterTextIntoElement(PostCode, postCode);
	}
	
	public void PreencherCelular(String mobile) {
		enterTextIntoElement(Mobile, mobile);
	}
	
	public void PreencherApelido(String alias) {
		enterTextIntoElement(Alias, alias);
	}
	
	public void CriarConta() {
		safeClick(Account_create);
	}
	
	public void VerificarConta() {
		assertEquals("MY ACCOUNT", getText(My_account));
	}
	
	
	
	
	
	
}

package renner.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renner.BaseSetUp;
import renner.base.page.CadastroPage;
import renner.base.page.HomePage;

public class Cadastro_steps extends BaseSetUp{
	
	HomePage homePage;
	CadastroPage cadastroPage;
	
	@Given("eu desejo realizar meu cadastro")
	public void eu_desejo_realizar_meu_cadastro() {
	     setDriver();
	     cadastroPage = new CadastroPage(driver);
	     
	     homePage = new HomePage(driver);

	     cadastroPage.navigateToUrl(url);
	     
	     homePage.LoginButton();
	     
	     cadastroPage.PreencherEmail(email);
	     cadastroPage.CadastrarEmail();
	}

	@When("preencher os dados")
	public void preencher_os_dados() {
		cadastroPage.PreencherPrimeiroNome("nome");
		cadastroPage.PreencherSobreNome("sobrenome");
		cadastroPage.PreencherSenha(password);
		cadastroPage.PreencherEndereco("adress");
		cadastroPage.PreencherCidade("City");
		cadastroPage.PreencherEstado("State");
		cadastroPage.PreencherCodigoPostal("00000");
		cadastroPage.PreencherCelular("1234567890");
		cadastroPage.CriarConta();
	}

	@Then("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() {
		cadastroPage.VerificarConta();
		killDriver();
	}
	
}

package renner.stepDefinitions;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renner.BaseSetUp;
import renner.base.page.HomePage;
import renner.base.page.ProcuraPage;
import renner.base.page.ProdutoPage;

public class Compra_steps extends BaseSetUp{

	HomePage homePage;
	ProcuraPage procuraPage;
	ProdutoPage produtoPage;
	
	@Given("como um cliente cadastrado no automationpractice")
	public void como_um_cliente_cadastrado_no_automationpractice() {
	     setDriver();
	     homePage = new HomePage(driver);
	     procuraPage = new ProcuraPage(driver);
	     produtoPage = new ProdutoPage(driver);
	     homePage.navigateToUrl(url);
	     homePage.LoginButton();
	}

	@When("^eu quero fazer a compra de ao menos três produtos$")
	public void eu_quero_fazer_a_compra_de_ao_menos_três_produtos(DataTable dataTable) {
		List<List<String>> data = dataTable.cells();
		for (int i = 1; i < data.size(); i++) {
			homePage.EnterProductName(data.get(i).get(0));
			homePage.SearchProduct();
			procuraPage.SelectProduct();
			produtoPage.SelectColor(data.get(i).get(1));
			produtoPage.SelectSize(data.get(i).get(2));
			produtoPage.SelectQuantity(data.get(i).get(3));
			produtoPage.AddtoCart();
			produtoPage.ContinueShopping();
		}
		
	}
	
	@Then("^para que eu possa estar bem vestida$")
	public void para_que_eu_possa_estar_bem_vestida() {
		
		
		killDriver();
	}

}

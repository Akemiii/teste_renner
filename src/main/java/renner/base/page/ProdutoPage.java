package renner.base.page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import renner.base.locator.ProdutoPageLocators;
import renner.base.webHelperUtils.WebActionsHelperUtils;

public class ProdutoPage extends WebActionsHelperUtils implements ProdutoPageLocators {

	public ProdutoPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void SelectColor(String color) {
		if (color == null)
			return;

		switch (color) {
		case "Green":
			safeClick(Color_green);
			break;
		default:
			break;
		}
	}

	public void SelectQuantity(String quantity) {
		if (quantity == null)
			return;		
		clearField(Quantity_field);
		enterTextIntoElement(Quantity_field, quantity);
	}

	public void SelectSize(String size) {
		if (size == null)
			return;
		SelectElement(Group_size, size);
	}
	
	public void AddtoCart() {
		safeClick(Add_cart);
	}
	
	public void ContinueShopping() {
		safeClick(Continue_shopping);
	}
	
	public void GoToCart() {
		safeClick(Shopping_cart);
	}
	
	public void Checkout() {
		safeClick(Checkout);
	}
	
	public void CheckoutAdress() {
		safeClick(Checkout_adress);
	}
	
	public void ProcessCarrier() {
		safeClick(ProcessCarrier);
	}
	
	public void TermService() {
		safeClick(Term_service);
	}
	
	public void Payment() {
		safeClick(Pay_bank_wire);
	}

	public void ConfirmOrder() {
		safeClick(Confirm_order);
	}
	
	public void VerifyOrder() {
		assertEquals("Your order on My Store is complete.", getText(Complete_order));
	}
}

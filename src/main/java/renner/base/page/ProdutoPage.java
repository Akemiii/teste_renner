package renner.base.page;

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

}

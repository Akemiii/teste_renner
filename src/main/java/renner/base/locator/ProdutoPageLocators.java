package renner.base.locator;

import org.openqa.selenium.By;

public interface ProdutoPageLocators {
	By Quantity_field = By.id("quantity_wanted");
	By Group_size = By.id("group_1");
	By Color_green = By.name("Green");
	By Add_cart = By.id("add_to_cart");
	By Continue_shopping = By.xpath("//span[@title='Continue shopping']");
	By Shopping_cart = By.className("shopping_cart");
	By Checkout = By.linkText("Proceed to checkout");
	By Term_service = By.id("cgv");
	By Pay_bank_wire = By.className("bankwire");
	By Confirm_order = By.xpath("//span[text()='I confirm my order']");
	By Complete_order = By.className("cheque-indent");
}

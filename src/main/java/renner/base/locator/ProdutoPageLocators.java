package renner.base.locator;

import org.openqa.selenium.By;

public interface ProdutoPageLocators {
	By Quantity_field = By.id("quantity_wanted");
	By Group_size = By.id("group_1");
	By Color_green = By.name("Green");
	By Add_cart = By.id("add_to_cart");
	By Continue_shopping = By.xpath("//span[@title='Continue shopping']");
	By Shopping_cart = By.xpath("//a[@title='View my shopping cart']");
	By Checkout = By.xpath("//span[text()='Proceed to checkout']");
	By Checkout_adress = By.name("processAddress");
	By ProcessCarrier = By.name("processCarrier");
	By Term_service = By.id("uniform-cgv");
	By Pay_bank_wire = By.className("bankwire");
	By Confirm_order = By.xpath("//span[text()='I confirm my order']");
	By Complete_order = By.className("cheque-indent");
}

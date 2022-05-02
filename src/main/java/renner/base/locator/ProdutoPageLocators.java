package renner.base.locator;

import org.openqa.selenium.By;

public interface ProdutoPageLocators {
	By Quantity_field = By.id("quantity_wanted");
	By Group_size = By.id("group_1");
	By Color_green = By.name("Green");
	By Add_cart = By.id("add_to_cart");
	By Continue_shopping = By.xpath("//span[@title='Continue shopping']");
}

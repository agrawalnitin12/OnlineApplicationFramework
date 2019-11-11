package or;

import org.openqa.selenium.By;

public class AdminIndexPage {
	public static By lnkLogout = By.linkText("Logoff");
	public static By lnkCustomers = By.linkText("Customers");
	public static By lnkOrders = By.linkText("Orders");
	public static By btnEdit = By.className("ui-button-text");
	public static By txtComments = By.name("comments");
	public static By btnUpdate = By.xpath("//*[@id=\'tdb4\']/span[2]");
}

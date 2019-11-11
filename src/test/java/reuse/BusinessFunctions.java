package reuse;

import org.openqa.selenium.WebDriver;

import commands.ActionDriver;
import config.StartBrowser;
import or.AdminIndexPage;
import or.AdminLoginPage;

public class BusinessFunctions {
  WebDriver driver;
  ActionDriver aDriver;
  
  public BusinessFunctions() {
	  driver = StartBrowser.driver;
	  aDriver = new ActionDriver();
  }
  
  public void navigatetoApp() {
	  StartBrowser.childTest= StartBrowser.parentTest.createNode("Application Launch");
	  aDriver.navigatetoApplication("http://www.gcrit.com/build3/admin/login.php");
  }
  
  public void elementExistence() throws Exception {
	  StartBrowser.childTest= StartBrowser.parentTest.createNode("Application Launch");
	  aDriver.elementExistence(AdminLoginPage.txtUserName, "User Name");
	  aDriver.elementExistence(AdminLoginPage.txtPassword, "Password");
	  aDriver.elementExistence(AdminLoginPage.btnLogin, "Login Button");
	  aDriver.elementExistence(AdminLoginPage.lnkCatalog, "Online Catalog");
  }
  
  public void login() throws Exception {
	  StartBrowser.childTest= StartBrowser.parentTest.createNode("Login to Application");
	  aDriver.type(AdminLoginPage.txtUserName, "admin", "User Name");
	  aDriver.type(AdminLoginPage.txtPassword, "admin@1234", "Password");
	  aDriver.click(AdminLoginPage.btnLogin, "Login Button");
  }
  
  public void logout() throws Exception {
	  StartBrowser.childTest= StartBrowser.parentTest.createNode("Logout of Application");
	  aDriver.click(AdminIndexPage.lnkLogout, "Logout link");
  }
  
  public void updateComments() throws Exception {
	  StartBrowser.childTest=StartBrowser.parentTest.createNode("Update Comments");
	  aDriver.click(AdminIndexPage.lnkCustomers, "Customer Link");
	  aDriver.click(AdminIndexPage.lnkOrders, "Orders Link");
	  aDriver.click(AdminIndexPage.btnEdit, "Edit button");
	  aDriver.type(AdminIndexPage.txtComments, "order", "Comments section");
	  aDriver.click(AdminIndexPage.btnUpdate, "Update button");
  }
}

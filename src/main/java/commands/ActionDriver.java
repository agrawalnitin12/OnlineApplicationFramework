package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import config.StartBrowser;

public class ActionDriver {
	static WebDriver driver;
	
	public ActionDriver() {
		driver = StartBrowser.driver;
	}
	public void navigatetoApplication(String url) {
		try {
		driver.get(url);
		StartBrowser.childTest.pass("Successfully navigated to : "+url);
		}catch (Exception e) {
			StartBrowser.childTest.fail("unable to navigate to : "+url);
		}
	}
	
	public void elementExistence(By locator, String elename) throws Exception {
		try {
		driver.findElement(locator).isDisplayed();
		StartBrowser.childTest.pass("Successfully found : "+elename);
		}catch(Exception e) {
			StartBrowser.childTest.fail("unable to find : "+elename, MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	
	public void click(By locator, String elename) throws Exception {
		try {
		driver.findElement(locator).click();
		StartBrowser.childTest.pass("Successfully clicked on : "+elename);
		}catch(Exception e){
			StartBrowser.childTest.fail("unable to click on: "+elename, MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	public void type(By locator, String text, String eleName) throws Exception {
		try {
		driver.findElement(locator).sendKeys(text);
		StartBrowser.childTest.pass("Successfully typed in: "+ eleName + "With data : "+text);
		}catch(Exception e) {
			StartBrowser.childTest.fail("unable to type in: "+eleName+ "with Data : " +text, MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	
	public String screenShot() {
	return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
}
}

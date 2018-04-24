package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObject.CaptureScreenshots;

public class PAgeObjectModel {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.20.0-win32\\gecko.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Pageobject.firstname(driver).sendKeys("Test");
		Pageobject.surname(driver).sendKeys("123");
		CaptureScreenshots.snapshots(driver, "test");
	}

}

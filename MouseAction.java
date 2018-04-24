package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseAction {

	public static void main(String[] args) {
	String baseUrl ="http://demo.guru99.com/test/newtours/";
	System.setProperty("wbdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.20.0-win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get(baseUrl);
	WebElement Link_Home=driver.findElement(By.linkText("Home"));
	//Web//Element td-Home=driver.findElement(By.xpath(""))
	

	}

}

package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PageObjFace {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pageobjectOnFacebook.Firstname(driver).sendKeys("Olive");
		pageobjectOnFacebook.Surname(driver).sendKeys("Getsy");
		pageobjectOnFacebook.MobileorEmail(driver).sendKeys("90909090090");
		pageobjectOnFacebook.Password(driver).sendKeys("1234567890");
		Select sel=new Select(pageobjectOnFacebook.Day(driver));
				sel.selectByVisibleText("22");
				Select sel1=new Select(pageobjectOnFacebook.Month(driver));
				sel1.selectByValue("4");
				Select sel2=new Select(pageobjectOnFacebook.Yeaar(driver));
				sel2.selectByIndex(25);
				pageobjectOnFacebook.Clickr(driver).click();
				
				
		
		
		
	}

}

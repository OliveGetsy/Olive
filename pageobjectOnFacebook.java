package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageobjectOnFacebook {
	public static WebElement element;
	public static WebElement Firstname(WebDriver driver)
	    {
		element=driver.findElement(By.xpath(".//*[@id='u_0_h']"));
		return element;
		}
	public static WebElement Surname(WebDriver driver)
    {
	element=driver.findElement(By.xpath(".//*[@id='u_0_j']"));
	return element;
	}
	public static WebElement MobileorEmail(WebDriver driver)
    {
	element=driver.findElement(By.id("u_0_m"));
	return element;
	}
	public static WebElement Password(WebDriver driver)
    {
	element=driver.findElement(By.name("reg_passwd__"));
	return element;
	}
	public static WebElement Day(WebDriver driver)
    {
	element=driver.findElement(By.cssSelector("#day"));
	return element;
	}
	public static WebElement Month(WebDriver driver)
    {
	element=driver.findElement(By.name("birthday_month"));
	return element;
	}
	public static WebElement Yeaar(WebDriver driver)
    {
	element=driver.findElement(By.cssSelector("#year"));
	return element;
	}
	public static WebElement Clickr(WebDriver driver)
    {
	element=driver.findElement(By.cssSelector(".//*[@id='u_0_z']"));
	return element;
	}
	
	
	
	
	

}

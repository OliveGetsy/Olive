package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageobject {
	public static WebElement ele;
	
	public static WebElement firstname(WebDriver driver )
	{
		ele=driver.findElement(By.id("u_0_h"));
		return ele;
		
	}
	public static WebElement surname(WebDriver driver ) 
	{
		ele=driver.findElement(By.id("u_0_j"));
	return ele;
	
	}
	
	

}

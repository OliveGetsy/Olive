package trail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RebusBaic {
	public static WebElement element;
	public static WebElement RedbusFrom(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='src']"));
		return element;
	}
	public static WebElement RedbusTo(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='dest']"));
		return element;
	}

	public static WebElement SelectDate(WebDriver driver)
	 {
	   element=driver.findElement(By.xpath(".//*[@id='onward_cal']"));
		element.click();
	  element=driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']"));
		element.click();
		element=driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[7]"));
		element.click();
		return element;
	 }
	
	public static WebElement SearchBus(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='search_btn']"));
		return element;
	}
	

}























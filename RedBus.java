package selinium;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("Go");
	List <WebElement> ele=	driver.findElements(By.cssSelector(".autoFill>li"));
	for(int i=0;i<ele.size();i++)
	{
		String text=driver.findElements((By.cssSelector(".autoFill>li"))).get(i).getText();
		if(text.equalsIgnoreCase("Gobichettipalaiyam"))
		{
			driver.findElements(By.cssSelector(".autoFill>li")).get(i).click();
		}
	}
		
		
	}
}

package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Trailon {


	public static void main(String[] args) throws Exception

			{
		
				System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.20.0-win32\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.navigate().to("https://www.redbus.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("Chennai");
				Thread.sleep(3000);
				WebElement elem1=driver.findElement(By.xpath(".//*[@id='dest']"));
				elem1.sendKeys("Erode ByPass");
				WebElement elem2=driver.findElement(By.xpath(".//*[@id='onward_cal']"));
				elem2.click();
				WebElement elem3=driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']"));
				elem3.click();
				WebElement elem4=driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[2]"));
				elem4.click();
//				Actions act=new Actions(driver);
//						act.moveToElement(elem3).sendKeys(Keys.ENTER).build().perform();	
						
			}

	}


package selinium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[1]/td[3]/input")).sendKeys("olive.getsy");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[3]/input")).sendKeys("christsaves22");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='matchStartPlace']")).sendKeys("CHEN");
		
		List <WebElement> ele=	driver.findElements(By.cssSelector(".ui-menu-item>a"));
		for(int i=0;i<ele.size();i++)
		{
			String text=driver.findElements((By.cssSelector(".ui-menu-item>a"))).get(i).getText();
			if(text.equalsIgnoreCase("CHENNAI ADYAR"))
			{
				driver.findElements(By.cssSelector(".ui-menu-item>a")).get(i).click();
			}
		}
		
		
		}
		
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckoderiver.exe");
		 driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tnstc.in/TNSTCOnline/advanceBooking.do;jsessionid=542F9C3848701FB89E9ACC19AA54F22D");
		
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	
  }

}

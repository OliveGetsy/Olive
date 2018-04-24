package trail1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromExcelforTnstc
{
public static void main(String Args[]) throws Exception
{
	System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.tnstc.in/TNSTCOnline/advanceBooking.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Excel_Read.getCellData("D:\\Selinium-Getsy\\Selinium\\src\\trail1\\tnstc.xlsx", "Sheet1");
	driver.findElement(By.xpath(" html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[1]/td[3]/input")).sendKeys(Excel_Read.getCellData(0, 0));
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[3]/input")).sendKeys(Excel_Read.getCellData(1, 1));
	driver.findElement(By.xpath(".//*[@id='matchStartPlace']")).sendKeys(Excel_Read.getCellData(2, 2));
	driver.findElement(By.xpath(".//*[@id='matchEndPlace']")).sendKeys(Excel_Read.getCellData(3, 3));
	
	
	
	
}
	
}

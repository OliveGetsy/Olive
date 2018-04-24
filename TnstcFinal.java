package trail1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TnstcFinal {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.20.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.tnstc.in/TNSTCOnline/advanceBooking.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		Excel_Read.getCellData("D:\\Selinium-Getsy\\Selinium\\src\\trail1\\tnstc.xlsx", "Sheet1");
		TnstcSkeleton.Tnstcusername(driver).sendKeys(Excel_Read.getCellData(0, 0));
		TnstcSkeleton.Tnstcpassw(driver).sendKeys(Excel_Read.getCellData(1, 1));
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]/div/a")).click();
		TnstcSkeleton.Tnstcfrom(driver).sendKeys(Excel_Read.getCellData(2, 2));
		Thread.sleep(1000);
		TnstcSkeleton.Tnstcto(driver).sendKeys(Excel_Read.getCellData(3, 3));
		
	}

}

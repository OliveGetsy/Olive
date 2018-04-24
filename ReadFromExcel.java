package trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.20.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ExcelRead.getCellData("D:\\Selinium-Getsy\\Selinium\\src\\trail\\datadriven.xlsx", "Sheet1");
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys(ExcelRead.getCellData(0, 0));
		driver.findElement(By.xpath(".//*[@id='dest']")).sendKeys(ExcelRead.getCellData(1, 1));
	}

}

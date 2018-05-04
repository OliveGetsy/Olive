package JavaBasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Hdfc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette", "D:\\Deepak\\gekcodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://www.hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		for (String a : driver.getWindowHandles()) {		
		driver.switchTo().window(a);		
		}	
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		String child = driver.getWindowHandle();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
	//driver.findElement(By.className("input_password")).sendKeys("123465");	
		for (String a1 : driver.getWindowHandles()) {	
		driver.switchTo().window(a1);			
		}
		
		driver.findElement(By.xpath(".//input[class='input_password']")).sendKeys("123456");
		driver.switchTo().window(parent);
	}
}
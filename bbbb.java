package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bbbb {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.20.0-win32\\gecko.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys("mmmm");
		driver.findElement(By.id("u_0_h")).sendKeys("mmmmm");
	}

}

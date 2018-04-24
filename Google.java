package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {


			public static void main(String[] args) {
			System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckoderiver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/webhp?ie=UTF-8&rct=j");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("gs_htif0")).sendKeys("CHEN");
			
			

	}

}

package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fourth {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".mbs._52lq.fsl.fwb.fcb>span"));
		
		
		/*WebElement loginButton=driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		 boolean check= loginButton.isDisplayed();
		 if(check=true)
		 {
			 System.out.println("It dispalyed");
		 }
			 else
				 System.out.println("not displayed");
		 */
	}

}

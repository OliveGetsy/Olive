package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAgain {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.Facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
driver.switchTo().frame(0);

	WebElement dragme=driver.findElement(By.xpath(".//*[@id='login_link']/div[1]/a"));
        WebElement dropme=driver.findElement(By.xpath(".//*[@id='loginbutton']"));
       Actions act=new Actions(driver);
   act.clickAndHold(dragme).moveToElement(dropme).release().build().perform();
	}

}

package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Fifth {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
		WebElement ele1= 	driver.findElement(By.xpath(".//*[@id='privacy-link']"));
		WebElement ele2=driver.findElement(By.xpath(".//*[@id='cookie-use-link']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele2).build().perform();
		
		
		
		
		//act.moveToElement(ele).click(ele).keyDown(Keys.SHIFT).sendKeys("cloth").keyUp(Keys.SHIFT).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/a"));
		//WebElement ele=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input"));
		
		

	}

}

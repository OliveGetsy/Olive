package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();
		driver.switchTo().frame(0);

		WebElement dragme=driver.findElement(By.xpath(".//*[@id='draggable']"));
        WebElement dropme=driver.findElement(By.xpath(".//*[@id='droppable']"));
        Actions act=new Actions(driver);
       act.clickAndHold(dragme).moveToElement(dropme).release().build().perform();
        
        
        
      //  act.dragAndDrop(dragme, dropme).perform();
	
	}

}

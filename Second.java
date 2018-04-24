package selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Second {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath(".//*[@id='privacy-link']")).click();
		for(String z:driver.getWindowHandles())
		{
			driver.switchTo().window(z);
		}
		driver.findElement(By.xpath(".//*[@id='u_0_e']/div/div[1]/div/div[1]/a")).click();
		System.out.println(driver.getWindowHandle());
		driver.switchTo().window(parent);
		
		//driver.findElement((By.xpath(".//*[@id='u_0_e']/div/div[1]/div/div[1]/a")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebDriverWait wait= new WebDriverWait(driver,5);
		//wait.until(ExpectedCondtions.a);
		
		
		
		/*driver.findElement(By.id("u_0_l")).sendKeys("Olive");
		driver.findElement(By.id("u_0_n")).sendKeys("Getsy");
		driver.findElement(By.id("u_0_q" )).sendKeys("987654321");
		driver.findElement(By.name("reg_passwd__")).sendKeys("trttrt");*/
		
		
		
		
		/*
		driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[2]/td[3]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
	}

}

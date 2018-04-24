package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.Facebook.com");
			
			driver.findElement(By.id("u_0_l")).sendKeys("Olive");
			driver.findElement(By.id("u_0_n")).sendKeys("Getsy");
			
		driver.findElement(By.id("u_0_b")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[5]/div/div[1]/input")).sendKeys("Olivia");
		//driver.findElement(By.xpath(".//*[@id='u_0_q']")).sendKeys("ol8324");
		//driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Olive");
		//System.out.println(driver.findElement(By.xpath(".//*[@id='u_0_l']")).getAttribute(""));
		WebElement element=driver.findElement(By.xpath(".//*[@id='u_0_n']"));
		element.sendKeys("see");
		System.out.println(element.getAttribute("1234"));
		element.clear();
		
		
		
		
		
		
		
		
			//driver.findElements(By.tagName("input")).size();
			
			//driver.findElement(By.linkText("Forgotten account?")).click();
			//driver.findElement(By.partialLinkText("Dat")).click();
		}

	}

	



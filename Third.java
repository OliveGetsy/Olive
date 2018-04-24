package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Third {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.facebook.com/");
		driver.get("file:///D:/Selinium-Getsy/trail.html");
		driver.findElement((By.xpath("html/body/button"))).click();
		Alert alt= driver.switchTo().alert();
		//alt.accept();
		System.out.println(alt.getText());
		alt.dismiss();
		

	}

}

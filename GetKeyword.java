package keywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetKeyword {
	public static WebDriver driver;
	public static void openBrowser()
	{
		System.setProperty("webdriver.firefox.marionette", " D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	public static void navigateUrl()
	{
		driver.get(FaceBookConstant.Url);
		driver.manage().window().maximize();
	}
	public static void inputUsername()
	{
		driver.findElement(By.id("u_0_h")).sendKeys("Test");
	}
	public static void inputsurname() 
	{
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Test");
	}
	public static void inputEmailorMobile() 
	{
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("402456977123");
	}
	public static void InputPassword() 
	{
		driver.findElement(By.xpath(".//*[@id='u_0_t']")).sendKeys("98klofdf");
	}
	
}


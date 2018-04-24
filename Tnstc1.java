package selinium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tnstc1 {
	public static void main(String[] args) {
		
	//System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.tnstc.in/TNSTCOnline/advanceBooking.do;jsessionid=542F9C3848701FB89E9ACC19AA54F22D");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[1]/td[3]/input")).sendKeys("olive.getsy");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[3]/input")).sendKeys("christsaves22");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]/div/a")).click();
	driver.findElement(By.xpath(".//*[@id='matchStartPlace']")).sendKeys("CHEN");
	
		List <WebElement> ele=	driver.findElements(By.cssSelector(".ui-menu-item>a"));
		for(int i=0;i<ele.size();i++)
		{
			String text=driver.findElements((By.cssSelector(".ui-menu-item>a"))).get(i).getText();
			if(text.equalsIgnoreCase("CHENNAI ADYAR"))
			{
				driver.findElements(By.cssSelector(".ui-menu-item>a")).get(i).click();
			}
		}
	
	driver.navigate().to("https://www.facebook.com/");
	WebElement day=driver.findElement(By.xpath(".//*[@id='day']"));
Select sel=new Select(day);
sel.selectByVisibleText("16");

WebElement month=driver.findElement(By.xpath(".//*[@id='month']"));
Select sel1=new Select(month);
sel1.selectByValue("4");
WebElement year=driver.findElement(By.xpath(".//*[@id='year']"));
Select sel2=new Select(year);

sel2.selectByIndex(2);
}
}



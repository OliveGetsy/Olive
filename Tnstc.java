package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tnstc {

	public static void main(String[] args) {
	System.setProperty("webdriver.firefox.marionette","D:\\Selinium-Getsy\\geckodriver-v0.19.1-win32\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.tnstc.in/TNSTCOnline/advanceBooking.do;jsessionid=542F9C3848701FB89E9ACC19AA54F22D");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[1]/td[3]/input")).sendKeys("olive.getsy");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[3]/input")).sendKeys("christsaves22");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]/div/a")).click();
	driver.findElement(By.xpath(".//*[@id='matchStartPlace']")).sendKeys("CHEN");
	
	int count=driver.findElements(By.cssSelector(".ui-menu-item")).size();
	//System.out.println(driver.findElements(By.cssSelector(".ui-menu-item")).size());
	for(int i=0;i<count;i++)
	{
		String s=driver.findElements(By.cssSelector(".ui-menu-item>a")).get(i).getText();
		if(s.equalsIgnoreCase("CHENNAI ADYAR"))
		{
     driver.findElements(By.cssSelector(".ui-menu-item>a")).get(i).click();
       }
	}
	
	
	}
	}
	



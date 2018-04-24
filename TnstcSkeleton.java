package trail1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TnstcSkeleton {
	public static WebElement ele;
	public static WebElement Tnstcusername(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[1]/td[3]/input"));
		return ele;
	}
	public static WebElement Tnstcpassw(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[3]/input"));
		return ele;
	}
	public static WebElement Tnstcfrom(WebDriver driver)
	{
		ele=driver.findElement(By.xpath(".//*[@id='matchStartPlace']"));
		return ele;
	}
	
	public static WebElement Tnstcto(WebDriver driver)
	{
		ele=driver.findElement(By.xpath(".//*[@id='matchEndPlace']"));
		return ele;
	}

}

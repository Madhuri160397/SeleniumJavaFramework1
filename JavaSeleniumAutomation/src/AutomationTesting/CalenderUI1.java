package AutomationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderUI1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	
	System.out.println (driver.findElement(By.id("Div1")).getAttribute("style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println (driver.findElement(By.id("Div1")).getAttribute("style"));
	
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	{
		System.out.println ("its enabled");
		Assert.assertTrue(true);
		
	}
		else
		{
			
			Assert.assertTrue(false);
		}
		
	}

		
//	WebElement IsEnabled = driver.findElement(By.id("ctl00_mainContent_view_date2"));
//	System.out.println (IsEnabled.isEnabled());
//	Assert.assertFalse(IsEnabled.isEnabled());
//	
//	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//	System.out.println (IsEnabled.isEnabled());
//	Assert.assertTrue(IsEnabled.isEnabled());
//	
//		
//		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
//		driver.findElement(By.className("div[class*='css-1dbjc4n']")).click();
		
		

	}



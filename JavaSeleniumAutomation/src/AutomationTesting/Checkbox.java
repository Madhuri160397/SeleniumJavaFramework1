package AutomationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
//		//System.out.println (driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
//		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
//     	WebElement Checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
//		Checkbox.click();
//		System.out.println (Checkbox.isSelected());
//		Assert.assertTrue(Checkbox.isSelected());
		 
		WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));

		Assert.assertFalse(checkbox.isSelected());
		System.out.println (checkbox.isSelected());
		
		checkbox.click();

		Assert.assertTrue(checkbox.isSelected());
		System.out.println (checkbox.isSelected());
		
		 //count the no of checkboxes
		 System.out.println (driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}

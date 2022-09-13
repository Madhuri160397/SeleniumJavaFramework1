package AutomationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
	
		   driver.get("https://www.google.com/");
		   driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		   driver.navigate().back(); driver.navigate().forward();
		   driver.navigate().refresh();
		  
		  
	}		
}

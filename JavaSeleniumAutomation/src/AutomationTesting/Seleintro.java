package AutomationTesting;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleintro {

	public static void main(String[] args) {

		//Invoking browser
		//chrome-chromedriver-methods-we need to create the object of the class to access the methods present in the class
		
//ChromeDriver driver = new ChromeDriver(); -driver object here has access to all the methods of chrome driver
//WebDriver driver = new ChromeDriver(); -driver object here has access to the methods of chrome driver which are defined in web driver interface.
		//chromedriver.exe will nvoke chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		driver.close();
	}

	
	
}

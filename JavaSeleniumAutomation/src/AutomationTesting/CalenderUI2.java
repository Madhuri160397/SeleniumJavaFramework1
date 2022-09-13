package AutomationTesting;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		//April14
		driver.findElement(By.cssSelector("p[data-cy='departureDate']")).click();
		
		java.util.List<WebElement> Dates =driver.findElements(By.cssSelector("DayPicker-Day"));
		
		int count =driver.findElements(By.cssSelector("DayPicker-Day")).size();
		for(int i =0; i<count; i++)
		{
			String text =driver.findElements(By.cssSelector("DayPicker-Day")).get(i).getText();
			if(text.equalsIgnoreCase("31")) {
				driver.findElements(By.cssSelector("DayPicker-Day")).get(i).click();
				break;
			}
		}
	}

}

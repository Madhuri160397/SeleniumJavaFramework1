package AutomationTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(" .blinkingText")).click();
		Set <String> Windows =driver.getWindowHandles();
		Iterator<String> it = Windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		 driver.switchTo().window(childid);
		 
		System.out.println( driver.findElement(By.cssSelector(".im-para.red")).getText());
		String Emailid =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0].trim();
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(Emailid);
		
	}

}

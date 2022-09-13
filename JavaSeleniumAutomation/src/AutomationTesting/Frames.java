package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.findElements(By.tagName("iframe")).size();
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		WebElement Drag= driver.findElement(By.cssSelector("#draggable"));
		WebElement Drop = driver.findElement(By.cssSelector("#droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(Drag, Drop).build().perform();
		//we can switched to the frame bu using string , frame id and webelement
		
		driver.switchTo().defaultContent();//come back on normal page
		
	
		
	}

}

package AutomationTesting;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDscope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement FooterLink = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(FooterLink.findElements(By.tagName("a")).size());

		// WebElement Column = driver.findElement(By.cssSelector(""))
		WebElement Colmn1 = FooterLink.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));
		System.out.println(Colmn1.findElements(By.tagName("a")).size());

		for (int i = 1; i < Colmn1.findElements(By.tagName("a")).size(); i++) {

			String CLickonLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Colmn1.findElements(By.tagName("a")).get(i).sendKeys(CLickonLinks);
			Thread.sleep(5);
		}
			Set<String> windows = driver.getWindowHandles();
			java.util.Iterator<String> it = windows.iterator();
			
			
			while (it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle()); 
			}

		}
	}



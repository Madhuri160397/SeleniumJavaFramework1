package AutomationTesting;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise2 {

	public static void main(String[] args) {
		; // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String[] phones = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		Login(driver);
		AddToCart(driver, phones);
	}

	public static void Login(WebDriver driver) {

		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		WebElement checkbox = driver.findElement(By.className("checkmark"));
		checkbox.click();
		checkbox.isSelected();
		Select dropdown = new Select(driver.findElement(By.cssSelector("select[class='form-control']")));
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector(" #signInBtn")).click();

	}

	private static void AddToCart(WebDriver driver, String[] phones) {
		// TODO Auto-generated method stub

		List<WebElement> Items =  driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for (int i = 0; i < Items.size(); i++) {
			String name = Items.get(i).getText();
			Items.get(i).click();
			}
		driver.findElement(By.partialLinkText("Checkout")).click();

		}
	
	
	}



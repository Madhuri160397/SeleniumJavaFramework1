package AutomationTesting;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// WebDriverWait w =new WebDriverWait(driver, 5);
		WebDriverWait w = new WebDriverWait(driver,5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] veggies = { "Cucumber", "Brocolli", "Beetroot" };
		AddToCart(driver, veggies);
//		 Sele_SynchronizationWaits sync = new Sele_SynchronizationWaits();
//		 sync.AddToCart(driver, veggies);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter promo code']")));

		driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();

	    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		

	}

	public static void AddToCart(WebDriver driver, String[] veggies) {
		int j = 0;

		List<WebElement> Items = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < Items.size(); i++) {
			String[] name = Items.get(i).getText().split("-");
			String Formattedname = name[0].trim();

			List ItemsNeeded = Arrays.asList(veggies);

			if (ItemsNeeded.contains(Formattedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == veggies.length) {
					break;
				}

			}
		}

	}

}

package AutomationTesting;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j = 0;
//		
//		String [] items = {"Cucumber","Brocolli"};
//		
//		List <WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
//		 
//		for(int i=0; i <Products.size(); i++)
//		{
//			String name = Products.get(i).getText();
//			
//			
//			if (name.contains("Cucumber"))
//			{
//				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//				
//			}
//		}

		String[] veggies = { "Cucumber", "Brocolli" };

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

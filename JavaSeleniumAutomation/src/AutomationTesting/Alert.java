package AutomationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Madhuri";

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();

		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		String alertmessage1 = driver.switchTo().alert().getText();
		System.out.println(alertmessage1);

		driver.switchTo().alert().dismiss();

	}

}

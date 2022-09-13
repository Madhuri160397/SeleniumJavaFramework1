package AutomationTesting;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "madhuri";
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium
		// Driverss\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Selenium
		// Driverss\\geckodriver.exe");
		// WebDriver driver =new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(Password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("P")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("P")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}

	public static String getpassword(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String passwordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] PasswordArray = passwordText.split("'");
		// String[] PasswordArray2 = PasswordArray[1].split("'");
		// PasswordArray2[0]
		String Password = PasswordArray[1].split("'")[0];
		return Password;
		// 0th index - Please use temporary password

		// 1st index - rahulshettyacademy' to Login.

		// 0th index - rahulshettyacademy

		// 1st index - to Login.

	}
}

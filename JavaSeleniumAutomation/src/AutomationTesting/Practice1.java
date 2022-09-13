package AutomationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/"); 
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Madhuri Borse");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("test");
		
		WebElement checkbox = driver.findElement(By.className("form-check-input"));
		checkbox.click();
		checkbox.isSelected();
		Assert.assertTrue(checkbox.isSelected());
		System.out.println (checkbox.isSelected());
		
		
		Select dropdown = new Select (driver.findElement(By.id("exampleFormControlSelect1")));
		dropdown.selectByVisibleText("Female");
		
		
		WebElement radiobutton = driver.findElement(By.id("inlineRadio1"));
		radiobutton.click();
		radiobutton.isSelected();
		Assert.assertTrue(radiobutton.isSelected());
		System.out.println (radiobutton.isSelected());
		
		WebElement calender = driver.findElement(By.className("form-control"));
		calender.click();
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		System.out.println (driver.findElement(By.className("alert")).getText());
		Assert.assertEquals(driver.findElement(By.className("alert")).getText(),"Success! The Form has been submitted successfully!.");
		
		
		
		
		
		
		
	}

}

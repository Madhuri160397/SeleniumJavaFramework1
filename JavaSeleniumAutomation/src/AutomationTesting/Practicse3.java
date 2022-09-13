package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		Select dropdown= new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		dropdown.selectByVisibleText(opt);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(opt);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String text =driver.switchTo().alert().getText();
		if(text.contains(opt))
		{
			System.out.println("text is matching");
		}
		else
		{
			System.out.println("text not matching");
		}
		
	}

}

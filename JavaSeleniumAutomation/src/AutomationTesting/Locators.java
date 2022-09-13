package AutomationTesting;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {
	
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Madhuri");
		driver.findElement(By.name("inputPassword")).sendKeys("Madhuri");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Madhuri");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9096293329");
        driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
      //driver.findElement(By.className("go-to-login-btn")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'forgot-pwd-btn-conainer')]/button[1]")).click();
        Thread.sleep(1000);
    	driver.findElement(By.id("inputUsername")).sendKeys("Madhuri");
    	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
      //driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.cssSelector("input[name*='chkboxTwo']")).click();
      //driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
      
        
	}

}

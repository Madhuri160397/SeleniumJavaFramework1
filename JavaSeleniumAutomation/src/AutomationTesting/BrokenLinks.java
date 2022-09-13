package AutomationTesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\Selenium Driverss\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	      java.util.List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

	      SoftAssert a =new SoftAssert();

	     

	      for(WebElement link : links)

	      {

	       

	          String url= link.getAttribute("href");

	         

	          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

	          conn.setRequestMethod("HEAD");

	          conn.connect();

	          int respCode = conn.getResponseCode();

	          System.out.println(respCode);

	          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

	         

	     

	      }

	     

	      a.assertAll();
//	java.util.List<WebElement> links=	driver.findElements(By.cssSelector("//li[class = 'gf-li'] a"));
//	SoftAssert a= new SoftAssert();
//	
//	for(WebElement link : links)
//	{
//		String url = link.getAttribute("href");
//	     HttpURLConnection conn =	(HttpURLConnection)new URL(url).openConnection();
//	     conn.setRequestMethod("HEAD");
//	     conn.connect();
//	   int responsecode=  conn.getResponseCode();
//	   System.out.println(responsecode);
//	  a.assertTrue(responsecode>400,"The link with text" + link.getText() + " is broken with code" +responsecode );
////	   if (responsecode>400)
////	   {
////		   System.out.println("The link with text" + link.getText() + " is broken with code" +responsecode);
////		   Assert.assertTrue(false); 
////	   }
//	}
//	a.assertAll();
		
		//broken url
		//step 1 get all the urls tied up to the links
		//java methods will call urls and get you the status code
		//if status code is >400
//		String url = driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
//	     HttpURLConnection conn =	(HttpURLConnection)new URL(url).openConnection();
//	     conn.setRequestMethod("HEAD");
//	     conn.connect();
//	   int responsecode=  conn.getResponseCode();
//	   System.out.println(responsecode);
//		                                       
	}
}

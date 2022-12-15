package SelTestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// Notes - We can skip executing a particular method by adding @Ignore annotation , 
public class TestNG_IgnoreMethods {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/default.asp");
	}
	@Test
	public void verifyHomePage()
	{
		
		String title = driver.getTitle();
		System.out.println("w3schools-HTML page title is : "+ title);
		Assert.assertEquals(title, "HTML Tutorial", "Title is not matching");
		System.out.println("w3schools-HTML Home page title is : "+ title);
	}
	@Ignore
	@Test
	public void verifyHTMLBasicsPage()
	{
		driver.findElement(By.linkText("HTML Basic")).click();
		String title = driver.getTitle();
		System.out.println("w3schools-HTML Basic page title is : "+ title);
		Assert.assertEquals(title, "HTML Basic", "Title is not matching");
	}	
	@Test
	public void verifyHTMLLinksPage()
	{
		driver.findElement(By.linkText("HTML Links")).click();
		String title = driver.getTitle();
		System.out.println("w3schools-HTML Links page title is : "+ title);
		Assert.assertEquals(title, "HTML Links Hyperlinks", "Title is not matching");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}





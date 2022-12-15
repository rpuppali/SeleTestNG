package SelTestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAssertion {
	
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();
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
	public void titleTest()
	{
		
		boolean b = driver.findElement(By.linkText("Log in")).isDisplayed();
		softassert.assertTrue(b, "Log in button is displayed");
		System.out.println("Login button is displayed ");
		
		String title = driver.getTitle();
		System.out.println("w3schools-HTML page title is : "+ title);
		//Update wrong title name to fail the test 
		softassert.assertEquals(title, "HTML Tutorial2", "Title is not matching");
		
		//SoftAssertion will let execution continue in-spite of failed condition. System.out.println("Login Page is displayed ");
		boolean c =driver.findElement(By.xpath("(//a[@class='w3-right w3-btn'])[1]")).isDisplayed();
		softassert.assertTrue(c, "Next button is displayed");
		System.out.println("Next button is displayed ");
	}
	
	
		

	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		softassert.assertAll();
	}
}

package SelTestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_HardAssertion {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");
	}

	@Test
	public void titleTest()
	{
		String title = driver.getTitle();
		System.out.println("Google page title is : "+ title);
		Assert.assertEquals(title, "Google", "Title is not matching");
	}
	
	@Test
	public void logoTest()
	{
		boolean b = driver.findElement(By.xpath("//*[@class ='lnXdpd']")).isDisplayed();
		Assert.assertTrue(b);

	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

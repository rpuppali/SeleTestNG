package SelTestNGBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_GoogleFreatureTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.edge.driver", driverPath);
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
	}
	
	@Test
	public void logoTest()
	{
		boolean b = driver.findElement(By.xpath("//*[@class ='lnXdpd']")).isDisplayed();
	}
	
	@Test
	public void signInTest()
	{
		boolean b = driver.findElement(By.xpath("//*[@class ='lnXdpd']")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

package SelTestNGBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Groups {
	
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

	@Test(priority =1,groups = { "login"})
	public void titleTest()
	{
		String title = driver.getTitle();
		System.out.println("Google page title is : "+ title);
	}
	
	@Test(priority =3,groups = { "login", "signin" })
	public void logoTest()
	{
		boolean b = driver.findElement(By.xpath("//*[@class ='lnXdpd']")).isDisplayed();
		System.out.println("priority =3");
	}
	
	@Test(priority =2,groups = { "signin" })
	public void signInTest()
	{
		boolean b = driver.findElement(By.xpath("//*[@class ='lnXdpd']")).isDisplayed();
		System.out.println("priority =2");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

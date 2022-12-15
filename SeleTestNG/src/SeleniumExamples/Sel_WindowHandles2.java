package SeleniumExamples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Script to close all tabs except parent tab.
public class Sel_WindowHandles2 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://drt1-www.cna.com/web/guest/cna/home");
	    }	
	@Test
	public void test1() {
		driver.findElement(By.linkText("Investor Relations")).click();
		String parentWindowHandles =  driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();	
		for(String s : handles)
		{
			driver.switchTo().window(s);
			if(!s.equals(parentWindowHandles))
			{
				driver.close();
			}
		}
		
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	

}

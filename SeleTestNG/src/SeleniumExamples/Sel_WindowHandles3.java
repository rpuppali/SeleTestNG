package SeleniumExamples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Script to close specific window
	public class Sel_WindowHandles3 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    }	
	@Test
	public void test1() {
		//String parentWindowHandles =  driver.getWindowHandle();
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String> handles = driver.getWindowHandles();	
		for(String s : handles)
		{
			String temp1= driver.switchTo().window(s).getTitle();
			System.out.println(temp1);
			if(temp1.equals("AlertsDemo - H Y R Tutorials"))
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

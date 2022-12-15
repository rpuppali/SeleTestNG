package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_ActionClassConetextClick {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cna.com/web/guest/cna/home");
	}
	@Test
	public void ContextClick() throws InterruptedException
	{
		 
		Actions mouseActions = new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("//span[text()='Products & Solutions']"));
		mouseActions.moveToElement(hover).perform();
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
} 

package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_LocatorsExamples {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://github.com/login");
		}
	
	@Test
	public void seleniumLcoators() throws InterruptedException {
		//Locator(1) - Id
		highLighterMethod(driver , driver.findElement(By.id("login_field")));
		Thread.sleep(3000);
		
		//Locator(2) - Name
		highLighterMethod(driver , driver.findElement(By.name("password")));
		Thread.sleep(3000);
		
		//Locator(3) - Class Name
		highLighterMethod(driver , driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		
		//Locator(3) - Partial text
		highLighterMethod(driver , driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(3000);
		
		//Locator(3) - Link text
		highLighterMethod(driver , driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(3000);
		
		//Locator(3) - tag name
		highLighterMethod(driver , driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
				
		//Locator(3) - cssselector
		highLighterMethod(driver , driver.findElement(By.cssSelector("input[name='commit']")));
		Thread.sleep(3000);
				
		//Locator(3) - xpath
		highLighterMethod(driver, driver.findElement(By.xpath("//label[text()[normalize-space()='Username or email address']]")));
		Thread.sleep(3000);
	}

	public void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		}
		
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}

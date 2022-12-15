package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_HandleTextBox {
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
	@Test(priority =1)
	public void loginScreen() throws InterruptedException
	{  
		 WebElement login = driver.findElement(By.xpath("//input[@name ='login']"));
		 if(login.isDisplayed()){
			
				if (login.isEnabled())
				{
					login.clear();
					login.sendKeys("rpuppali");
					Thread.sleep(2000);
				} else 
				System.out.println("Login field is not enabled");
				
			}
				else 
				System.out.println("Login field is not displayed");
		 
		 
		 WebElement password = driver.findElement(By.xpath("//input[@name ='password']"));
		 if(password.isDisplayed()){
			
				if (password.isEnabled())
				{
					password.clear();
					password.sendKeys("rpuppali");
					Thread.sleep(2000);
				} else 
				System.out.println("Password field is not enabled");
				
			}
				else 
				System.out.println("Password field is not displayed");
		 	}

	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}

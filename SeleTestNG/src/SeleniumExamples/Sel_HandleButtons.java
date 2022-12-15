package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_HandleButtons {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		}
	@Test(priority =1)
	public void loginScreen() throws InterruptedException
	{  
		 WebElement radioBtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		 if(radioBtn.isDisplayed()){
			
				if (radioBtn.isEnabled())
				{
					radioBtn.click();
					Thread.sleep(2000);
				} else 
				System.out.println("Login field is not enabled");
				
			}
				else 
				System.out.println("Login field is not displayed");
		 
		 
		 WebElement checjbx1 = driver.findElement(By.xpath("//input[@id='englishchbx']"));
		 if(checjbx1.isDisplayed()){
			
				if (checjbx1.isEnabled())
				{
					checjbx1.click();
					Thread.sleep(2000);
				} else 
				System.out.println("Check box 1 field is not enabled\\\"");
				
			}
				else 
				System.out.println("Check box 2 field is not enabled\\\"");
		 
		 
		 WebElement checjbx2 = driver.findElement(By.xpath("//input[@id='hindichbx']"));
		 if(checjbx2.isDisplayed()){
			
				if (checjbx2.isEnabled())
				{
					checjbx2.click();
					Thread.sleep(2000);
				} else 
				System.out.println("Check box 2 field is not enabled");
				
			}
				else 
				System.out.println("Check box 2 field is not enabled\"");
		 	}

	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}

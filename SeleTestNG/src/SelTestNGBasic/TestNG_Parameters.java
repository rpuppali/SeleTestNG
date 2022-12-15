package SelTestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*  add two lines in testng.xml
 *  <parameter name ="browser" value="edge"></parameter>
 *  <parameter name ="username" value="reach.raghava"></parameter>
 */
public class TestNG_Parameters {
	
	WebDriver driver;
	@Test
	@Parameters({"browser" ,"username"})
	public void setUp(String browser, String username) {
		String chrome_driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		String edge_driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\msedgedriver.exe";
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", chrome_driverPath);
		driver = new ChromeDriver();
		} else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", edge_driverPath);
			driver = new EdgeDriver();
		}
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys(username);
		String title = driver.getTitle();
		System.out.println("Google page title is : "+ title);
		driver.quit();
	}

	

}

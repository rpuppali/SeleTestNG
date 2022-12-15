package SelTestNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_launchChromeBrowser {
	WebDriver driver;
	
	@BeforeTest
	public void initialSetup()
	{
		// TODO Auto-generated method stub
		//set path of msedgedriver.exe path
	      System.setProperty("webdriver.edge.driver",
	         "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe");
	      //instance of EdgeDriver
	      driver = new ChromeDriver();
	}
	@Test
	public void openURL() throws InterruptedException
	{
		driver.get("https://www.cna.com");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
     }
	@AfterTest
	public void close() {
		driver.close();
	}
	
}

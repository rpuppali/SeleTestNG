package SelTestNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG_launchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set path of msedgedriver.exe path
	      System.setProperty("webdriver.edge.driver",
	         "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe");
	      //instance of EdgeDriver
	      WebDriver driver = new ChromeDriver();
	      //URL launch
	      driver.get("https://www.cna.com");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      driver.close();
		
	}

}

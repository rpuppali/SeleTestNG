package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_HandleAlertBox {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		 System.setProperty("webdriver.chrome.driver",
		         "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		}
	
//	@Test(priority =1 )
//	public void alertBox() throws InterruptedException {
//		
//		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//	}
//	
//	@Test(priority =2 )
//	public void confirmBox() throws InterruptedException {
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert();
//		//System.out.println(temp);
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		
//		driver.findElement(By.id("confirmtBox")).click();
//		Thread.sleep(2000);
//		String temp2 = driver.switchTo().alert().getText();
//		System.out.println(temp2);
//		driver.switchTo().alert().dismiss();
//		System.out.println(driver.findElement(By.id("output")).getText());
//	}
	
	@Test (priority =3)
	public void promptBox() throws InterruptedException {
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		String temp = driver.switchTo().alert().getText();
		System.out.println(temp);
		driver.switchTo().alert().sendKeys("Hello John");
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}

package SelTestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
// testngxml is attached at end of the test
public class TestNG_EnableDisableTests {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String driverPath = "C:\\Users\\reach\\eclipse-workspace\\browserdrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/default.asp");
	}
	@Test
	public void verifyHomePage()
	{
		
		String title = driver.getTitle();
		System.out.println("w3schools-HTML page title is : "+ title);
		Assert.assertEquals(title, "HTML Tutorial", "Title is not matching");
		System.out.println("w3schools-HTML Home page title is : "+ title);
	}
	@Test
	public void verifyHTMLBasicsPage()
	{
		driver.findElement(By.linkText("HTML Basic")).click();
		String title = driver.getTitle();
		System.out.println("w3schools-HTML Basic page title is : "+ title);
		Assert.assertEquals(title, "HTML Basic", "Title is not matching");
	}	
	@Test
	public void verifyHTMLLinksPage()
	{
		driver.findElement(By.linkText("HTML Links")).click();
		String title = driver.getTitle();
		System.out.println("w3schools-HTML Links page title is : "+ title);
		Assert.assertEquals(title, "HTML Links Hyperlinks", "Title is not matching");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

/*
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
 	<!--<parameter name ="browser" value="edge"></parameter>-->
   	<!--<parameter name ="username" value="reach.raghava"></parameter>-->
   <test name = "HTML default page" enabled ="true"> 
  	<classes>
      <class name="SeleniumExamples.TestNG_EnableDisableTests">
      	<methods>
      		<include name = "verifyHomePage" />
      	</methods>
      	</class>
     </classes>
    </test>
    
    <!-- Test 2 -->
    <test name = "HTML Basic page"  enabled ="false"> 
  	<classes>
      <class name="SeleniumExamples.TestNG_EnableDisableTests">
      	<methods>
      		<include name = "verifyHTMLBasicsPage" />
      	</methods>
      	</class>
     </classes>
    </test>
    <!-- Test 3 -->
    <test name = "HTML links page" enabled ="true"> 
  	<classes>
      <class name="SeleniumExamples.TestNG_EnableDisableTests">
      	<methods>
      		<include name = "verifyHTMLLinksPage" />
      	</methods>
      	</class>
     </classes>
    </test>
</suite> <!-- Suite -->

 */





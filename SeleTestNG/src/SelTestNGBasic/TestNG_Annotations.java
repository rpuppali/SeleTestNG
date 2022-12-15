package SelTestNGBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/* @BeforeSuite,@AfterSuite,@BeforeTest,@AfterTest,@BeforeClass and @AfterClass are executed only once.
 * @BeforeMethod,@AfterMethod annotations are executed repeatedly before every test execution.
 * Precedence :
 * @BeforeSuite,@BeforeTest,@BeforeClass,@BeforeMethod and @Test
 * @AfterMethod,@AfterClass,@AfterTest and @AfterSuite
 */
public class TestNG_Annotations 
{
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite - Set system property for chrome");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest - Launch chrome browser");
	}
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass - Login to gmail");
	}
	@BeforeMethod
	public void verifyTitl1e() {
		System.out.println("@BeforeMehttod - Verify the titl1e");
	}
	@Test
	public void sendMail() {
		System.out.println("@Test- Send an email");
	}
	@Test
	public void verifyinSentMail1() {
		System.out.println("@Test- Verify in sent mail");
	}
	@AfterMethod
	public void verifyTitle2() {
		System.out.println("@AfterMehttod - Verify the send mail page title");
	}
	@AfterClass
	public void logout() {
		System.out.println("@AfterClass- Logout from gmail");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("@AfterMethod-Close the browser");
	}
	@AfterSuite
	public void verifyinSentMail() {
		System.out.println("@AfterSuite- Check results");
	}
}

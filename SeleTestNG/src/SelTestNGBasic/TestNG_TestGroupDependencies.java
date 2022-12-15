package SelTestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
// Note: testngxml is attached by end of the test
public class TestNG_TestGroupDependencies {
	WebDriver driver;
	@Test(groups = "sanity")
	public void test1() {
		System.out.println("sanity");
	}
	@Test(groups = "sanity")
	public void test2() {
		System.out.println("sanity");
	}
	@Test(groups = { "sanity" })
	public void test3() {
		System.out.println("sanity");
		// Failed the test in smoke
		System.out.println(1/0);
		}
	@Test(groups = { "miniregression" })
	public void test4() {
		System.out.println("miniregression");
	}
	@Test(groups = { "miniregression" })
	public void test5() {
		System.out.println("miniregression");
	}
	@Test(groups = { "main" })
	public void test6() {
		System.out.println("main");
	}
	@Test(groups = { "main" })
	public void test7() {
		System.out.println("main");
	}
	@Test(groups = { "main" })
	public void test8() {
		System.out.println("main");
	}
	@Test(groups = { "main" })
	public void test9() {
		System.out.println("main");
	}
}

/*
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
 	<!--<parameter name ="browser" value="edge"></parameter>-->
   	<!--<parameter name ="username" value="reach.raghava"></parameter>-->
   <test name = "HTML default page"> 
  	
  	<groups>
   		<dependencies>
   			<group name="miniregression" depends-on="sanity"></group>
   			<group name="main" depends-on="miniregression"></group>
   		</dependencies>
  	</groups>
  	<classes>
      <class name="SeleniumExamples.TestNG_TestGroupDependencies">
      </class>
     </classes>
    </test>
    
   
</suite> <!-- Suite -->

 */

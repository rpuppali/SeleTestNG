package SelTestNGBasic;

import org.testng.annotations.Test;

public class TestNG_InvocationCount {
	
	@Test(invocationCount = 4)
	public void test1() {
		
		int i =10;
		int j =20;
		int z= i+j;
		System.out.println("Sum of i and j is: "+ z);
		
	}

}

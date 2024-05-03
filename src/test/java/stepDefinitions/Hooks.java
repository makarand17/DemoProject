package stepDefinitions;


import Utilities.Helper;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	
	@Before (order = 0)
	 public static void setUP() {
		System.out.println("---------------------------- Inside Hooks method method   -----------------------------");

		Helper.setUpDriver();
	}
	
		
	@After
	public void tearDown() {
		Helper.tearDown();
	}
	
	
	
	

}

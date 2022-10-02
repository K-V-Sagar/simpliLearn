package loanapplications;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanApplicationTests {

	@BeforeTest
	public void setupTestData() {
		System.out.println("Setting up Test Data");
	}
	
	@AfterTest
	public void cleanupTestData() {
		System.out.println("Cleaning up Test Data");
	}
	
	@BeforeMethod
	public void dosomething() {
		System.out.println("Hello");
	}
	
	@BeforeSuite
	public void startDatabase() {
		System.out.println("Starting db server");
	}
	
	@Test
	public void HomeLoanLoginWeb() {
		System.out.println("Home Loan Application - Web Login Test");
	}
	
	@Test
	public void HomeLoanLoginMobile() {
		System.out.println("Home Loan Application - Mobile Login Test");
	}
	
	@Test(groups= {"Smoke"})
	public void HomeLoanLoginAPI() {
		System.out.println("Home Loan Application - API Login Test");
	}
	
}

package loanapplications;

import org.testng.annotations.Test;

public class CarLoanApplicationTests {
	
	@Test(timeOut=4000)
	public void CarLoanLoginWeb() {
		System.out.println("Car Loan Application - Web Login Test");
	}
	
	@Test(enabled=false)
	public void CarLoanLoginMobile() {
		System.out.println("Car Loan Application - Mobile Login Test");
	}
	
	@Test(dependsOnMethods= {"CarLoanLoginWeb"})
	public void CarLoanLoginAPI() {
		System.out.println("Car Loan Application - API Login Test");
	}
	
}

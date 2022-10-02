package loanapplications;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoanApplicationTests {
	
//	Passing Parameter Through XML
	@Parameters({"URL"})
	@Test()
	public void PersonalLoanLoginWeb(String url) {
		System.out.println("Personal loan application - web login test");
		System.out.println("Weg login url= " + url);
	}
	
	@Test
	public void PersonalLoanLoginMobile() {
		System.out.println("Personal Loan Application - Mobile Login Test");
	}
	
	@Test
	public void PersonalLoanLoginAPI() {
		System.out.println("Personal Loan Application - API Login Test");
	}
	
}

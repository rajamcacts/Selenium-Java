package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC005_DuplicateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC005";
	}

	@Test(dataProvider = "getData")
	public void tc002_duplicateLead(String cn, String fn, String ln) throws InterruptedException {
		new LoginPage()
		.enterusername()
		.enterpassword()
		.clicklogin()
		.clickcfmsfa()
		.clickleads()
		.clickFindLead()
		.entermailid()
		.clickDuplicateLead()
		.enterDuplicateleadDetails(cn, fn, ln);
	}

}

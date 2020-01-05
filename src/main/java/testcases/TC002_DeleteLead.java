package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_DeleteLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC002";
	}

	@Test(dataProvider = "getData")
	public void tc002_deleteLead(String fn) throws InterruptedException {
		new LoginPage()
		.enterusername()
		.enterpassword()
		.clicklogin()
		.clickcfmsfa()
		.clickleads()
		.clickFindLead()
		.enterLeadID(fn)
		.clickfindleads()
		.clickondelete();

	}

}

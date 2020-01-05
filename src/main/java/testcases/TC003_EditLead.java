package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC003_EditLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC003";
	}

	@Test(dataProvider = "getData")
	public void tc002_editLead(String fn) throws InterruptedException {
		new LoginPage()
		.enterusername()
		.enterpassword()
		.clicklogin()
		.clickcfmsfa()
		.clickleads()
		.clickFindLead()
		.enterLeadID(fn)
		.clickfindleads()
		.clickonedit()
		.updatecname()
		.clickonupdate();	
	}

}

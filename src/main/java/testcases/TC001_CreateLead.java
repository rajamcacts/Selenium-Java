package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
	}

	@Test(dataProvider = "getData")
	public void tc001_createLead(String cn,String fn,String ln, String mailid) {
		new LoginPage()
		.enterusername()
		.enterpassword()
		.clicklogin()
		.clickcfmsfa()
		.clickleads()
		.clickcreatelead()
		.entercname(cn)
		.enterfname(fn)
		.enterlname(ln)
		.entermailid(mailid)
		.clickcreatelead()
		.verifynewlead();
	}

}

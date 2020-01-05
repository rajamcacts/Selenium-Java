package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC004_MergeLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC004";
	}

	@Test(dataProvider = "getData")
	public void tc002_mergeLead(String fn, String tn) throws InterruptedException {
		new LoginPage()
		.enterusername()
		.enterpassword()
		.clicklogin()
		.clickcfmsfa()
		.clickleads()
		.clickMergeLead()
		.enterfromleadid(fn)
		.entertoleadid(tn)
		.clickonmerge();

	}

}

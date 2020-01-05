package pages;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage entercname(String cn) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cn);
		return this;
	}
	public CreateLeadPage enterfname(String fn) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fn);
		return this;
	}
	public CreateLeadPage enterlname(String ln) {
		driver.findElementById("createLeadForm_lastName").sendKeys(ln);
		return this;	
	}
	public CreateLeadPage entermailid(String mailid) {
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(mailid);
		return this;	
	}
	public ViewLeadPage clickcreatelead() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
}

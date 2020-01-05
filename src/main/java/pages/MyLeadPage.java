package pages;

import base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage clickcreatelead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	public FindLeadPage clickFindLead() {
//		driver.findElementByClassName("selected").click();
	driver.findElementByXPath("//a[text()='Find Leads']").click();
		return new FindLeadPage();
	}
	public MergeLeadPage clickMergeLead() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadPage();
	}
}

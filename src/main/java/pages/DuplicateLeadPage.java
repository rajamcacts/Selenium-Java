package pages;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods
{
	public ViewLeadPage enterDuplicateleadDetails(String cn, String fn, String ln) {
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys(cn);
		driver.findElementById("createLeadForm_firstName").clear();
		driver.findElementById("createLeadForm_firstName").sendKeys(fn);
		driver.findElementById("createLeadForm_lastName").clear();
		driver.findElementById("createLeadForm_lastName").sendKeys(ln);
		driver.findElementByName("submitButton").click();
		String dupid = driver.findElementById("viewLead_companyName_sp").getText().replaceAll("[^0-9]", "");
		System.out.println("Duplicate id "+dupid+" has been created");
		return new ViewLeadPage();
	}
}

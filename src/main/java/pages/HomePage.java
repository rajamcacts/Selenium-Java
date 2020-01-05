package pages;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods
{
	public MyLeadPage clickleads() {
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new MyLeadPage();
	}
}

package pages;

import base.ProjectSpecificMethods;

public class Opentaps extends ProjectSpecificMethods{
	public Opentaps updatecname() {
		String text = driver.findElementById("updateLeadForm_companyName").getAttribute("value");
		System.out.println("text "+text+" text");
		if(text.equals("Infi"))
		{
			driver.findElementById("updateLeadForm_companyName").clear();
			driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");	
		}
		else {
			driver.findElementById("updateLeadForm_companyName").clear();
			driver.findElementById("updateLeadForm_companyName").sendKeys("Infi");	
		}
		return this;
	}
	public ViewLeadPage clickonupdate() {
		driver.findElementByXPath("//input[@name='submitButton']").click();
		return new ViewLeadPage();
	}

}

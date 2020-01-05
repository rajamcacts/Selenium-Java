package pages;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public static String text2;
	public ViewLeadPage verifynewlead() {
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		text2 = driver.findElementById("viewLead_companyName_sp").getText().replaceAll("[^0-9]", "");
		if(text.equals("RAJA"))
		{
			System.out.println("Lead "+text2+" Created Successfully");
		}
		return this;
	}
	public MyLeadPage clickondelete() {
		String deletedid = driver.findElementById("viewLead_companyName_sp").getText().replaceAll("[^0-9]", "");
		System.out.println("ID "+deletedid+" has been deleted");
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		return new MyLeadPage();
	}	
	public Opentaps clickonedit() {
		driver.findElementByXPath("//a[text()='Edit']").click();
		return new Opentaps();
	}
	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElementByXPath("(//a[@class='subMenuButton'])[1]").click();
		return new DuplicateLeadPage();
	}
}

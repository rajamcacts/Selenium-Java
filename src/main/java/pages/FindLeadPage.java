package pages;

import base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
	public FindLeadPage enterLeadID(String fn) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fn);
		return this;
	}
	public ViewLeadPage clickfindleads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new ViewLeadPage();
	}
	public ViewLeadPage entermailid() throws InterruptedException {
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("k");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]").click();
		return new ViewLeadPage();
	}
}

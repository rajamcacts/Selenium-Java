package pages;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	public HomePage clickcfmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new HomePage();
	}
}

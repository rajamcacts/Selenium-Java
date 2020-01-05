package pages;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterusername() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}
	public LoginPage enterpassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	public MyHomePage clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new MyHomePage();
	}
}

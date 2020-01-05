package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;

import base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods{
public String id1, id2;
	public MergeLeadPage enterfromleadid(String fn) throws InterruptedException {
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(windowHandles);
		driver.switchTo().window(lst.get(1));
		//System.out.println(driver.getTitle());
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(fn);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(2000);
		id1 = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
		Thread.sleep(1000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		Thread.sleep(1000);
		driver.switchTo().window(lst.get(0));
		Thread.sleep(1000);
		return this;
	}
	public MergeLeadPage entertoleadid(String tn) throws InterruptedException {
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Thread.sleep(1000);
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> lst1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(lst1.get(1));
		//System.out.println(driver.getTitle());
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(tn);
		Thread.sleep(1000);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(2000);
		id2 = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		Thread.sleep(1000);
		driver.switchTo().window(lst1.get(0));
		Thread.sleep(1000);
		return this;
	}
	public ViewLeadPage clickonmerge() {
		driver.findElementByClassName("buttonDangerous").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(id1+" is merged with "+id2);
		return new ViewLeadPage();
	}
}

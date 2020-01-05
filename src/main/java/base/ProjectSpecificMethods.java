package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	public static String excelFileName;
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Selenium\\drivers\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	@DataProvider
	public String[][] getData() throws IOException {
		ReadExcel data = new ReadExcel();
		/*String[][] data = new String[2][3];
		data[0][0]= "CTS";
		data[0][1] = "Veera";
		data[0][2] = "M";
		data[1][0]= "TCS";
		data[1][1] = "Balaji";
		data[1][2] = "S";*/
		return data.readExcel(excelFileName);
	}
}

package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.Constants;
import page.FaceBookLogin;

public class CrossBrowserTest {

	BaseClass baseClass = new BaseClass();

	WebDriver page;

	@Parameters("browsername")
	@Test()
	public void crossBrowserTestExecution(String browsername) throws InterruptedException {

		if (browsername.equals("chrome")) {

			baseClass.launchChromeBrowser();

			page = baseClass.getPage(Constants.fbPage);

			FaceBookLogin fbPage = new FaceBookLogin(page);

			fbPage.getUsername().sendKeys("test123@gmail.com");

			fbPage.getPassword().sendKeys("test@123A");

			fbPage.getLoginButton().click();

			Thread.sleep(10000);

			baseClass.closeBrowser(page);

			
		}

		else if(browsername.equals("firefox"))
		{
			baseClass.launchFirefoxBrowser();

			page = baseClass.getPage(Constants.fbPage);

			FaceBookLogin fbPage = new FaceBookLogin(page);

			fbPage.getUsername().sendKeys("test123@gmail.com");

			fbPage.getPassword().sendKeys("test@123A");

			fbPage.getLoginButton().click();

			Thread.sleep(10000);

			baseClass.closeBrowser(page);
		}
	}

}

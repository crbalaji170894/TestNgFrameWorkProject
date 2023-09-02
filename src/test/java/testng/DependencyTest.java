package testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.Constants;

import page.FaceBookLogin;

public class DependencyTest {

	BaseClass baseClass = new BaseClass();
	WebDriver page;

	@Test
	public void lauchChromeBrowser() {

		WebDriver launchChromeBrowser = baseClass.launchChromeBrowser();
		baseClass.closeBrowser(launchChromeBrowser);

	}

	@Test(dependsOnMethods = { "lauchChromeBrowser"})
	public void loginWithInValidValues() throws InterruptedException {

		baseClass.launchChromeBrowser();

		page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getUsername().sendKeys("test123@gmail.com");

		fbPage.getPassword().sendKeys("test@123A");

		fbPage.getLoginButton().click();

		Thread.sleep(10000);

	}

	
}

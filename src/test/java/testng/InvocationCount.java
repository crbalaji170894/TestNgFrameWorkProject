package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.Constants;

import page.FaceBookLogin;

public class InvocationCount {

	BaseClass baseClass = new BaseClass();

	WebDriver page;

	@BeforeMethod
	public void lauchChromeBrowser() {

		baseClass.launchChromeBrowser();

	}

	@Test(invocationCount = 5)
	public void clickForgotPassword() throws InterruptedException {

		page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getForgotpwd().click();

		Thread.sleep(10000);

	}

	@AfterMethod
	public void closeBrowser() {

		baseClass.closeBrowser(page);

	}

}

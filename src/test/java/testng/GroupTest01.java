package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.Constants;
import page.AlertSamplepage;
import page.FaceBookLogin;

public class GroupTest01 {

	BaseClass baseClass = new BaseClass();

	WebDriver page;

//	@BeforeMethod
//	public void lauchChromeBrowser() {
//
//		baseClass.launchChromeBrowser();
//
//	}

	@Test(groups = { "reg", "func", "smoke" })
	public void loginWithInValidValues() throws InterruptedException {
		baseClass.launchChromeBrowser();
		
		page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getUsername().sendKeys("test123@gmail.com");

		fbPage.getPassword().sendKeys("test@123A");

		fbPage.getLoginButton().click();

		Thread.sleep(10000);

		baseClass.closeBrowser(page);

	}

	@Test(groups = { "smoke" })
	public void clickForgotPassword() throws InterruptedException {

		baseClass.launchChromeBrowser();
		
		page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getForgotpwd().click();

		Thread.sleep(10000);

		baseClass.closeBrowser(page);

	}

	@Test(groups = { "reg", "sanity" })
	public void sampleAlert() throws InterruptedException {
		baseClass.launchChromeBrowser();
		
		page = baseClass.getPage(Constants.alertSite);

		AlertSamplepage alertPage = new AlertSamplepage(page);

		alertPage.getAlertOK().click();

		alertPage.getClickSimpleAlert().click();

		Thread.sleep(10000);

		baseClass.alertOK(page);

		baseClass.closeBrowser(page);
	}

}

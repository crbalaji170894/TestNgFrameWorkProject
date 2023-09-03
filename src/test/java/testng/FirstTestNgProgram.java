package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.Constants;
import page.AlertSamplepage;
import page.FaceBookLogin;

public class FirstTestNgProgram {
	BaseClass baseClass = new BaseClass();
	WebDriver page=null;

	@BeforeMethod
	public void lauchChromeBrowser() {

		page = baseClass.launchChromeBrowser();

	}

	@Test()
	public void loginWithInValidValues() throws InterruptedException {
		page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getUsername().sendKeys("test123@gmail.com");

		fbPage.getPassword().sendKeys("test@123A");

		fbPage.getLoginButton().click();

		Thread.sleep(10000);

	}

	@Test()
	public void clickForgotPassword() throws InterruptedException {

		page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getForgotpwd().click();

		Thread.sleep(10000);

	}

	@Test()
	public void sampleAlert() throws InterruptedException {
		page = baseClass.getPage(Constants.alertSite);

		AlertSamplepage alertPage = new AlertSamplepage(page);

		alertPage.getAlertOK().click();

		alertPage.getClickSimpleAlert().click();

		Thread.sleep(10000);
		
		baseClass.alertOK(page);

	}

	@AfterMethod
	public void closeBrowser() {
		
		baseClass.closeBrowser(page);

	}

}

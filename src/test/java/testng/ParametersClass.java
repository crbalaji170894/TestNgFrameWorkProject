package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;

import page.FaceBookLogin;

public class ParametersClass {

	BaseClass baseClass = new BaseClass();
	WebDriver page;

	@Test
	public void lauchChromeBrowser() {

		baseClass.launchChromeBrowser();

	}

	@Parameters({"url","username","password"})
	@Test()
	public void loginWithInValidValues(String url, String username, String password) throws InterruptedException {

		
		page = baseClass.getPage(url);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getUsername().sendKeys(username);

		fbPage.getPassword().sendKeys(password);

		fbPage.getLoginButton().click();

		Thread.sleep(10000);

	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		baseClass.closeBrowser(page);
//
//	}

}

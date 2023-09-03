package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.Constants;
import page.FaceBookLogin;

public class DataProviderOne {

	WebDriver page;

	@Test(dataProvider="data1")
	public void loginWithValues(String username, String password) throws InterruptedException {
		BaseClass baseClass = new BaseClass();

		baseClass.launchChromeBrowser();

		page = baseClass.getPage(Constants.fbPage);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getUsername().sendKeys(username);

		fbPage.getPassword().sendKeys(password);

		fbPage.getLoginButton().click();

		Thread.sleep(10000);

		baseClass.closeBrowser(page);

	}

	@DataProvider(name = "data")
	public Object[][] dataToSend() {

		return new Object[][] { { "test@gamil.com", "test@123A" }, { "test123@gamil.com", "pass123@A" } };

	}



	@DataProvider(name = "data1")
	public Object[][] dataToSendOne() {

		return new Object[][] { { "jana@gamil.com", "test@123A" }, { "test123@gamil.com", "pass123@A" } };

	}
}

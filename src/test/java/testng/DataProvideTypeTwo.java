package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;

import page.FaceBookLogin;

public class DataProvideTypeTwo {

	WebDriver page;

	@Test(dataProvider = "getData", dataProviderClass = ExcelUtils.class)
	public void loginWithValues(String url, String username, String password) throws InterruptedException {
		BaseClass baseClass = new BaseClass();

		baseClass.launchChromeBrowser();

		page = baseClass.getPage(url);

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getUsername().sendKeys(username);

		fbPage.getPassword().sendKeys(password);

		fbPage.getLoginButton().click();

		Thread.sleep(10000);

		baseClass.closeBrowser(page);

	}

}

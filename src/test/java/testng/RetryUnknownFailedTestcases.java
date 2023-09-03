package testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.Constants;
import page.FaceBookLogin;

public class RetryUnknownFailedTestcases {
	
	WebDriver page;
	@Test()
	public void testName() throws InterruptedException {
		BaseClass baseClass =new BaseClass();
		
		baseClass.launchChromeBrowser();

		page = baseClass.getPage("https//:testurl");

		FaceBookLogin fbPage = new FaceBookLogin(page);

		fbPage.getForgotpwd().click();

		Thread.sleep(10000);

	}

	@Test
	private void testName2() {
		Assert.assertEquals(false, false);

	}
}

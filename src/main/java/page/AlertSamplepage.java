package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertSamplepage {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Alert with OK ']")
	private WebElement alertOK;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement clickSimpleAlert;

	@FindBy(xpath = "//a[text()='Alert with OK & Cancel ']")
	private WebElement alertOKAndCancel;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement clickConfirmAlert;

	@FindBy(xpath = "//a[text()='Alert with Textbox ']")
	private WebElement alertOKAndCancelWithText;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	private WebElement clickPromptAlert;

	public WebElement getMessageConfirmAlert() {
		return messageConfirmAlert;
	}

	public void setMessageConfirmAlert(WebElement messageConfirmAlert) {
		this.messageConfirmAlert = messageConfirmAlert;
	}

	public WebElement getMessagePromptalert() {
		return messagePromptalert;
	}

	public void setMessagePromptalert(WebElement messagePromptalert) {
		this.messagePromptalert = messagePromptalert;
	}

	@FindBy(xpath = "//p[@id='demo']")
	private WebElement messageConfirmAlert;

	@FindBy(xpath = "//p[@id='demo1']")
	private WebElement messagePromptalert;

	public AlertSamplepage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getAlertOK() {
		return alertOK;
	}

	public void setAlertOK(WebElement alertOK) {
		this.alertOK = alertOK;
	}

	public WebElement getClickSimpleAlert() {
		return clickSimpleAlert;
	}

	public void setClickSimpleAlert(WebElement clickSimpleAlert) {
		this.clickSimpleAlert = clickSimpleAlert;
	}

	public WebElement getAlertOKAndCancel() {
		return alertOKAndCancel;
	}

	public void setAlertOKAndCancel(WebElement alertOKAndCancel) {
		this.alertOKAndCancel = alertOKAndCancel;
	}

	public WebElement getClickConfirmAlert() {
		return clickConfirmAlert;
	}

	public void setClickConfirmAlert(WebElement clickConfirmAlert) {
		this.clickConfirmAlert = clickConfirmAlert;
	}

	public WebElement getAlertOKAndCancelWithText() {
		return alertOKAndCancelWithText;
	}

	public void setAlertOKAndCancelWithText(WebElement alertOKAndCancelWithText) {
		this.alertOKAndCancelWithText = alertOKAndCancelWithText;
	}

	public WebElement getClickPromptAlert() {
		return clickPromptAlert;
	}

	public void setClickPromptAlert(WebElement clickPromptAlert) {
		this.clickPromptAlert = clickPromptAlert;
	}

}

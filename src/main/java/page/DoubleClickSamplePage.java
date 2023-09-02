package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickSamplePage {

	WebDriver driver;

	@FindBy(id = "//button[text()='Double Click Me']")
	private WebElement doubleClickButton;

//	@FindBy(name = "//p[text()='You have done a double click']")
//	private WebElement message;

	public DoubleClickSamplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDoubleClickButton() {
		return doubleClickButton;
	}

	public void setDoubleClickButton(WebElement doubleClickButton) {
		this.doubleClickButton = doubleClickButton;
	}

//	public WebElement getMessage() {
//		return message;
//	}
//
//	public void setMessage(WebElement message) {
//		this.message = message;
//	}

}

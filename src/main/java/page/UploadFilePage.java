package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {

	WebDriver driver;

	@FindBy(xpath = "//button[@class='dz-button']")
	private WebElement ClickToSelectFile;

	@FindBy(xpath = "//button[@id='upload']")
	private WebElement uploadButton;

	public UploadFilePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getClickToSelectFile() {
		return ClickToSelectFile;
	}

	public void setClickToSelectFile(WebElement clickToSelectFile) {
		ClickToSelectFile = clickToSelectFile;
	}

	public WebElement getUploadButton() {
		return uploadButton;
	}

	public void setUploadButton(WebElement uploadButton) {
		this.uploadButton = uploadButton;
	}

}

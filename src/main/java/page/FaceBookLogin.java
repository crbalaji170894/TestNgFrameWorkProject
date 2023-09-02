package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLogin {

	WebDriver driver;

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginButton;

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotpwd;

	@FindBy(id = "u_0_0_dP")
	private WebElement createAnAccout;

	@FindBy(xpath = "//a[text()='Messenger']")
	private WebElement messenger;

	public FaceBookLogin(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getForgotpwd() {
		return forgotpwd;
	}

	public void setForgotpwd(WebElement forgotpwd) {
		this.forgotpwd = forgotpwd;
	}

	public WebElement getCreateAnAccout() {
		return createAnAccout;
	}

	public void setCreateAnAccout(WebElement createAnAccout) {
		this.createAnAccout = createAnAccout;
	}

	public WebElement getMessenger() {
		return messenger;
	}

	public void setMessenger(WebElement messenger) {
		this.messenger = messenger;
	}

}

package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import constants.Constants;

public class BaseClass {

	WebDriver driver;

	public WebDriver launchChromeBrowser() {

		System.setProperty(Constants.chromeKey, Constants.projectPath + "//drivers//chromedriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public WebDriver launchFirefoxBrowser() {

		System.setProperty(Constants.firefoxKey, Constants.projectPath + "//drivers//geckodriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public WebDriver launchieBrowser() {

		System.setProperty(Constants.ieKey, Constants.projectPath + "//drivers//IEDriverServer.exe");

		driver = new InternetExplorerDriver();

		return driver;

	}

	public WebDriver getPage(String url) {

		driver.get(url);

		return driver;

	}

	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

	public WebDriver navigateToBack() {
		driver.navigate().back();
		return driver;

	}

	public WebDriver navigateToForwad() {
		driver.navigate().forward();
		return driver;

	}

	public String getCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	private void quitBrowser() {
		driver.quit();

	}

	public WebDriver windowMinimize() {
		driver.manage().window().minimize();
		return driver;

	}

	public WebDriver windowMaximize() {
		driver.manage().window().maximize();
		return driver;

	}

	private WebDriver windowFullScreen() {
		driver.manage().window().fullscreen();
		return driver;

	}

	public WebDriver moveToElement(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.moveToElement(element).click().perform();

		return driver;

	}

	public WebDriver rightClick(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.contextClick(element).perform();

		return driver;

	}

	public WebDriver doubleClick(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.doubleClick(element).perform();

		return driver;

	}

	public Robot robotObject() throws AWTException {
		Robot robot = new Robot();
		return robot;

	}

	public void alertOK(WebDriver driver) {

		Alert al = driver.switchTo().alert();
		al.accept();

	}

	public void alertCanel(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.dismiss();

	}

	public void alertSendKeys(WebDriver driver, String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);

	}

	public void brokenLink(WebDriver driver) {

		List<WebElement> allURL = driver.findElements(By.tagName("a"));

		for (WebElement eachURL : allURL) {

			String hrefurl = eachURL.getAttribute("href");

			try {
				URL url = new URL(hrefurl);

				HttpURLConnection connection = (HttpURLConnection) url.openConnection();

				connection.setConnectTimeout(5000);

				connection.connect();

				if (connection.getResponseCode() >= 400) {
					System.out.println(connection.getResponseMessage());
					System.out.println(hrefurl + " is  broken Link");
				} else {
					System.out.println(connection.getResponseMessage());
					System.out.println(hrefurl + " is not broken Link");
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

	public void screenShot(WebDriver driver) throws IOException {
		Date date = new Date();

		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);

		File destinationLocation = new File(Constants.projectPath + "//screenshots//" + date.getTime() + ".png");

		FileUtils.copyFile(sourceFile, destinationLocation);

	}

	public void uploadFileUsingRobotClass(String path) throws InterruptedException, AWTException {
		StringSelection filePath = new StringSelection(path);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		Thread.sleep(10000);

		Robot robot = new Robot();

		robot.delay(250);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}

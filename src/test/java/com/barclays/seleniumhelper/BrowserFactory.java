package com.barclays.seleniumhelper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactory {

	protected static WebDriver driver;

	public static WebDriver StartLocalDriver() {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Sanjeev\\Desktop\\Open Cart Automation\\ BarclaysAssignment\\src/test/resources/IEDriverServer.exe");
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.ignoreZoomSettings();
		options.introduceFlakinessByIgnoringSecurityDomains();
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void QuitApp() {
		driver.quit();
	}
	
	public static void waitForPageLoad() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		new WebDriverWait(driver, 30)
				.until(driver -> js.executeScript("return document.readyState").equals("complete"));
	}

}

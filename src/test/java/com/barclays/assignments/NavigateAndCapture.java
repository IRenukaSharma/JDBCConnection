package com.barclays.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigateAndCapture {
	protected WebDriver driver;

	public NavigateAndCapture(WebDriver driver) {
		this.driver = driver;

	}

	protected WebElement Username() {
		return driver.findElement(By.id(""));

	}

	protected WebElement Password() {
		return driver.findElement(By.id(""));
	}

	protected WebElement Submit() {
		return driver.findElement(By.id(""));
	}

	// navigate to application
	public void Navigate() {
		driver.get("https://facebook.com");

	}

	// login into the application
	public void Login(String Username, String Password) {
		// Enter Username
		Username().sendKeys(Username);
		// Enter password
		Password().sendKeys(Password);
		// click on submit
		Submit().click();
	}

	public void SearchForItem(String itemName) {
		// Enter itemName in Search Box

		// Click search Button

		// Caputre screenshots
	}

}
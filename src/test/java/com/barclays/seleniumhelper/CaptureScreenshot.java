package com.barclays.seleniumhelper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot extends BrowserFactory {

	public static void captureScreenShot(String imagename) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File destinfile = new File(
				"C:\\Users\\Sanjeev\\Desktop\\Open Cart Automation\\ BarclaysAssignment\\Screenshots\\" + imagename
						+ ".png");
		FileUtils.copyFile(src, destinfile);
	}
}

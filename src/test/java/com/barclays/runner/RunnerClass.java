package com.barclays.runner;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import com.barclays.assignments.ConnectToDatabase;
import com.barclays.assignments.NavigateAndCapture;
import com.barclays.seleniumhelper.BrowserFactory;
import com.barclays.seleniumhelper.CaptureScreenshot;

public class RunnerClass {

	public static void main(String[] args) throws IOException, InterruptedException, SQLException {
		// Capture screenshots using selenium webdriver
		// Opening browser
		WebDriver dri = BrowserFactory.StartLocalDriver();
		// navigate to url
		NavigateAndCapture nav = new NavigateAndCapture(dri);
		nav.Navigate();
		CaptureScreenshot.captureScreenShot("imgage1");

		ConnectToDatabase conn = new ConnectToDatabase("root", "");
		conn.CreateConnection();
		System.out.println(conn.GetSQLResult("select firstname from oc_address"));
		CaptureScreenshot.captureScreenShot("imgage12");
		ConnectToDatabase.closeConnection();
	}

}

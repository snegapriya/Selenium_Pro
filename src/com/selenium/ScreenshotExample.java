package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_8AM_BATCH\\Selenium_Concepts\\Driver\\chromedriver.exe");

		// large interface
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		// TakesScreenshot - small interface
		TakesScreenshot ts = (TakesScreenshot) driver; // narrowing type casting

		// getScreenshotAs
		File src = ts.getScreenshotAs(OutputType.FILE);

		// location to store the screenshot
		File dest = new File("C:\\Users\\asus\\eclipse-workspace_8AM_BATCH\\Selenium_Concepts\\Screenshot\\amazon.png");

		// copy the screenshot to the required location
		FileUtils.copyFile(src, dest);

	}
}

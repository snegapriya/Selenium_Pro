package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// get
		driver.get("https://en-gb.facebook.com/");

		// maximize
		driver.manage().window().maximize();

		// Navigation Methods - to
		driver.navigate().to("https://www.amazon.in/");

		// back
		driver.navigate().back();// facebook

		// getTitle
		String title = driver.getTitle();
		System.out.println("Title is :" + title);

		// forward
		driver.navigate().forward();// amazon

		// getCurrentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is :" + currentUrl);

		Thread.sleep(2000);

		// refresh
		driver.navigate().refresh();

		// close
		driver.close();

	}
}

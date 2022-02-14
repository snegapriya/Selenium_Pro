package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {

		// property setting - key(driver name),value(driver location)

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_8AM_BATCH\\Selenium_Concepts\\Driver\\chromedriver.exe");

		//interface             class
		WebDriver driver = new ChromeDriver(); //upcasting
		//parent                child
		
	//	WebDriver driver1 = new WebDriver;
		
	//	ChromeDriver driver2 = new ChromeDriver();
		
		
		
		
		
		
		
		
	}
}

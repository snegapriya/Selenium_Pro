package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunctions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_8AM_BATCH\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement france = driver.findElement(By.xpath("//a[text()='France']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;//narrowing type casting
		
		js.executeScript("arguments[0].scrollIntoView();", france);
		
		Thread.sleep(2000);
		
		//scroll up
		js.executeScript("window.scrollBy(0,-4000);");
		
		Thread.sleep(2000);
		
		//scroll down
		js.executeScript("window.scrollBy(0,2000);");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

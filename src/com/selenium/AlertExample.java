package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_8AM_BATCH\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		//simple alert
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		button1.click();
		
		Thread.sleep(2000);
		
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		//confirm alert
		WebElement button2 = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		button2.click();
		
		Thread.sleep(2000);
		
		Alert confirmAlert = driver.switchTo().alert();
	//	confirmAlert.accept();
		confirmAlert.dismiss();
		
		//prompt alert
		WebElement button3 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		button3.click();
		
		Thread.sleep(2000);
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Selenium");
		String text = promptAlert.getText();
		System.out.println(text);
	//	promptAlert.accept();
		promptAlert.dismiss();
		
		
		
		
		
		
		
		
		
		
	}
}

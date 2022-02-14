package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_8AM_BATCH\\Selenium_Concepts\\Driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		Actions ac = new Actions(driver);
		
		WebElement cloth = driver.findElement(By.xpath("(//img[contains(@alt,'Clothing')])[4]"));
		ac.moveToElement(cloth).build().perform();
		
		ac.click(cloth).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

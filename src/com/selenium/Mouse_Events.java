package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_8AM_BATCH\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		//click
		WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions ac = new Actions(driver);
		ac.click(clickButton).build().perform();
		
		//right click - contextClick
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(rightClickButton).build().perform();
		
		//double click
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(doubleClickButton).build().perform();
		
		//drag and drop
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(drag, drop).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}

package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_8AM_BATCH\\Selenium_Concepts\\Driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		
		//isMultiple
		Select s = new Select(multiple);
		
		boolean mul = s.isMultiple();
		System.out.println("Is multiple or not :"+mul);
		
		s.selectByValue("1");
		
		s.selectByIndex(2);
		
		s.selectByVisibleText("Loadrunner");
		
		s.deselectByVisibleText("Loadrunner");
		
		//deselectAll
	//	s.deselectAll();
		
		System.out.println();
		
		//getoptions
		System.out.println("** All OptionS **");
		
		List<WebElement> allOptions = s.getOptions();
		
        for (WebElement opt : allOptions) {
			
        	String text = opt.getText();
        	System.out.println(text);
		}		
		
		System.out.println();
		
		//getAllSelectedOptions
		System.out.println("** All Selected Options **");
		
		List<WebElement> allSelected = s.getAllSelectedOptions();
		
		for (WebElement all : allSelected) {
			
			String text = all.getText();
			System.out.println(text);
			
		}
		
		System.out.println();
		
		//getFirstSelectedOption
		System.out.println("** First Selected Option **");
		
		WebElement firstSelected = s.getFirstSelectedOption();
		
		String text = firstSelected.getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
	}
}

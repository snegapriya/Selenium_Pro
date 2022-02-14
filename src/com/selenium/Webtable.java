package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		//All data
		System.out.println("** All Data **");
		
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement all : allData) {
			
			String text = all.getText();
			System.out.println(text);
		}
		
		System.out.println();
		
		//Row data
		System.out.println("** Row Data **");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		
		for (WebElement row : rowData) {
			
			String text = row.getText();
			System.out.println(text);
		}
		
		System.out.println();
		
		//column data
		System.out.println("** Column Data **");
		
		List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		
		for (WebElement column : columnData) {
			
			String text = column.getText();
			System.out.println(text);
		}
				
		//particular data
		System.out.println("** Particular Data **");
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]"));
		String text = particular.getText();
		System.out.println(text);
		
		System.out.println();
		
		//Headers
		System.out.println("** Headers **");
		
		List<WebElement> allheaders = driver.findElements(By.tagName("th"));
		
		for (WebElement header : allheaders) {
			
			String text2 = header.getText();
			System.out.println(text2);
		}
		
		
		
		
		
		
		
		
		
	}
}

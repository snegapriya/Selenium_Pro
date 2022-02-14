package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
	
	static int indexOfTotal , indexOfRecovered , indexOfActive;
    static String country = "china";
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				            System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		
		driver.manage().window().maximize();
		
		//All headers
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		
		for (int i = 0; i < allHeaders.size(); i++) {
			
			String text = allHeaders.get(i).getText();
		//	System.out.println(text);
			
			String headers = text.replaceAll("\n", " ");
		//	System.out.println(headers);
			if (headers.equalsIgnoreCase("Total Cases")) {
				
				 indexOfTotal = i;
				 System.out.println("Index Of Total Cases :"+ indexOfTotal);
			}
			else if (headers.equalsIgnoreCase("Total Recovered")) {
				
				 indexOfRecovered = i;
				 System.out.println("Index Of Recovered cases :"+indexOfRecovered);
			}
			else if (headers.equalsIgnoreCase("Active Cases")) {
				
				 indexOfActive = i;
				 System.out.println("Index Of Active Cases :"+indexOfActive);
			}
		}
		
		//traverse into body
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		
		//Iterate row
		for (int i = 0; i < allRows.size(); i++) {
			
			List<WebElement> allData = allRows.get(i).findElements(By.tagName("td"));
			
			//Iterate column
			for (int j = 0; j < allData.size(); j++) {
				
				if (allData.get(j).getText().equalsIgnoreCase(country)) {
					
					System.out.println("Total Cases :"+allData.get(indexOfTotal).getText());
					System.out.println("Recovered cases :"+allData.get(indexOfRecovered).getText());
					System.out.println("Active Cases :"+allData.get(indexOfActive).getText());
					
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

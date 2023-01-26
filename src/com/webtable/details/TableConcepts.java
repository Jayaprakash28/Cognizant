package com.webtable.details;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableConcepts {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAYAPRAKASH\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		 
		System.out.println("===========All Datas============");
		List<WebElement> allDatas = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement data : allDatas) {
			System.out.println(data.getText());
		}
			
		System.out.println("==============particular Row=============");
		List<WebElement> parRow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
		for (WebElement web : parRow) {
		System.out.println(web.getText());
				
			}
			
			
		System.out.println("===========particular Column===========");	
	    List<WebElement> parCol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		for (WebElement col : parCol) {
	    System.out.println(col.getText());
	    
		}
		
		
		
	}
  
}

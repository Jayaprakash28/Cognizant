package com.webtable.details;

import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScorllUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\JAYAPRAKASH\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement downLogo = driver.findElement(By.xpath("//div[contains(@class,'nav-logo-base')]"));
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("arguments[0].scrollIntoView();", downLogo);
	
	
	Thread.sleep(2000);
	WebElement upLogo = driver.findElement(By.xpath("//div[contains(@id,'nav-xshop-container')]"));
	js.executeScript("arguments[0].scrollIntoView();", upLogo);
	
	
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,5000)");
	
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-5000)");
	
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(2000,0)");
	
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(-2000,0)");
}
}

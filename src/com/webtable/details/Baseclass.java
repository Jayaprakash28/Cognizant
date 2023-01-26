package com.webtable.details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass {
	public static	WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYAPRAKASH\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
				driver = new ChromeDriver(); 
			}else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\JAYAPRAKASH\\eclipse-workspace\\Employee\\Dirvers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}else {
				System.out.println("invalid browser name");
			}
			driver.manage().window().maximize();
		} catch (Exception	 e) {
			e.printStackTrace();
		} 
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void InputValuetoElement(WebElement element, String value) {
		       
		    try {
						
				element.sendKeys(value);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		    
			
	
		}
		public static void clickOnElement(WebElement element) throws InterruptedException {
			Thread.sleep(2000);
		
			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	
	

	public static void moveToElement(WebElement element) throws InterruptedException {
		Thread.sleep(1000);
		
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

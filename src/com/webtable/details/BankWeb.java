package com.webtable.details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BankWeb {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYAPRAKASH\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://testfire.net/login.jsp");
	
	driver.manage().window().maximize();
	
	WebElement id = driver.findElement(By.xpath("//input[@id='uid']"));
	id.sendKeys("admin");

	WebElement pass = driver.findElement(By.xpath("//input[@id='passw']"));
	pass.sendKeys("admin");
	
	WebElement log = driver.findElement(By.xpath("//input[@name='btnSubmit']"));
	log.click();
	
	WebElement drop = driver.findElement(By.id("listAccounts"));
    Select s = new Select(drop);
    s.selectByIndex(1);
    
	WebElement go = driver.findElement(By.xpath("//input[@id='btnGetAccount']"));
	go.click();
	
	WebElement acc = driver.findElement(By.name("listAccounts"));
	Select b = new Select(acc);
    b.selectByIndex(1);
    
	WebElement check = driver.findElement(By.xpath("//input[@value='Select Account']"));
	check.click();
	
	WebElement trans = driver.findElement(By.id("MenuHyperLink3"));
	trans.click();
	
	WebElement to = driver.findElement(By.id("toAccount"));
    Select t = new Select(to);
    t.selectByIndex(1);
    
    WebElement am = driver.findElement(By.id("transferAmount"));
	am.sendKeys("9876");
	
	WebElement trcl = driver.findElement(By.name("transfer"));
    trcl.click();

    WebElement rectrans = driver.findElement(By.id("MenuHyperLink2"));
	rectrans.click();
	
	WebElement con = driver.findElement(By.id("HyperLink3"));
	con.click();
	
	WebElement form = driver.findElement(By.xpath("//a[@href='feedback.jsp']"));
	form.click();
	
	WebElement mail = driver.findElement(By.name("email_addr"));
	mail.sendKeys("jayaprakash6737@gmail.com");
	
	WebElement sub = driver.findElement(By.name("subject"));
	sub.sendKeys("transaction");
	
	WebElement comm = driver.findElement(By.name("comments"));
	comm.sendKeys("Amount 9879 from 800000 to 800001");

	WebElement submit = driver.findElement(By.name("submit"));
	submit.click();
	
	WebElement sigoff = driver.findElement(By.id("LoginLink"));
	sigoff.click();
	
	WebElement sigin = driver.findElement(By.id("LoginLink"));
	sigin.click();
	
	WebElement idincorr = driver.findElement(By.xpath("//input[@name='uid']"));
	idincorr.sendKeys("admi");

	WebElement passincorr = driver.findElement(By.xpath("//input[@name='passw']"));
	passincorr.sendKeys("admi");
	
	WebElement lo = driver.findElement(By.xpath("//input[@name='btnSubmit']"));
	lo.click();
	

	
	
	/*WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("jp@gmail.com");
	
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
	password.sendKeys("1234");*/
	
	
	
}

}

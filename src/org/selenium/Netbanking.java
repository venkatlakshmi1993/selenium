package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netbanking {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get(" https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);
		WebElement login = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
     login.sendKeys("suji@123");
	WebElement con= driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
	con.click();
	Thread.sleep(2000);
	WebElement pass = driver.findElement(By.id("password"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].setAttribute('value,'venkat')",pass);
		
	
		
	
		
		 
	
		
	//Thread.sleep(4000);
		//System.out.println(a.getText());
	//	a.accept();
	//	driver.switchTo().defaultContent();
	//	driver.findElement(By.id("login1")).sendKeys("venkat123");
	//	driver.quit();
		
		
	}

}

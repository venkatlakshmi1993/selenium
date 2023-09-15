package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement sign = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	
	Actions ac= new Actions(driver);
	 ac.moveToElement(sign).perform();sign.click();
	 
	 WebElement login = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
	 login.sendKeys("venkatlakshmi@gmail.com");
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_A);
	 r.keyRelease(KeyEvent.VK_A);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 Thread.sleep(2000);
	 ac.contextClick(login).perform();
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_X);
	 r.keyRelease(KeyEvent.VK_X);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	

	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);

	
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyPress(KeyEvent.VK_ENTER);
	
	 
	 
	 
	 
	/* WebElement create = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
	 create.click();
	 WebElement username = driver.findElement(By.xpath("//input[@placeholder='First and last name']"));
	 username.sendKeys("venkat");
	/* WebElement moblie = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
	 moblie.sendKeys("9876546786");
	 WebElement pass = driver.findElement(By.xpath("//input[@placeholder='At least 6 characters']"));
	 pass.sendKeys("teget123");
	 WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
	 con.click();*/
	
	
	
	 
	 
	
	

}
}
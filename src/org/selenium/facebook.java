package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	Robot r=new Robot();
	driver.get("https://www.facebook.com/");
	WebElement username= driver.findElement(By.id("email"));
	username.sendKeys("1234@suji");
      r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_A);
	  r.keyRelease(KeyEvent.VK_A);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  Thread.sleep(3000);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_X);
	  r.keyRelease(KeyEvent.VK_X);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	
	 // WebElement pass = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
     //pass.sendKeys(Keys.CONTROL,"v");
     Thread.sleep(2000);
      r.keyPress(KeyEvent.VK_TAB);
      r.keyRelease(KeyEvent.VK_TAB);
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
 
       r.keyRelease(KeyEvent.VK_V);
       r.keyRelease(KeyEvent.VK_CONTROL);
  
	}
}
	  

	  

	  
	 
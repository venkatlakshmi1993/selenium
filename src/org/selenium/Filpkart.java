package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpkart {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
     String  parentwin = driver.getWindowHandle();
     System.out.println(parentwin);
     WebElement login= driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	
    WebElement cancel= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
     cancel.click();

     WebElement search= driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
     search.sendKeys("home furniture");
     Thread.sleep(2000);
     Robot rb1=new Robot();
	 rb1.keyPress(KeyEvent.VK_DOWN);
	 rb1.keyRelease(KeyEvent.VK_DOWN);
	 
	 TakesScreenshot ts = (TakesScreenshot)driver;
     File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
     File f = new File("F:\\screenshots\\flip.jpg");
     FileUtils.copyFile(screenshotAs, f);
   
	  rb1.keyPress(KeyEvent.VK_ENTER);
	  rb1.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  
	  WebElement wood = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	  wood.sendKeys("furniture wooden");
	  Set<String> allwindows = driver.getWindowHandles();
	 
	  Actions ac2= new Actions(driver);
	  ac2.doubleClick().perform();
	  
	  /* Set<String> allwindows = driver.getWindowHandles();
	    System.out.println(allwindows);
	    Thread.sleep(1000);
	    for(String ne:allwindows) {
	  	if(!(parentwin.equals(ne))) {
	    	Thread.sleep(2000);
	    		driver.switchTo().window(ne);
	    	System.out.println("new id" +ne);*/
	    

	}
}
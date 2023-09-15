package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstech {
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement mouseover= driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
    Actions ac= new Actions(driver);
    ac.moveToElement(mouseover).perform();
		
   WebElement mouse = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
   ac.moveToElement(mouse).perform();
	   
   WebElement clickaction = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
   clickaction.click();
		
		
	}

}

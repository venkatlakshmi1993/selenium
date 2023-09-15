package org.selenium;

import java.util.Set;
import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopclubs {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	String parentid = driver.getWindowHandle();
	System.out.println("parent id is" +parentid);
	WebElement mouse= driver.findElement(By.xpath("//a[text()='Mobiles & More']"));

	Actions ac= new Actions(driver);
    ac.moveToElement(mouse).perform();
    
    
    WebElement cli = driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
    cli.click();
   
    WebElement price = driver.findElement(By.xpath("//label[@for='2501 - 5000']")); 
    String text = price.getText();
    System.out.println(text);
    price.click();
  
    Set<String> allid = driver.getWindowHandles();
    System.out.println(allid);
    Thread.sleep(1000);
    for(String ne:allid) {
  	if(!(parentid.equals(ne))) {
    	Thread.sleep(2000);
    		driver.switchTo().window(ne);
    	System.out.println("new id  " +ne);
    	
    	}
   }
    }}
	
 

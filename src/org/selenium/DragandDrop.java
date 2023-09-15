package org.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");	
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.id("credit2"));
		WebElement drop = driver.findElement(By.id("bank"));
		 Actions ac= new  Actions(driver);
	     ac.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
	
		WebElement drag1 = driver.findElement(By.id("credit1"));
		WebElement drop1 = driver.findElement(By.id("loan"));
		Actions ac1= new  Actions(driver);
		ac.dragAndDrop(drag1, drop1).perform();
			
	      WebElement drag2 = driver.findElement(By.id("fourth"));
	       WebElement drop2 = driver.findElement(By.id("amt7"));
	      Actions ac2= new  Actions(driver);
	       ac.dragAndDrop(drag2, drop2).perform();
	
	     WebElement drag3 = driver.findElement(By.id("fourth"));
	   WebElement drop3 = driver.findElement(By.id("amt8"));
	  Actions ac3= new Actions(driver);
	  ac3.dragAndDrop(drag3, drop3).perform();
	
}
	

}

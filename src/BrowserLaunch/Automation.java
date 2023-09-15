package BrowserLaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation {
	public static void main(String[] args) throws InterruptedException, AWTException

	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement fn= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("venkat");
		
		WebElement fn2= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		fn2.sendKeys("lakshmi");
		
		WebElement fn3= driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		fn3.sendKeys("1/2 kovilstreet,coimbutore");
		
		WebElement fn4= driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		fn4.sendKeys("laskhmi123@gmail.com");
		
       WebElement fn5= driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		fn5.sendKeys("9876545678");
		
      WebElement fn6= driver.findElement(By.xpath("//input[@value='FeMale']"));
		fn6.click();
		
      WebElement f7= driver.findElement(By.xpath("//input[@id='checkbox2']"));
		f7.click();
        Thread.sleep(2000);
		WebElement f11= driver.findElement(By.xpath("//select[@id='countries']"));
		f11.click();
		
       WebElement f12= driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		f12.click(); 
		Actions ac= new Actions(driver);
	    ac.moveToElement(f12).perform();
	  
	   WebElement mouse = driver.findElement(By.xpath("//form[@id='basicBootstrapForm']"));
       ac.moveToElement(mouse).perform();
       
       Robot rb1=new Robot();
	  rb1.keyPress(KeyEvent.VK_DOWN);
	  rb1.keyRelease(KeyEvent.VK_DOWN);
	  
	  rb1.keyPress(KeyEvent.VK_ENTER);
	  rb1.keyRelease(KeyEvent.VK_ENTER);
	  
      WebElement f9= driver.findElement(By.xpath("(//input[@id='firstpassword'])[1]"));
	  f9.sendKeys("9876545678");
		
       WebElement f10= driver.findElement(By.xpath("(//input[@id='secondpassword'])[1]"));
       f10.sendKeys("9876545678");
		
	driver.findElement(By.id("msdd")).click();
	driver.findElement(By.xpath("//a[text()=\"Arabic\"]")).click();
	
     WebElement year = driver.findElement(By.xpath("//select[@placeholder=\"Year\"]"));
	 Select s= new Select(year);
	 s.selectByIndex(3);
		
	 WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	 Select s1= new Select(month);
	 s1.selectByVisibleText("February");	
			
	WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
    Select s2= new Select(day);
    s2.selectByValue("11");
				
	WebElement skill= driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
	Select s4=new Select(skill);
	s4.selectByValue("Android");

	WebElement country= driver.findElement(By.xpath("//select[@id=\"countries\"]"));
	Select s5=new Select(country);
	s5.selectByVisibleText("Select Country");
	
//	WebElement refresh= driver.findElement(By.xpath("//button[@id=\"Button1\"]"));
//	refresh.click();
	
	
	

				
			
		

}
}
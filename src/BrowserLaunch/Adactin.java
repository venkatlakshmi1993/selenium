package BrowserLaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
public static void main(String[] args) throws InterruptedException, AWTException

{
	WebDriver driver=new firefoxDriver();
	driver.get(" http://adactinhotelapp.com/");
	
  WebElement username= driver.findElement(By.xpath("(//input[@class='login_input'])[1]"));
   username.sendKeys("manee123");
 
   WebElement password= driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
   password.sendKeys("51X6FQ");
 
   WebElement login = driver.findElement(By.id("login"));
   login.click();

   WebElement  location= driver.findElement(By.xpath("//select[@id='location']"));
   Select s= new Select(location);
   s.selectByIndex(3);
   String text1 = location.getText();
   System.out.println(text1);
   
	 WebElement hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
	 Select s2= new Select(hotel);
	 s2.selectByIndex(3);
	 
	 WebElement room= driver.findElement(By.xpath("//select[@id='room_type']"));
	 Select s1= new Select(room);
	 s1.selectByIndex(3);
	 
	 WebElement number = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
	 Select s4= new Select(number);
	 s4.selectByIndex(3);
			 
     WebElement child= driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
	 Select s5= new Select(child);
	 s5.selectByIndex(2);
			 
	 WebElement adult= driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
     Select s6= new Select(child);
	 s6.selectByIndex(2);
			 
	 WebElement search= driver.findElement(By.xpath("(//input[@id=\"Submit\"])[1]"));
	 search.click();

      
 
    
   
               
          
}
    
}

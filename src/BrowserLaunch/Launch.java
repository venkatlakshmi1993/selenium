package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	    WebElement username= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	    username.sendKeys("username");
	    
	    WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    password.sendKeys("password"); 
        WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
        Thread.sleep(2000);
	    login.click();
	   
	  
	   
	   
	}

}

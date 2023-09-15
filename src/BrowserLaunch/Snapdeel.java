package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeel {
	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
	    WebElement user = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
	    Thread.sleep(2000);
		user.sendKeys("venkat12@gmail.com");
		WebElement button = driver.findElement(By.xpath("//button[@id='checkUser']"));
        Thread.sleep(2000);
	    button.click();
	    }		
		
	}

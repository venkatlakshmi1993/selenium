package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement from = driver.findElement(By.xpath("(//div[@role=\"button\"])[1]"));
	from.sendKeys("chennai");
	
	WebElement to =driver.findElement(By.xpath("(//div[@role=\"button\"])[2]"));
	to.sendKeys("madurai");
}
	
}

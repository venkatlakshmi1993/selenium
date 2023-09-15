package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
public static void main(String[] args) throws InterruptedException{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/restaurants/login-besant-nagar-adyar-chennai-8308");
		WebElement phonenum = driver.findElement(By.xpath("//span[text()=\"Sign In\"]"));
		phonenum.click();
		WebElement name = driver.findElement(By.id("mobile"));
		name.sendKeys("9768545678");
		}
}
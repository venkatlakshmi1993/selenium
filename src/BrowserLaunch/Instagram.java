package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) throws InterruptedException{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		
		Thread.sleep(3000);
		WebElement id= driver.findElement(By.xpath("(//input[@aria-label='Phone number, username, or email'])[1]"));
		id.sendKeys("8795463453");
       WebElement pwd = driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d'])"));
	     pwd.sendKeys("45754");
	      }


}

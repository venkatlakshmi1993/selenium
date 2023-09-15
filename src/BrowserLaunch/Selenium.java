package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement train = driver.findElement(By.xpath("(//span[text()='Trainer'])[1]"));
		train.click();
		Thread.sleep(2000);
		WebElement para= driver.findElement(By.xpath("//p[contains(text(),'12+')]"));
		String text1 = para.getText();
		System.out.println(text1);
		
		
	}
}

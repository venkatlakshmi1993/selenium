package Takescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement  article = driver.findElement(By.xpath("//a[@class='btn btn-border active']"));
		js.executeScript("arguments[0].scrollIntoView(true)", article);
		
		
	}

}
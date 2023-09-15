package Takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.flipkart.com/");
		
		 WebElement cancel= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	     cancel.click();
	     WebElement kids = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	     kids.sendKeys("iphone");
	     kids.click();
	     
	     TakesScreenshot ts=(TakesScreenshot)driver;
	    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	    File f1= new File("F:\\screenshots\\iphone.png");
	    Thread.sleep(2000);
	
	}
	

}

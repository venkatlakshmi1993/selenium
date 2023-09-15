package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/index.html");
		WebElement greenshome = driver.findElement(By.xpath("//a[@class='activeLink']"));
		
		 TakesScreenshot ts=(TakesScreenshot)driver;
		    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		    File f = new File("F:\\screenshots\\greenshome.png");
		    FileUtils.copyFile(screenshotAs, f);
		    
		    
		
		
	}


}

package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaGreens {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html");
	
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement adayar = driver.findElement(By.xpath("//ul[@class='address']"));
	     js.executeScript("arguments[0].scrollIntoView(true)",adayar);
         String text = adayar.getText();
         System.out.println(text);
         
         
	}
	

}

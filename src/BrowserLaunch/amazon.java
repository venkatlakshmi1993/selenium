package BrowserLaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	public static void main(String[] args) throws InterruptedException, AWTException{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String parentid = driver.getWindowHandle();
		System.out.println("parent id is" +parentid);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("iphone x");
	    Thread.sleep(3000);
	    Actions ac=new Actions(driver);
	    WebElement search1 = driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]"));
	    ac.moveToElement(search1).perform();
	    ac.contextClick(search1).perform();
	    search1.click();
	    WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	    iphone.click();
	    
	    WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
	    String range = price.getText();
	    System.out.println("price of phone is.... " +range);
	    Set<String> allid = driver.getWindowHandles();
	    System.out.println(allid);
	    
	    for(String newid:allid)
	    {
	    	if(!(parentid.equals(newid)))
	    		driver.switchTo().window(newid);
	    		System.out.println(newid);
	    }
	    
	    
	    
	    
	    
	    
	  
		 
		 
		
    
		
	}
	
	

}

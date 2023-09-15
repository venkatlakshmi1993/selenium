package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechology {
	public static void main(String[] args){
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	//WebElement search = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
	//String text  = search.getText();
	//System.out.println(text);
	
	WebElement paragraph = driver.findElement(By.xpath("//p[contains(text(),'is')]"));
	String text = paragraph.getText();
	System.out.println(text);
	
	//driver.get("http://greenstech.in/selenium-course-content.html");
	//WebElement train = driver.findElement(By.xpath("(//span[text()='Trainer'])[1]"));
	//train.click();
	//WebElement para= driver.findElement(By.xpath("//p[contains(text(),'passion')]"));
	//String text1 = para.getText();
	//System.out.println(text1);
	
	
	

}
}
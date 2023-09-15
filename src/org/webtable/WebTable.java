package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> allcontent = driver.findElements(By.cssSelector("tbody>tr"));
	   for(int i=0;i<=allcontent.size()-1;i++) {
		String string = allcontent.get(i).getText();
		System.out.println(string);
		
	}
	

}
}
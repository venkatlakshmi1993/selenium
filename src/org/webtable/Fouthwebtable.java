package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fouthwebtable {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> allcontent = driver.findElements(By.xpath("//table[@border='l']//tbody//tr"));     
		System.out.println(allcontent.size());
		}
}


package BrowserLaunch;

import java.util.Scanner;

import org.openqa.selenium.By;

public class newone {
	
	
public static void main(String[] args) {
	String a="All department is first mouseover";
	String[] split = a.split("is");
	for(String all:split) {
		System.out.print(all);
	}
	
}


//  WebElement register = driver.findElement(By.xpath("//td[@class=\"login_register\"]"));
//  register.click();
}
/*	for(WebElement data:allcontent)
{
	String text = data.getText();
	System.out.println(text);
	System.out.println(text.length());
	
}*/
//System.out.println(allcontent.size());
//	for(int i=0;i<=1;i++) {
	
//	String text = allcontent.get(i).getText();
//	System.out.println(text);



//driver.findElement(By.xpath("//a[text()=\"Arabic\"]")).click();
//	List<WebElement> allname = driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
//	for(int i=0;i<allname.size();i++) {
//		String text = allname.get(i).getText();
//		if(text=="Hindhi") {
		
//		}
//	}
//String attribute2 = password.getAttribute("value");
// System.out.println(attribute2);
	
//String attribute1 = username.getAttribute("value");
// System.out.println(attribute1);
	
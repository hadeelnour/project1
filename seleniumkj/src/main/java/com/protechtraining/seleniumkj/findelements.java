package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.sun.tools.javac.util.List;

public class findelements {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
		driver=new ChromeDriver(); //navigation to website
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
List<WebElement> list_of_elements=  driver.findElements(By.xpath("//*[@name='login']"));

if(list_of_element.size() >0) {
System.out.println("Size of list=" + list_of_element.size());
	System.out.println("login button is present");
	}
else { 
	System.out.println("Size of list=" + list_of_element.size());
	System.out.println("login button is not present");
	
}
	Thread.sleep(5000);
	driver.close();
	}			
}			
	


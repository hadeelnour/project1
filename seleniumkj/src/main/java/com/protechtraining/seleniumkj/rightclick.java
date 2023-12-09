package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class rightclick {

	public static WebDriver driver;
	
	public static void main(String[] arg) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
	driver=new ChromeDriver();  //opening browser
	driver.get("https://deluxe-menu.com/popup-mode-sample.html");  //navigate to website
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
WebElement image_element= driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
Thread.sleep(5000);
	Actions ob= new Actions(driver);
ob.contextClick(image_element).build().perform();

	Thread.sleep(5000);
	driver.close();
	}

}

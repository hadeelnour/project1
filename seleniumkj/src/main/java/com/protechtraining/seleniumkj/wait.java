package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");	
	driver=new ChromeDriver(); // opening browser
	
	driver.get("https://www.amazon.com/");
driver.manage().window().maximize();

WebDriverWait ob= new WebDriverWait (driver, 20);
ob.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='twotabsearchtextbox']")));

System.out.println("Element is found");

Thread.sleep(5000);
driver.close();
	
	}
	
}

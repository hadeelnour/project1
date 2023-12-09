package com.protechtraining.seleniumkj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywait {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
driver=new ChromeDriver(); //opening browser

driver.get("https://www.amazon.com/");// navigating to website
driver.manage().window().maximize();
//Thread.sleep(15000);
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

WebElement search_field= driver.findElement((By.xpath("//*[@id='twotabsearchtextbox']")));
search_field.sendKeys("laptop");

Thread.sleep(5000);
driver.close();
	}
	

}

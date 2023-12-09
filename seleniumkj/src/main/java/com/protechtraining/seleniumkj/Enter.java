package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
		driver=new ChromeDriver(); //opening browser
		driver.get("https://www.amazon.com/"); //navigating to website
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement searchbox= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Laptop");
		Thread.sleep(5000);
		
		searchbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.close();

	}

}

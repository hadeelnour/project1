package com.protechtraining.seleniumkj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class browsers {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
	driver=new ChromeDriver();
	//driver.get("https://www.protrainingtech.com");
	driver.navigate().to("https://www.protrainingtech.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	String windowhandle=driver.getWindowHandle();
	System.out.println(windowhandle);
	}

}

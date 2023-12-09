package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement datafield= (WebElement) driver.findElements(By.xpath("//*[@name='EGDSDateRange-date-selector-trigger']"));
		datafield.click();
		Thread.sleep(5000);
		WebElement calenderdate= driver.findElement(By.xpath("//*[@aria-label='Sunday, November 19, 2023, Selected start date']"));
		calenderdate.click();
		Thread.sleep(5000);
		driver.close();
	}

}

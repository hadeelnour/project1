package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebDriver1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hadee\\eclipse-workspace\\selenium\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //opening browser
		driver.get("http//www.facebook.com");//navigating to website
		driver.manage().window().maximize();
		Thread.sleep(5000); //waiting for 5 seconds
		WebElement createAccount= driver.findElement(By.linkText("Create new account"));
		createAccount.click();

		Thread.sleep(5000);
		WebElement first_name= driver.findElement(By.xpath(//*[@name='firstname']"));
				first_name.sendKeys("firstname");
				Thread.sleep(10000); //waiting for 10 seconds
				driver.close();  //closing the browser
		
	}

}

package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgetpassword 
{

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
		driver=new ChromeDriver(); // opening browser
		driver.get("https://www.facebook.com"); //navigating to website
		driver.manage().window().maximize();
		Thread.sleep(5000);  //waiting for 5 seconds
		
		WebElement forgot_pass_button= driver.findElement(By.linkText("forgot password?"));
		//WebElementforgot_pass_button= driver.findElement(By.partiallinktext("forgot password"));
		forgot_pass_button.click();
		
		Thread.sleep(10000);  //waiting for 10 seconds
		driver.close();      //closing the browser

	}

}

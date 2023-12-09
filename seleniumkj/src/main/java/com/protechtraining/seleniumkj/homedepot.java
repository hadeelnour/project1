package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homedepot {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://homedepot.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement myaccount = driver.findElement(By.xpath("(//*[@class=['MyAccount__triggerSignIn sign-in-reminder__trigger_web']"));
		myaccount.click();
		Thread.sleep(5000);
		
		WebElement SingIn_button=  driver.findElement(By.xpath("//*[text()='signInHeader']"));
		SingIn_button.click();
		Thread.sleep(5000);
		
		WebElement createanew= driver.findElement(By.xpath("//*text()='Create an Account']"));
		createanew.click();
		Thread.sleep(5000);
		
		WebElement 
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("hadeel@yahoo.com");
		Thread.sleep(5000);
		
		WebElement password_input_field= (WebElement) driver.findElement(By.name("password"));
		password_input_field.sendKeys("hadeel@12345");
		Thread.sleep(5000);

		WebElement form_input_field= (WebElement) driver.findElement(By.name("phone"));	
		form_input_field.sendKeys("7036561960");
		Thread.sleep(5000);
		driver.close();
	}
	
	}



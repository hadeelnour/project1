package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class driver {
public static WebDriver driver;
private static WebElement Createlink;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		//WebElementporfolio=driver.findElement(By.id("menu-item-10234));
		//AmazonBasics.click();
		WebElement Creatlink=driver.findElement(By.partialLinkText("Createnew"));
		Createlink.click();
		Thread.sleep(3000);
		WebElement names= driver.findElement(By.name("firstname"));
		names.sendKeys("Hadeel");
		WebElement lastnames= driver.findElement(By.name("lastname"));
		lastnames.sendKeys("Nour");
		WebElement Mobileno= driver.findElement(By.name("reg_email___"));
		Mobileno.sendKeys("7036561960");
		WebElement Newpassword= driver.findElement(By.name("reg_password__"));
		Newpassword.sendKeys("Anour@1234567(");
		WebElement birthmonth= driver.findElement(By.name("birthday_month"));
		Select ob=new Select(birthmonth);
		selectByValue("5");
		WebElement birthday= driver.findElement(By.name("birthday_day"));
		Select ob1=new Select (birthday);
		selectByValue("5");
		WebElement bithyear= driver.findElement(By.name("birthday_year"));
		Select ob2=new Select(bithyear);
		selectByValue("1982");
		
				
		

	}

	private static void selectByValue(String string) {
		// TODO Auto-generated method stub
		
	}

	
	}


	



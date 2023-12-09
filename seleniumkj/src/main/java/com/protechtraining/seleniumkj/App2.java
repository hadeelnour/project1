package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App2
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
		driver=new ChromeDriver(); // opening browser
		driver.get("https://www.facebook.com"); //navigating to website
		driver.manage().window().maximize();
		Thread.sleep(5000);  //waiting for 5 seconds

		WebElement createAccount= driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		
		WebElement first_name=driver.findElement(By.name("Firstname"));
		first_name.sendKeys("Hadeel");
		Thread.sleep(5000);  //waiting for 5 seconds

		WebElement last_name=driver.findElement(By.name("Lastname"));
		last_name.sendKeys("Nour");
		Thread.sleep(5000);  //waiting for 5 seconds

		WebElement email=driver.findElement(By.name("reg_email___"));
		email.sendKeys("abc@yahoo.com");
		Thread.sleep(5000);  //waiting for 5 seconds

		WebElement reenter_email=driver.findElement(By.name("reg_email_confirmation___"));
		reenter_email.sendKeys("last first");
		Thread.sleep(5000);  //waiting for 5 seconds

		WebElement password_field=driver.findElement(By.name("reg_paword___"));
		password_field.sendKeys("password@1");
		
		WebElement bday_month =driver.findElement(By.name("birthday_month"));
		Select ob = new Select(bday_month);
		ob.selectByVisibleText("May");
		Thread.sleep(5000);
		
		WebElement bday_year=driver.findElement(By.name("birthday_year"));
		Select ob1 =new Select (bday_year);
		ob1.selectByVisibleText("1982");
		
		
		
		Thread.sleep(5000); //waiting for 5 seconds
		driver.close();  //closing the browser
		
	}

}

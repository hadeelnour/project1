package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ilocators {
	public static WebDriver driver;

public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
driver=new ChromeDriver();

driver.get("https://www.facebook.com");
driver.manage().window().maximize();
Thread.sleep(5000);// waiting for 5 seconds

WebElement CreateAccount=driver.findElement(By.linkText("Create new account"));
CreateAccount.click();
Thread.sleep(5000);
WebElement first_name= driver.findElement(By.name("firstname"));
first_name.sendKeys("Hadeel");
Thread.sleep(5000);
WebElement last_name=driver.findElement(By.name("lastname"));
last_name.sendKeys("Nour");
Thread.sleep(5000);
WebElement email= driver.findElement(By.name("reg_email___"));
email.sendKeys("abc@yahoo.com");
Thread.sleep(5000);
WebElement reenter_email= driver.findElement(By.name("reg_email_confirmation__"));
reenter_email.sendKeys("abc@yahoo.com");
Thread.sleep(5000);
WebElement password_field= driver.findElement(By.name("reg_password__"));
password_field.sendKeys("Nour@123");
Thread.sleep(5000);
WebElement bday_month =driver.findElement(By.name("birthday_month"));
Select ob=new Select(bday_month);
ob.selectByVisibleText("May");
Thread.sleep(5000);
WebElement birthday= driver.findElement(By.name("birthday_day"));
Select ob1=new Select(birthday);
ob1.selectByVisibleText("05");
Thread.sleep(5000);
WebElement birthyear= driver.findElement(By.name("birthday_year"));
Select ob2=new Select(birthyear);
ob2.selectByVisibleText("2022");
Thread.sleep(5000);
driver.close();




	}

}

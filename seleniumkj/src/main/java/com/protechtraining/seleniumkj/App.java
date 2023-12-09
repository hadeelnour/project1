package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
 public static WebDriver driver;
	public static void main( String[] args )throws InterruptedException
    {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
    driver=new ChromeDriver(); //opening browser
    driver.get("https://www.facebook.com");//navigate to Website
    driver.manage().window().maximize();
    Thread.sleep(5000);  //waiting for 5 seconds
    
    WebElement email_field= driver.findElement(By.id("email"));
    email_field.sendKeys("abc@yahoo.com");
    
    driver.findElement(By.name("pass"));
    WebElement pass_field= driver.findElement(By.name("pass"));
    pass_field.sendKeys("password");
    
    Thread.sleep(5000);
    
   WebElement login_button= driver.findElement(By.name("login"));
    login_button.click();
    Thread.sleep(10000); //waiting for 10 seconds
    driver.close(); //closing the browser
    }
	
}

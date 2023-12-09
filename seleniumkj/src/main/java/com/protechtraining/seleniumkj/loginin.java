package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class loginin
{
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
	     driver = new ChromeDriver(); //opening browser
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement login_button= driver.findElement(By.xpath("//*[@name='login']"));
if (login_button.isDisplayed()) {
	System.out.println("login button is displayed");
}
else {
	System.out.println("login button is not displayed");
}
Thread.sleep(5000);
driver.close();
}
}

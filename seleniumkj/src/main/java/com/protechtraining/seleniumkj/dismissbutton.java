package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dismissbutton {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
Thread.sleep(5000);

WebElement clickme= driver.findElement(By.xpath("//*[@id='alertButton']"));
clickme.click();
Thread.sleep(5000);
driver.switchTo().alert().dismiss();
Thread.sleep(5000);
driver.close();

	}

}

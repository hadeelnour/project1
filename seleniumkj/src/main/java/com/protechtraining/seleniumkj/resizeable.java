package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizeable {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resizeable/"); //navigation to website
driver.manage().window().maximize();
Thread.sleep(5000);
driver.switchTo().frame(0);

WebElement resizeable_element= driver.findElement(By.xpath("//*[@class='ui-widget-header']"));
Thread.sleep(5000);
Actions ob=new Actions(driver);
ob.dragAndDropBy(resizeable_element, 30, 100).build().perform();
Thread.sleep(5000);
driver.close();
	}

}

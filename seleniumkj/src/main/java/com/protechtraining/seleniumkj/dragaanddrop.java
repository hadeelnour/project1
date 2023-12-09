package com.protechtraining.seleniumkj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragaanddrop 
{
public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hadee\\eclipse-workspace\\seleniumkj\\drivers2\\chromedriver.exe" );
		driver=new ChromeDriver(); //opening browser
		driver.get("https://jqueryui.com/droppable/"); //navigate to website
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		WebElement  dragable_box1=  driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement  dropable_box2=  driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions ob = new Actions(driver);
		ob.dragAndDrop(dragable_box1, dropable_box2).build().perform();
		
		Thread.sleep(5000);
		driver.close();

	}

}

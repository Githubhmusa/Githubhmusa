package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		      
		       //browser type and chromedrover.exe path as parameters
		      System.setProperty("webdriver.chrome.driver",
		      "C:\\Driver\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      String url = " https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		      driver.get(url);
		      driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		      driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		      //Thread.sleep(10000);
		      driver.findElement(By.name("Submit")).click();
	}

}

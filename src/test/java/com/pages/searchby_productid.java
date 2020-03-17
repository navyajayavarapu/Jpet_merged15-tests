package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchby_productid {
	WebDriver driver;
	
	By textbox=By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By Search=By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	public void url() {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium-jars\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		 System.out.println(driver.getTitle());
	 }
	 
	 public void JpetSearch() {
		 driver.findElement(textbox).sendKeys("RP-LI-02");
		 
	 }
	 
	  public void click() {
		 driver.findElement(Search).click();
	 }
	 public void close() {
		 driver.quit();
	 }
	}



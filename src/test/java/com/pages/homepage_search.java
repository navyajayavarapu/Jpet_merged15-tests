package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage_search {
	WebDriver driver;
	
	By HomeText=By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img");
	By select =By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By item=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	
	 public void url() {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium-jars\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		 System.out.println(driver.getTitle());
	 }
	 
	 public void JpetSearch() {
		driver.findElement(HomeText).click();
		driver.findElement(select).click();
		 
	 }
	 
	  public void click() {
		 driver.findElement(item).click();
	 }
	 public void close() {
		 driver.quit();
	 }
	}



package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelutility.Read_excelsheet;

public class Login_main {
		
		WebDriver driver;
		By signin=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
		By username=By.name("username");
		By password=By.name("password");
		By login=By.xpath("//*[@id=\"Catalog\"]/form/input");
		
		public void url() 
			{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium-jars\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			System.out.println(driver.getTitle());
			}
			public void homepage()
			{
				driver.findElement(signin).click();		
			}
			
			public void Jpet_username(int i) throws IOException
			{
				//driver.findElement(username).sendKeys("navyajayavarapu");
				Read_excelsheet read=new Read_excelsheet();
				driver.findElement(username).sendKeys(read.Excel_Username(i));
			}

			public void Jpet_password(int i) throws IOException 
			{
				//driver.findElement(password).sendKeys("navya123");
				Read_excelsheet read=new Read_excelsheet();
				driver.findElement(password).sendKeys(read. Excel_password(i));	
			}

			public void Login_click() throws InterruptedException 
			{
				driver.findElement(login).click();	
				Thread.sleep(4000);
			}
			public void close()
			{
				driver.close();
			}

}

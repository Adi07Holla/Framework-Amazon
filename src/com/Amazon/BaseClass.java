package com.Amazon;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass
	public void configBC()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void configBM()
	{
		driver.findElement(By.xpath("//*[text()='Your Amazon.com']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("adisangel@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("chimes_7adi");
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	@AfterMethod
	public void configAM()
	{
		driver.findElement(By.xpath("//*[contains(text(),'Hello, Aditi')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Not Aditi? Sign Out')]")).click();
	}
	
	@AfterClass
	public void configAC()
	{
		driver.close();
	}
}

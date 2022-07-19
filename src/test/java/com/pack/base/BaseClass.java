package com.pack.base;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
   protected WebDriver driver;
   
   @BeforeSuite
   public void start()
   {
	   WebDriverManager.chromedriver().setup();
	   driver =new ChromeDriver();
	   driver.get("http://practice.automationtesting.in/");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   
   }
   
   @AfterSuite
   
   public void end()
   {
	   driver.close();
   }
   
	
}

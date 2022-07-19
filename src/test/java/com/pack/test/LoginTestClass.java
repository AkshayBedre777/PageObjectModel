package com.pack.test;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.pack.base.BaseClass;
import com.pack.javapage.LoginPageClass;

public class LoginTestClass extends BaseClass 
{
	@Test(description = "Click on Shop",priority = 0)   
	public void Shop() 
	{
		
		LoginPageClass lp=new LoginPageClass(driver);
		lp.Shop();
		
	}
	
	@Test(description = "Scroll Down on Android Book",priority = 1)
	public void scrollDown() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	}
	
    @Test(description = "Add to Basket",priority = 2)
	
	public void clickOnBook() throws InterruptedException
	{
	    LoginPageClass lp=new LoginPageClass(driver);
	    lp.clickOnBook();
		Thread.sleep(2000);
	}

    @Test(description = "Click on Dropdown select Element",priority = 3)

    public void dropdown() throws InterruptedException
    {
	
	    LoginPageClass lp=new LoginPageClass(driver);
	    lp.dropdown();
	    Thread.sleep(2000);
    }
   
    @Test(description = "Click on Cart",priority = 4)
    public void cart()
   {
	   LoginPageClass lp=new LoginPageClass(driver);
	   lp.cart();
   }

   @Test(description = "Get Table Data",priority = 5)
    public void table()
   {
	   LoginPageClass lp=new LoginPageClass(driver);
	   lp.table();
   }

}
package com.pack.javapage;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.List;
import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginPageClass 
{
	public static WebDriver driver;
	
	@FindBy (xpath = "//a[text()='Shop']")     
	private WebElement shop;
	
	@FindBy (xpath = "//h3[text()='Android Quick Start Guide']")
	private WebElement book;
	
	@FindBy(name = "quantity")
	private WebElement drop;
	
	@FindBy(xpath = "//button[text()='Add to basket']")
	private WebElement add;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a/span[1]")
	private WebElement cart;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table")
	private List<WebElement> table;
	
	public LoginPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Shop() 
	{
		boolean ActualResult=shop.isDisplayed();
		assertTrue(ActualResult);
		shop.click();
		
	}

	public void clickOnBook()
	{
		
		book.click();
	}
	
	public void dropdown() 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		drop.click();
		add.click();	
	}
	
	public void cart()
	{
		
		cart.click();
		
	}
	
	public void table()
	{
		for(WebElement a:table)
		{
			System.out.println(a.getText());
		}
	}
}

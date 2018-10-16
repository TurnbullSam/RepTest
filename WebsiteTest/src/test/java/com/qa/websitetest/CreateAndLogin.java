package com.qa.websitetest;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndLogin 
{
	public WebDriver driver = null;
	
	@Before
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	@Test
	public void createAndLoginTest()
	{
		driver.get("http://thedemosite.co.uk/");
		driver.findElement(By.linkText("3. Add a User")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("test1");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("test1");
	    driver.findElement(By.name("FormsButton2")).click();
	    driver.findElement(By.linkText("4. Login")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("test1");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("test1");
	    driver.findElement(By.name("FormsButton2")).click();
	    
	    WebElement text = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
	    assertEquals("The login has failed!!!","**Successful Login**",text.getText());
	}
}

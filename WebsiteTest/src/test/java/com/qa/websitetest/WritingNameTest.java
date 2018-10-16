package com.qa.websitetest;

import static org.junit.Assert.assertEquals;

	import org.junit.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;



public class WritingNameTest
{
	
		public WebDriver driver = null;
		public Actions action = null;
		
		@Before
		public void setup() 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			action = new Actions(driver);
		}
		@After
		public void teardown()
		{
			driver.quit();
			action.quit();
		}
		
		@Test 
		public void writingname()
		{
			driver.get("https://www.youidraw.com/apps/painter/");
			action.moveByOffset(10,10).perform(); 
		}

}

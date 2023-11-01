package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllWebsites {
	 @AfterClass
	  public void afterClass() {
		 
		  System.out.println("This is executed after all tests");
	  }
	 @Test (priority=3)
	  public void Saucedemo () {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
			
			//Invoke the browser
			
			WebDriver driver = new 	ChromeDriver();
			
			
			//Maximize the browser
			
			driver.manage().window().maximize();
			
			//launch the sauce demo
			driver.get("https://www.saucedemo.com/");
			
			//login
			driver.findElement(By.id("user-name")).click();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			
			driver.findElement(By.id("password")).click();
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			
			driver.findElement(By.id("login-button")).click();
			
			//product detail page
			driver.findElement(By.id("item_4_title_link")).click();
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.id("shopping_cart_container")).click();
			driver.findElement(By.id("checkout")).click();
			
			//checkout page
			driver.findElement(By.id("first-name")).click();
			driver.findElement(By.id("first-name")).sendKeys("Manikanta");
			driver.findElement(By.id("last-name")).click();
			driver.findElement(By.id("last-name")).sendKeys("Raju");
			driver.findElement(By.id("postal-code")).click();
			driver.findElement(By.id("postal-code")).sendKeys("533002");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("finish")).click();
			
			driver.close();
			

		  
		 
	  }
	 @Test (priority=2)
	  public void Amazon () {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
			
						
			WebDriver driver = new 	ChromeDriver();
			
			
			driver.manage().window().maximize();
						
			driver.get("https://www.amazon.com/");
			
				
			driver.close();

		  
		  
	  }
	 @Test (priority=1)
	  public void Target() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");

			
			WebDriver driver = new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.target.com/");
			
			driver.close();
		  
		  
	  }
	 
	
	 @BeforeClass
	  public void beforeClass() {
		 System.out.println("This is executed before any tests");
		  
	  }
	 }
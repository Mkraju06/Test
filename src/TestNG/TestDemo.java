package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo {
	WebDriver driver = new 	FirefoxDriver();
	
	 
@Parameters({"URL", "username", "password"})
  @Test
  public void demosite(String urlname, String user, String pass) {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\sasik\\Documents\\Drivers\\geckodriver.exe");
	  driver.get(urlname);
	  driver.findElement(By.id("user-name")).sendKeys(user);
		
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(pass);
	  System.out.println(urlname);
	  System.out.println("This is another Test Demo");
	
	 
  }

  @Test
  public void HelloWorld()
  {
	  System.out.println("This will execute last");
  }
  
  @BeforeMethod
	 public void BeforeM() {
		 
		 System.out.println("This will be executed after Before Class and before any methods");
	 }
	 @AfterMethod
	 public void AfterM() {
		 
		 System.out.println("This will be executed after Before Class and after any methods and before After Class");
	 }
	 
	 @BeforeClass
	  public void beforeClass() {
		  
		  System.out.println("This is a before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  
		  System.out.println("This is a after Class");
	  }
}

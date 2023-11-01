import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
		
		//Invoke the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Launch the Sauce Demo
		driver.get("https://www.saucedemo.com/");
		
		//Login
		//driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Product Detail page
		driver.findElement(By.id("item_4_title_link")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		
		//Checkout page
		driver.findElement(By.id("first-name")).sendKeys("Voleti");
		driver.findElement(By.id("last-name")).sendKeys("Manikanta");
		driver.findElement(By.id("postal-code")).sendKeys("533002");
		driver.findElement(By.id("continue")).click();

	}

}

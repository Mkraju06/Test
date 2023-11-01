import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//launch the amazon demo
		driver.get("https://www.amazon.com/");
		
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		WebElement element = driver.findElement(By.xpath("/html/body"));
		Actions build = new Actions(driver);
		//build.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("chair").build().perform();
		build.contextClick(element);
		
		
		
	}

}

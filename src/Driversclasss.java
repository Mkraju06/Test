import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driversclasss {
	
	public void ChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
System.out.println("ChromeDriver launched succesfully");
	
	}
	
	public void GeckoDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sasik\\Documents\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("GeckoDriver launched succesfully");
	}
	public void EdgeDriver() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\sasik\\Documents\\Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	System.out.println("EdgeDriver launched succesfully");
}
}

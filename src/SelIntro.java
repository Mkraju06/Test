import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//Automating the homepage with using Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
		
		//Invoke the browser
		WebDriver driver = new ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//driver.close();
		driver.quit();
		
		
	}

}

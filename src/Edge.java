import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\sasik\\Documents\\Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		// Maximize Screen
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//close
		driver.close();
		


	}

}

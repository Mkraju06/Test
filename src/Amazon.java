import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
		
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//launch the target demo
		
		driver.get("https://www.amazon.com/");
		
			
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Charger");
		
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		
		ArrayList<String> proArray = new ArrayList<String>();
		
		List <WebElement> ProList = driver.findElements(By.xpath("//*[@class= 'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
		String ProNames=null;
		
		
		int proSize = ProList.size();
		System.out.println(proSize);
		for(int i=1; i<=11; i++) 
		{
			
		
			System.out.println("The value of i is: " +i);
			
		 ProNames =	driver.findElement(By.xpath("(//*[@id=\"search\"]//div[1]/h2/a)["+i+"]")).getText();
	//	System.out.println(ProNames);
		
		proArray.add(ProNames);

	}
		
		//System.out.println("This is the name that is stored in the String variable: "+ProNames);
		for(String entirelist:proArray) {
			
			System.out.println(entirelist);
		}
		
		ProList.get(9).click();
		
		//driver.findElement(By.xpath("(//*[@id=\"search\"]//div[1]/h2/a)[9]")).click();
	}
}
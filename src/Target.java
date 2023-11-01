import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
		
		//Invoke the browser
		
		WebDriver driver = new 	ChromeDriver();
		
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		//launch the Amazon demo
		
				driver.get("https://www.amazon.com/");
				
				driver.findElement(By.id("twotabsearchtextbox")).click();
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
				
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				ArrayList<String> proArray = new ArrayList<String>();
				
				List <WebElement> ProList = driver.findElements(By.xpath("//*[@class= 'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
				
																									
				int proSize = ProList.size();
				System.out.println(proSize);
				for(int i=1; i<=5; i++) 
				{
					
					/*if(i==3) {
						i++;
					}*/
					System.out.println("The value of i is: " +i);
					
				String ProNames =	driver.findElement(By.xpath("(//*[@id=\"search\"]//div[1]/h2/a)["+i+"]")).getText();
				System.out.println(ProNames);
				
				driver.findElement(By.xpath("(//*[@id=\"search\"]//div[1]/h2/a)[5]")).click();

			}

			}
		}
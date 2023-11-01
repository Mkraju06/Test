import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int i;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasik\\Documents\\Drivers\\chromedriver.exe");
		
		//Invoke the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).click();
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
			*/
		//To get the value from an array syntax - arrayName[indexNumber of the value]
		//                        0                1              2
		String [] usernames = {"standard_user","locked_out_user", "problem_user", "performance_glitch_user"};
		
		System.out.println(usernames.length);
		System.out.println(usernames[2]);
		
		//for loop syntax - for(datatype variableName = value; condition; increment/decrement) 
		//i<, i > , i<=, i>=, i==
		//left i value > verifies the condition > enters the loop
		//right i value will be incremented > it verifies the condition - this will happen until the condition is satisfied.
		//i<4
		
		for(i=0; i<usernames.length; i++ ) 
		{
			//i=2
			if(i==1) {
			i++;
			}
			driver.findElement(By.id("user-name")).sendKeys(usernames[i]);
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			System.out.println(i + "This is the value now");
			
			
		}
		System.out.println(i);
	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

}

import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
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
		
	String ProName=	driver.findElement(By.id("item_4_title_link")).getText();
	
	System.out.println(ProName);
	
	//Syntax for Array list - ArrayList <Data type> arrayListName = new ArrayList<Data type>
	//Syntax for List - List <WebElement>  ListName = Arrays.asList();
	//List<WebElement> listnme = driver.findElements(By.xpath("//*[@class= 'inventory_item_name']"));
	//arrayListName.add
	
	ArrayList<String> proArray = new ArrayList<String>();
	
	List <WebElement> ProList = driver.findElements(By.xpath("//*[@class= 'inventory_item_name']"));
	
	//	System.out.println(ProList);
		
	int proSize = ProList.size();
	
	for(int i=0; i<proSize; i++) 
	{
		if(i==3) {
			i++;
		}
	String ProNames =	driver.findElement(By.id("item_"+i+"_title_link")).getText();
	
	
try {
	
	
	String [] split = ProNames.split("Sauce Labs");

	proArray.add(split[1]);
		
		System.out.println(proArray.get(i));
	}
catch (Exception e) {
	// TODO: handle exception
	System.out.println("This is the exception: "+e);
		}
	}
	
	driver.close();
	}
	
}
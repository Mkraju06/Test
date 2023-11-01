package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Depends {
	
	
  @Test(enabled=true)
  public void Maruti() {
	  
	  System.out.println("Maruti car loan");
	  
  }
  
  @Test(dependsOnMethods = {"Maruti"})
  public void BMW() {
	  
	  System.out.println("BMW car loan");
	  
  }
  
  @Test(timeOut=2000)
  public void Duplex() {
	  
	  System.out.println("Duplex Home loan");
	  
  }
  
  @Test (dataProvider="getData")
  public void credentials(String username, String password) {
	  
	  System.out.println(username);
	  System.out.println(password);
  }
  
  @DataProvider
  public Object[][] getData()
  {
	  //1st username and passowrd
	  //2nd username and password
	  //3rd username and password
	  
	  Object[][] data = new Object[3][2];
	  
	  //1st Set
	data[0][0]= "firstusername";
	data[0][1] = "firstpassword";
	
	//2nd Set
	data[1][0] = "secondusername";
	data[1][1] = "secondpassword";
	
	//3rd Set
	data[2][0] = "thirdusername";
	data[2][1] = "thirdpassword";
	
	return data;
	
	
  }
  
}

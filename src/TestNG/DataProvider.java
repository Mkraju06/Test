package TestNG;

import org.testng.annotations.Test;

public class DataProvider {
	
	
   
  @Test (dataProvider="getData")
  public void credentials(String Name, String Age){
	  
	  System.out.println(Name);
	  System.out.println(Age);
  }
  
  @DataProvider
  public Object[][] getData()
  {
	  
	  
	  Object[][] data = new Object[2][2];
	  
	  
	data[0][0]= "Mani";
	data[0][1] = "30";
	
	
	data[1][0] = "Raju";
	data[1][1] = "29";
	
	
	
	
	return data;
	
	
  }
  
}
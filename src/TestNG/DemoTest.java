package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DemoTest {
  @Test
  public void f() {
	  
	  System.out.println("This is a demo");
	  
	  try {
		//System.out.println(7/a);
	} catch (Exception e) {
		System.out.println("This is an error");
	}
	  
	  for(int i=10;i<11;i++) {
		  
		  System.out.println("Iteration of 1-10 natural numbers");
		  
		  
	  }
  }
  
	  @Test
	  public void f1() {
		  
		  System.out.println("This is a demo of f1");
		  
		
		  
		  
		  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("This is a before Class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("This is a after Class");
  }
  

}

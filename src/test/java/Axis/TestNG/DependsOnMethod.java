package Axis.TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
  @Test(enabled = false)
  public void testcase1() {
	  System.out.println("TC1 Excecuted Successfully");
  }
  
  @Test(dependsOnMethods = "testcase1")
  public void testcase2() {
	  System.out.println("TC2 Excecuted Successfully");
  }
  
  @Test
  public void testcase3() {
	  System.out.println("TC3 Excecuted Successfully");
  }
}

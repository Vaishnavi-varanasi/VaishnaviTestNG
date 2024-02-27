package Axis.TestNG;

import org.testng.annotations.Test;

public class PriorityTesting {
	
  @Test(priority = 1)
  public void testcase1() {
	  System.out.println("TC1 Excecuted Successfully");
  }
  
  @Test(priority = 2)
  public void testcase2() {
	  System.out.println("TC2 Excecuted Successfully");
  }
  
  @Test(priority = 0)
  public void testcase3() {
	  System.out.println("TC3 Excecuted Successfully");
  }
}

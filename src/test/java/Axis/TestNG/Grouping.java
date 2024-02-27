package Axis.TestNG;

import org.testng.annotations.Test;

public class Grouping {
	
  @Test(groups = {"Sanity","Regression"})
  public void login() {
	  System.out.println("User is logged in");
  }
  
  @Test(groups = {"Regression"})
  public void search() {
	  System.out.println("Search results displayed");
  }
  
  @Test(groups = {"Sanity"})
  public void AddoToCart() {
	  System.out.println("Added to Cart");
  }
  
  @Test(groups = {"Sanity","Regression"})
  public void Products() {
	  System.out.println("Products visible");
  }
  
  @Test(groups = {"Sanity"})
  public void PaymentGateway() {
	  System.out.println("Order Placed");
  }
  
}

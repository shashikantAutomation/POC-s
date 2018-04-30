package test.test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test(retryAnalyzer=listener.class)
  public void f() {
	  Assert.assertTrue(true);
  }
  @Test(retryAnalyzer=listener.class)
  public void f2()
  {
	  Assert.assertTrue(false);
  }
  
  
  
  
}

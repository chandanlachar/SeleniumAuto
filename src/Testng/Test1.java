package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test()
	public void testcase()
	{
		Reporter.log("hello",true);
		Reporter.log("hello",false);
		
	}

}

package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test2 {
	@Test(priority = -6)
	public void chat() {
	Reporter.log("execute",true);
	}
	
	@Test(priority = -3,invocationCount=5)
	
		public void video(){
		Reporter.log("VIDEO",true);
	}
	@Test()
	public void pic() {
		Reporter.log("pic",true);
	}
	@Test(priority = 2,invocationCount=10)
	public void vid() {
		Reporter.log("vid",true);
	}
	@Test(enabled=false)
	public void photo() {
		Reporter.log("photo",true);
	
			
	}

}

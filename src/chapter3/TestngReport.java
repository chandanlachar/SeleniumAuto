package chapter3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngReport {
	@Test
	public void tc1() {
		Reporter.log("hello",true);
	}

}

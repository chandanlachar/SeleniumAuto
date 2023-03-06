package seleniumnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		//http://username:password@link
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

package Now;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Program Files/eclipse/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("email")).sendKeys("CHANDAN");
	driver.findElement(By.name("pass")).sendKeys("1234");
	driver.findElement(By.id("loginbutton")).click();
	
	String exp="facebook";
	String res=driver.getTitle();
	if(exp.equals(res)) {
		System.out.println("TEST IS PASSED");
	}
		else
		{
			System.out.println("Test IS FAILED");	
	}
	System.out.println(res);
	}
}


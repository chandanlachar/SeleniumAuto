import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bhv {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("vidya");
		driver.findElement(By.id("pass")).sendKeys("dfnjnjrg");
		
	
 }
	}

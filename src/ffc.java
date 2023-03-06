import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ffc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.name("submit")).sendKeys("chsh");
		WebElement w=driver.findElement(By.name("userName"));
		w.sendKeys("ff");
		driver.findElement(By.name("password")).sendKeys("sfccsf");
		driver.findElement(By.name("submit")).click();
		String s="Welcome: Mercury Tours";
		String as=driver.getTitle();
		if(s.equals(as)) {
			System.out.print("pass");
		}
		else {
			System.out.println("fail");
		
		}
		
		
		
	}

}

package seleniumnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelemtvolunterform {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("chandan");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("L achar");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("1234567890");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("INDIA");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Sunday')]")).click();
	
		

	}

}

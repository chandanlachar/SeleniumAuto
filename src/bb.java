import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bb {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement w=driver.findElement(By.name("username"));
		System.out.println(w.getSize());
	
		if (w.isDisplayed()) {
			System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		driver.switchTo();
		}
	
				

}

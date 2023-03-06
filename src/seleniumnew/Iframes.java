package seleniumnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(5000);
       // driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]")).click();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//body/main[1]/div[1]/section[1]/ul[1]/li[13]/a[1]/span[1]")).click();
	}

}

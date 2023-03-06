package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"," ");
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement o=driver.findElement(By.id("email"));
	    o.sendKeys("fccc");
		

	}
}

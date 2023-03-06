package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("chandan");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("12345");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement button=driver.findElement(By.name("btnLogin"));
        js.executeScript("arguments[0].click();", button);
        js.executeScript("alert('welcome');");
        
		

		
		
		

	}

}

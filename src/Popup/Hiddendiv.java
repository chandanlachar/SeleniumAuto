package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendiv {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath("//label[@for='departure']")).click();
WebElement ele = driver.findElement(By.xpath("(//p[text()='12'])[2]"));
System.out.println(ele.getText());
ele.click();
		// TODO Auto-generated method stub

	}

}

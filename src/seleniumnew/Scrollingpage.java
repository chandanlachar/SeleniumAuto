package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,500)", ""); //by pixel
		//using web element)
	/*	WebElement w=driver.findElement(By.xpath("//*[@id=\"live-flagship-root\"]/div/div[1]/div/a"));
		js.executeScript("arguments[0].scrollIntoView();", w); */
		
		//scroll till bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}

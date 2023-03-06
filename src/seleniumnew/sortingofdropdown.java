package seleniumnew;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sortingofdropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		Select drop=new Select(driver.findElement(By.id("animals")));
		List  originallist=new ArrayList();
		List <WebElement> options=drop.getOptions();
		for(WebElement e: options) {
			originallist.add(e.getText());
		}
          System.out.println(originallist);
		List templist=new ArrayList();
		templist=originallist;
		System.out.println(templist);
		Collections.sort(templist);
		System.out.println(templist);

	}
 
}

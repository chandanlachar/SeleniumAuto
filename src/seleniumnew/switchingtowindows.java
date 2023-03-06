package seleniumnew;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingtowindows {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
    System.out.println( driver.getTitle());
    System.out.println(driver.getWindowHandles());
    Set <String> s=driver.getWindowHandles();
    for(String i:s) {
    	String t=driver.switchTo().window(i).getTitle();
    	System.out.println(t);
    	System.out.println(i);
    }
	}

}

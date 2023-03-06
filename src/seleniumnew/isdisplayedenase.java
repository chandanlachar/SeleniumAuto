package seleniumnew;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayedenase {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     WebElement e=driver.findElement(By.name("email"));
     WebElement a=driver.findElement(By.name("pass"));
    if(e.isDisplayed() && e.isEnabled()) {
    	e.sendKeys("ff");
    }
    System.out.println(e.isDisplayed());
    driver.navigate().to("https://www.facebook.com/signup");
    driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected();
    driver.findElement(By.xpath("//label[contains(text(),'Male')]")).isSelected();
    if(driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected()==false) {
    	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();	
    }
	}
	

}

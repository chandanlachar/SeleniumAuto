package Now;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Program Files/eclipse/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    System.out.println(driver.getTitle());
    driver.close();
    
	}

}

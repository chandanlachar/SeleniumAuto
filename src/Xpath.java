import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("cHANN123");
		driver.findElement(By.name("pwd")).sendKeys("ad12233dnjncejc");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		String title= driver.getTitle();
		System.out.println(title);

		if(title.equals("actiTIME - Login")) {
			System.out.println("Pass:home page is displayed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.close();
		

	}

}

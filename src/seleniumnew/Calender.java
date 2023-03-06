package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("fourth_date_picker")).click();
		Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
	month.selectByVisibleText("Oct");
	Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
	year.deselectByVisibleText("2022");
	driver.findElement(By.linkText("21")).click();
		

	}

}

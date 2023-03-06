package seleniumnew;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	//	Set <Cookie>cookies=driver.manage().getCookies();
	  /* System.out.println(  cookies.size());
	   for(Cookie cookie:cookies) {
		System.out.println(cookie.getName()+""+cookie.getValue());
		
		   driver.close();
	   }*/
	  /*  driver.manage().deleteCookieNamed(null)
		driver.manage().deleteAllCookies()
		driver.manage().getCookieNamed(null)
		driver.manage().getCookies()   */
		
		//add cookie
		Cookie cookie=new Cookie("mycookie","123456");
		driver.manage().addCookie(cookie);
		driver.manage().getCookies();
	 System.out.println( cookie.getName()+""+cookie.getValue());
	   
	}

}

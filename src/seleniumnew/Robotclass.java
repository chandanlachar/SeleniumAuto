package seleniumnew;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		Robot robot=new Robot();
		robot.mouseMove(0, 0);
		
		

	}

}

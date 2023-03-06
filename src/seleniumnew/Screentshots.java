package seleniumnew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screentshots {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twoplugs.com/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg=new File("E://screenshots.png");
		FileUtils.copyFile(src, trg);

	}

}

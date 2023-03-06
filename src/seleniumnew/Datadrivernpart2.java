package seleniumnew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datadrivernpart2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream file=new FileInputStream("C://excel//table2.xlsx");//path
		XSSFWorkbook workbook=new XSSFWorkbook(file);//workbook
		XSSFSheet sheet=workbook.getSheetAt(0); //sheetnumber
		int rowcount=sheet.getLastRowNum();//noofrows
		System.out.println("No of rows  : "+rowcount);
		for(int row=1;row<=rowcount;row++) {
			XSSFRow currentrow=sheet.getRow(row);
			String firstname=currentrow.getCell(0).getStringCellValue();
			String lastname=currentrow.getCell(1).getStringCellValue();
			String phone=currentrow.getCell(2).getStringCellValue();
			String email=currentrow.getCell(3).getStringCellValue();
			String address=currentrow.getCell(4).getStringCellValue();
			String city=currentrow.getCell(5).getStringCellValue();
			String state=currentrow.getCell(6).getStringCellValue();
			String postalcode=currentrow.getCell(7).getStringCellValue();
			String country=currentrow.getCell(8).getStringCellValue();
			String username=currentrow.getCell(9).getStringCellValue();
			String password=currentrow.getCell(10).getStringCellValue();
		}
		//contact information
		driver.findElement(By.name("firstName")).sendKeys("firstname");
		driver.findElement(By.name("lastName")).sendKeys("lastname");
		driver.findElement(By.name("phone")).sendKeys("phone");
		driver.findElement(By.name("userName")).sendKeys("email");
		
		//mailing information
		driver.findElement(By.name("address1")).sendKeys("address");
		driver.findElement(By.name("city")).sendKeys("city");
		driver.findElement(By.name("state")).sendKeys("state");
		driver.findElement(By.name("postalCode")).sendKeys("postalcode");
		//dropdowm
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		
		//user information
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("confirmPassword")).sendKeys("password");
		
	//submiting information
		driver.findElement(By.name("submit")).click();
	

		
		
		
		
		
		
	}

}

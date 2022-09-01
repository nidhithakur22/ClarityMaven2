package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.javafaker.Faker;

public class VerfiyEmployeeRecordPage extends BasePage {

	public VerfiyEmployeeRecordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	int waittime = 25000;

	JavascriptExecutor js 	= (JavascriptExecutor) driver;
	Actions a 				= new Actions(driver);
	String filepath 		= "C:\\Users\\Asus\\Desktop\\Clarity Videos\\Clarity_Assurance\\EWN OQ files\\EWN OQ files\\EWNoqemployeeReport.xlsx";  


	/*
	 * Web Element
	 */

	By searchbar = By.xpath("//*[@id=\"nav-tab\"]/div[2]/div[1]/input");

	public VerfiyEmployeeRecordPage verifyOQEmployeeRecords() throws Exception {

		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"nav-tab\"]/div[2]/div[1]/input"));
		System.out.println("searchbox is detected");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
		System.out.println("Scrolll is executed successfully");
		
		File src		    = new File(filepath);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb 	= new XSSFWorkbook(fis);
		XSSFSheet sheet1 	= wb.getSheetAt(0);
		int rows 			= sheet1.getPhysicalNumberOfRows();
		int cols 			= sheet1.getRow(1).getPhysicalNumberOfCells();
		System.out.println("Total number of rows---" + rows);						
		System.out.println("Total number of columns---" + cols);
		
		
		String data[][] = new String[rows][cols];
		
		XSSFCell cell;
		 for(int i=0;i<rows;i++) {
			 for(int j=0; j<cols; j++) {
				 
				cell = sheet1.getRow(i).getCell(j);
				String cellContents = cell.getStringCellValue();
				data[i][j]= cellContents;
				System.out.println(data[i][j]);
				
		 }}
		 
		wb.close();
		fis.close();

		return new VerfiyEmployeeRecordPage(driver);

	}
}

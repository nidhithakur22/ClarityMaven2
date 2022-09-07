package pages;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Array;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
		int rows 			= sheet1.getLastRowNum();
		
		int cols 			= sheet1.getRow(1).getLastCellNum();
		System.out.println("Total number of rows---" + (rows-1));						
		System.out.println("Total number of columns---" + cols+"\n");
		/*
		 * java.util.Iterator<Row> iterator = sheet1.iterator();
		 * 
		 * String data1[][] = new String[rows][cols]; while(iterator.hasNext()) {
		 * XSSFRow row1 = (XSSFRow) iterator.next(); java.util.Iterator<Cell> cell1 =
		 * row1.cellIterator(); while(cell1.hasNext()) {
		 * 
		 * XSSFCell cell2 = (XSSFCell) cell1.next(); String value;
		 * switch(cell2.getCellType()) {
		 * 
		 * case STRING : value = cell2.getStringCellValue(); System.out.println(value);
		 * break; case NUMERIC : value = cell2.getDateCellValue().toString();
		 * System.out.println(value); break; default: break;
		 * 
		 * } System.out.print(" ! ");
		 * 
		 * } System.out.println();
		 * 
		 * 
		 * }
		 */
		String[][] data = new String[rows][cols];
		
		for(int i =0; i<=rows-1; i++)
		{
			XSSFRow row = sheet1.getRow(i);
			for(int j = 0; j<cols;j++) {
				DataFormatter df = new DataFormatter();
			data[i][j] = df.formatCellValue(sheet1.getRow(i).getCell(j));
		//		XSSFCell cell = row.getCell(j);
			//	String value = null;
			
		/*		  switch(cell.getCellType()) {
				 
				  case STRING :
					  value = cell.getStringCellValue();
						data1[i][j] = value;
					  System.out.print(value);
					  System.out.print("  ");
				  break;
				  case NUMERIC :	  
					   value = cell.getDateCellValue().toString();
						data1[i][j] = value;
						 System.out.print(value);
						 System.out.print("  ");
						 break;
				
				  default: break;
				  */
			}
					
			
			
			System.out.println(" ");
	
			
		}
		
		
	
		wb.close();
		fis.close();
		for(String[] dataArr : data) {
		System.out.println(java.util.Arrays.toString(dataArr));	
		}
		
		return new VerfiyEmployeeRecordPage(driver);

	}
	
	
	
	By employee = By.xpath("//*[@id=\"nav-home-tab\"]/div/div[1]/div/h4");
	
	public void TestEmployeeOQRecords() throws InterruptedException {
	
		Thread.sleep(10000);
		String w1 = driver.findElement(employee).getText();
		try {
			Thread.sleep(10000);
		assertEquals(w1,"Smith Adam Repair & maintenance");
		System.out.println("employee found");
		}finally {
			System.out.println("employee not found");
		}
		
		
		 	
		
	}


}

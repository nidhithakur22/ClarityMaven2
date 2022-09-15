package pages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
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
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;
import com.sun.beans.introspect.PropertyInfo.Name;

public class VerfiyEmployeeRecordPage extends BasePage {

	public VerfiyEmployeeRecordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	int waittime = 25000;
	public String[][] data;
	public String name1;
	public String name;
	public String EmployeeFullName;


	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions a = new Actions(driver);
	String filepath = "C:\\Users\\Asus\\Desktop\\Clarity Videos\\Clarity_Assurance\\EWN OQ files\\EWN OQ files\\EWNoqemployeeReport.xlsx";
	SoftAssert softAssert = new SoftAssert();
	 List<String> l1 = new ArrayList<String>();
	 List<String> l2 = new ArrayList<String>();
	/*
	 * Web Element
	 */
	By employee = By.xpath("//*[@id=\"nav-home-tab\"]/div/div[1]/div/h4");

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
		
		 data = new String[rows][cols];
		
		for(int i =0; i<=rows-1; i++)
		{
			XSSFRow row = sheet1.getRow(i);
			for(int j = 0; j<cols;j++) {
				
			DataFormatter df = new DataFormatter();
			data[i][j] = df.formatCellValue(sheet1.getRow(i).getCell(j));
	
				System.out.println(" ");
				
				
			}}
		
		wb.close();
		fis.close();
		
		for(String[] dataArr : data) {
			System.out.println( java.util.Arrays.toString(dataArr));
		
		}
					
		
	Thread.sleep(10000);
	
		
		List<WebElement> list = driver.findElements(employee);
		System.out.println("hello");
		System.out.println(list.size());
		for(WebElement lsElement : list)
		
		{
			// String  remove= "Repair & maintenance";
			 name = lsElement.getText().replaceAll("Repair & maintenance.*", "").trim();
			System.out.println("Application Name="+name);
			
			 
			for(int i=1;i<=data.length-1 ;i++) {
				 EmployeeFullName =( data[i][0].toString()+" "+data[i][1].toString()).trim();
				 System.out.println("Excel="+EmployeeFullName);
				
		//	softAssert.assertEquals(name,(data[i][0]+" "+data[i][1]).concat(" Repair & maintenance"),"Record matched");
		//		Assert.assertEquals(name,EmployeeFullName.toString());
				
				 		
				 		//	System.out.println((name.equalsIgnoreCase(EmployeeFullName)));
							//System.out.println("Name Matched  "+name+ " "+ EmployeeFullName);
				 			if(name.equalsIgnoreCase(EmployeeFullName)) {
				 				System.out.println("Name Matched  "+name+ "--"+ EmployeeFullName);
				 					break;
				 			}
				 			else
				 			{
				 				System.out.println("Not Matched");
				 			}
						
						
						 }
				//	l1.add(EmployeeFullName);
			
								
					
			    //	System.out.println("Record found");
			    //	Assert.assertEquals(name,EmployeeFullName.toString());
			    	
		
			}
		
		
		

		//		Assert.assertEquals(name.split("Repair & maintenance"),(data[i][0].toString()+" "+data[i][1].toString())," Record matched");
			
		

		
	return new VerfiyEmployeeRecordPage(driver);

	
	}
	

}

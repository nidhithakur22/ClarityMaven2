package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.github.javafaker.Faker;

import util.Log;

public class UploadOQrecordsPage extends BasePage {

	public UploadOQrecordsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	 /**
	    * Variables
	    */
	int waittime			=25000;
	JavascriptExecutor js 	=(JavascriptExecutor) driver;
	Actions a 			  	= new Actions(driver);
	Faker faker				= new Faker();
	String sourcename		= faker.lorem().characters(4);;
	
	public String createxpath(String id) {
		System.out.println("Create a Xpath using String concatenation  ");
		String S1 =  "//*[@id='";
		String S2="']";
		String s3 = S1+id+S2;
		System.out.println(s3);
	return s3;
	
}

	String tasklistfile 	="C:\\Users\\Asus\\Desktop\\Clarity Videos\\Clarity_Assurance\\EWN OQ files\\WorldEnergyNet_1\\tasklist.xlsx";
	String workstreamfile	="C:\\Users\\Asus\\Desktop\\Clarity Videos\\Clarity_Assurance\\EWN OQ files\\EWN OQ files\\EWNworkstream.xlsx";
	String employeefile		="C:\\Users\\Asus\\Desktop\\Clarity Videos\\Clarity_Assurance\\EWN OQ files\\EWN OQ files\\EWNoqemployeeReport.xlsx";
	String str				= createxpath(sourcename);
	
	/**
     * Web Elements
     */
	
		
	By uploadOQbutton		=By.xpath("//*[@id=\"id_workforce_uploadOQRecords\"]/button");
	By tasklist 			=By.id("taskTab");
	By source1				=By.className("left");
	By selectsource			=By.xpath("//*[@id=\"nav-tabtracker\"]/div/div[1]/div[3]");
	By newsource			=By.xpath("//*[@id=\"nav-tabtracker\"]/div/div[1]/div[4]/input");
	By uploadfile			=By.xpath("//*[@id=\"fileInput\"]"); 
	By importfile			=By.xpath("//*[@id=\"import-qq-data\"]/div/form/div/div[3]/button[2]");
	By workstream 			=By.xpath("//*[@id=\"nav-tab\"]/a[4]");
	By source				=By.xpath(str);
	By employeematrix		=By.xpath("//*[@id=\"nav-tab\"]/a[2]");
	By selectsourcestr		=By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-report/ion-content/ion-router-outlet/app-workforce/div[3]/div/form/div/div[6]/div[2]/div[1]/div/div[1]/div[7]");
//	By selectsourcestr2 	= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-report/ion-content/ion-router-outlet/app-workforce/div[3]/div/form/div/div[2]/div[2]/div[1]/div/div[1]/div[2]");
	
    public UploadOQrecordsPage goToUploadOQRecords() {
        Log.info("Navigating to OQUpload Files");
        
        try {
            wait.until(ExpectedConditions.elementToBeClickable(uploadOQbutton)).click();
            System.out.println("OQUpload Data button is clickable");
          }
     catch(TimeoutException e) {	
            System.out.println("OQUpload Data button isn't clickable");
         }
    
        return new UploadOQrecordsPage(driver);

    }
    
    
    public UploadOQrecordsPage addOQFiles() throws InterruptedException {
   
    		Thread.sleep(waittime);
    		click(selectsource);
    		writeText(newsource,sourcename);
    		Thread.sleep(waittime);
    		Thread.sleep(waittime);
    		try {
    		driver.findElement(By.xpath("//*[@id=\"fileInput\"]")).sendKeys(tasklistfile);}
    		catch(Exception e) {
    			System.out.println("Task File is missing. ");
    		}
    
    		Thread.sleep(waittime);
    		
    		click(importfile);
    		Thread.sleep(waittime);
    		String url = driver.getCurrentUrl();
    		driver.navigate().refresh();
    		goToUploadOQRecords();
    		Thread.sleep(waittime);
    		click(workstream);
    		Thread.sleep(waittime);
    		Thread.sleep(waittime);
    		driver.findElement(source).click();
    		Thread.sleep(waittime);
    		Thread.sleep(waittime);
    		try {
    		driver.findElement(By.xpath("//*[@id=\"fileInput\"]")).sendKeys(workstreamfile);}
    		catch(Exception e) {
    			System.out.println("Workstream file is missing");
    		}
    		Thread.sleep(waittime);

    		click(importfile);
    		Thread.sleep(waittime);
    		driver.navigate().refresh();
    		goToUploadOQRecords();
    		Thread.sleep(waittime);
    		click (employeematrix);
    		Thread.sleep(waittime);
    		Thread.sleep(waittime);
    		driver.findElement(source).click();
    		Thread.sleep(waittime);
    		Thread.sleep(waittime);
    		try {
    		driver.findElement(By.xpath("//*[@id=\"fileInput\"]")).sendKeys(employeefile); }
    		catch(Exception e) {
    			System.out.println("Employee Matrix file is missing");
    		}
    		Thread.sleep(waittime);
    		click(importfile);
    		Thread.sleep(waittime);
    		Thread.sleep(waittime);
    		driver.navigate().refresh();
    		Thread.sleep(30000);
    		
		return new UploadOQrecordsPage(driver);
    }}
package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class EditPipelinePage extends BasePage{

	public EditPipelinePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	Actions a = new Actions(driver);
	int waittime =5000;

	 /**
	    * Web Elements
	    */
	   By pipeline			=By.xpath("//*[@id=\"id_assets-list_piplines\"]");
	   By searchpipeline	=By.xpath("//*[@id=\"searchField\"]/input");
	   By readarrow			=By.xpath("//*[@id=\"arrowFor0\"]");
	   By pipelinelist0		=By.xpath("//*[@id=\"pipelineSystemValue0\"]");
	   	
	   
		public  void searchPipeline(String pipelineName) throws InterruptedException {
		// TODO Auto-generated method stub
		   Log.info("Search Pipeline with details");
		   writeText(searchpipeline, pipelineName);
		   Thread.sleep(2000);
		   a.sendKeys(Keys.ENTER).build().perform();
		   click(readarrow);
		   String pname0=readText(pipelinelist0);
		   System.out.println(pname0);
		   assertEquals(readText(pipelinelist0), pipelineName);
		   	  
	}
		   /* Web Elements Of Edit a pipeline 
		    * 
		    */
		
		By pipelineTypeValue			=By.xpath("//*[@id=\"pipelineTypeValue\"]");	
		By Producttype					=By.xpath("/html/body/ion-popover/ion-select-popover/ion-list/ion-radio-group/ion-item[2]");
		By comodityType					=By.xpath("//*[@id=\"comodityType\"]");
		By crudeoil						=By.xpath("/html/body/ion-popover/ion-select-popover/ion-list/ion-radio-group/ion-item[1]");
		By editButton					=By.name("create");
		By outerDiameterValue			=By.xpath("//*[@id=\"outerDiameterValue\"]/input");
		By wallthickness				=By.xpath("//*[@id=\"wallThicknessValue\"]/input");
		By length						=By.xpath("//*[@id=\"lengthValue\"]/input");
		By jurdisdictionalStatus		=By.xpath("//*[@id=\"jurdisdictionalStatus\"]");
		By transmission					=By.xpath("/html/body/ion-popover/ion-select-popover/ion-list/ion-radio-group/ion-item[1]");
		By typeOfSafetyValue			=By.xpath("//*[@id=\"typeOfSafetyValue\"]");
		By pressureReliefvalve			=By.xpath("/html/body/ion-alert/div[2]/div[3]/button[2]");
		By pressureTransmitters			=By.xpath("/html/body/ion-alert/div[2]/div[3]/button[3]");
		By typeOfSafetyValueokButton	=By.xpath("/html/body/ion-alert/div[2]/div[4]/button[2]");
		By inletsValue					=By.xpath("//*[@id=\"inletsValue\"]/input");
		By outletsValue					=By.xpath("//*[@id=\"outletsValue\"]/input");  
		By nextButton					=By.xpath("//*[@id=\"nextBtn\"]"); 
		By latitudeBeginValue 			=By.xpath("//*[@id=\"latitudeBeginValue\"]/input");
		By longitudeBeginValue 			=By.xpath("//*[@id=\"longitudeBeginValue\"]/input");
		By latitudeEndValue 			=By.xpath("//*[@id=\"latitudeEndValue\"]/input"); 
		By longitudeEndValue 			=By.xpath("//*[@id=\"longitudeEndValue\"]/input");	
		By maopValue					=By.xpath("//*[@id=\"maopValue\"]/input");
		By reliefValueCapacityValue		=By.xpath("//*[@id=\"reliefValueCapacityValue\"]/input");
		By operatingPressureValue		=By.xpath("//*[@id=\"operatingPressureValue\"]/input");
		By pressureTestPressureValue	=By.xpath("//*[@id=\"pressureTestPressureValue\"]/input");
		By lastPressureTestDateValue	=By.xpath("//*[@id=\"lastPressureTestDateValue\"]");
		By saveButton					=By.xpath("//*[@id=\"id_add-pipeline_save\"]");
		By submitButton					=By.xpath("//*[@id=\"id_add-pipeline_submit\"]");
		 
		   
	  
	
				   
	public void editpipeline() throws InterruptedException {
			// TODO Auto-generated method stub
			System.out.println("Click to the edit button");
			Thread.sleep(10000);
			click(editButton);
			Thread.sleep(waittime);
			click(pipelineTypeValue);
			Thread.sleep(waittime);
			Thread.sleep(10000);
			click(Producttype);
			Thread.sleep(waittime);	
			click(comodityType);
			Thread.sleep(waittime);	
			click(crudeoil);
			Thread.sleep(waittime);	
			clear(outerDiameterValue);
			writeText(outerDiameterValue,"0.07");
			Thread.sleep(waittime);
			writeText(wallthickness, "39");
			Thread.sleep(5000);
			WebElement scroll = driver.findElement(By.xpath("//*[@id=\"lengthValue\"]/input"));
			System.out.println("label is detected");
 		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
 		    System.out.println("Scroll is executed successfully");
			clear(length);
			writeText(length, "200");
			Thread.sleep(waittime);
			click(jurdisdictionalStatus);
			Thread.sleep(waittime);
			Thread.sleep(5000);
			click(transmission);
			Thread.sleep(waittime);
			click(typeOfSafetyValue);
			Thread.sleep(waittime);
			click(pressureReliefvalve);
			Thread.sleep(waittime);
			click(pressureTransmitters);
			Thread.sleep(waittime);
			click(typeOfSafetyValueokButton);
			Thread.sleep(waittime);
			clear(inletsValue);
			Thread.sleep(2000);
			clear(outletsValue);
			Thread.sleep(2000);
			writeText(inletsValue, "28");
			Thread.sleep(2000);
			writeText(outletsValue, "56");
			Thread.sleep(waittime);
			click(nextButton);
			Thread.sleep(waittime);
			clear(latitudeBeginValue);
			writeText(latitudeBeginValue,"23");
			Thread.sleep(waittime);
			clear(longitudeBeginValue);
			writeText(longitudeBeginValue,"66");
			Thread.sleep(waittime);
			clear(latitudeEndValue);
			writeText(latitudeEndValue,"77");
			Thread.sleep(waittime);
			clear(longitudeEndValue);
			writeText(longitudeEndValue,"67");
			Thread.sleep(waittime);
			click(nextButton);
			Thread.sleep(waittime);
			clear(maopValue);
			writeText(maopValue,"45");
			Thread.sleep(waittime);
			clear(reliefValueCapacityValue);
			writeText(reliefValueCapacityValue,"90");
			Thread.sleep(waittime);
			clear(operatingPressureValue);
			writeText(operatingPressureValue,"23");
			Thread.sleep(waittime);
			clear(pressureTestPressureValue);
			writeText(pressureTestPressureValue,"47");
			Thread.sleep(waittime);
			click(nextButton);
			Thread.sleep(waittime);
			click(nextButton);  
            Thread.sleep(waittime);
            click(saveButton);
            Thread.sleep(waittime);
            click(submitButton);    
		}
		
	
}

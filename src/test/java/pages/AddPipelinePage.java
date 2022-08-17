package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.github.javafaker.Faker;

//import com.github.javafaker.Faker;

import util.Log;

public class AddPipelinePage extends BasePage{

	public AddPipelinePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 /**
	    * Variables
	    */
	
	int waittime=3000;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions a 			  = new Actions(driver);
	
	 /**
	    * Web Elements
	    */
	   By pipelineSystem					=By.xpath("//*[@id=\"pipelineSystem\"]/input");
	   By pipelineTypeValue					=By.xpath("//*[@id=\"pipelineTypeValue\"]");	
	  
	 
	   By productTypeGas					=By.xpath("/html/body/ion-popover/ion-select-popover/ion-list/ion-radio-group/ion-item[1]");
	   By comodityType						=By.xpath("//*[@id=\"comodityType\"]");
	   By naturalGas						=By.xpath("/html/body/ion-popover/ion-select-popover/ion-list/ion-radio-group/ion-item[1]");
	   	    
	   By pipelineStatusValue				=By.xpath("//*[@id=\"pipelineStatusValue\"]");
	   By activeStatus						=By.xpath("//*[@id=\"ion-overlay-3\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	 
	   By outerDiameterValue				=By.xpath("//*[@id=\"outerDiameterValue\"]/input");
	   By wallThicknessValue				=By.xpath("//*[@id=\"wallThicknessValue\"]/input");
	   
	   By meterialType						=By.xpath("//*[@id=\"meterialType\"]");
	   By steel								=By.xpath("//*[@id=\"ion-overlay-4\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	   By lengthValue						=By.xpath("//*[@id=\"lengthValue\"]/input");
	   By jurdisdictionalStatus				=By.xpath("//*[@id=\"jurdisdictionalStatus\"]");
	   By transmission						=By.xpath("//*[@id=\"ion-overlay-5\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	   By typeOfSafetyValue					=By.xpath("//*[@id=\"typeOfSafetyValue\"]");
	   By pump								=By.xpath("//*[@id=\"alert-input-6-0\"]");
	   By typeOfSafetyValueokButton			=By.xpath("//*[@id=\"ion-overlay-6\"]/div[2]/div[4]/button[2]");
	   By cathodicProtectionValue			=By.xpath("//*[@id=\"cathodicProtectionValue\"]");
	   By anode								=By.xpath("//*[@id=\"alert-input-7-0\"]");
	   By cathodicProtectionValueokButton	=By.xpath("//*[@id=\"ion-overlay-7\"]/div[2]/div[4]/button[2]");
	 
	   
	   By inletsValue					=By.xpath("//*[@id=\"inletsValue\"]/input");
	   By outletsValue					=By.xpath("//*[@id=\"outletsValue\"]/input");
	   By nextButton					=By.xpath("//*[@id=\"nextBtn\"]");
	   
	   By highClassLocationValue		=By.xpath("//*[@id=\"highClassLocationValue\"]");
	   By class1						=By.xpath("//*[@id=\"ion-overlay-8\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	   By latitudeBeginValue			=By.xpath("//*[@id=\"latitudeBeginValue\"]/input");
	   By longitudeBeginValue			=By.xpath("//*[@id=\"longitudeBeginValue\"]/input");
	   By latitudeEndValue				=By.xpath("//*[@id=\"latitudeEndValue\"]/input");
	   By longitudeEndValue				=By.xpath("//*[@id=\"longitudeEndValue\"]/input");
	   	
	   By maopValue						=By.xpath("//*[@id=\"maopValue\"]/input");
	   By reliefValueCapacityValue		=By.xpath("//*[@id=\"reliefValueCapacityValue\"]/input");
	   By operatingPressureValue		=By.xpath("//*[@id=\"operatingPressureValue\"]/input");
	   By pressureTestPressureValue		=By.xpath("//*[@id=\"pressureTestPressureValue\"]/input");
	   By lastPressureTestDateValue		=By.xpath("//*[@id=\"lastPressureTestDateValue\"]");
	   
	   By stateValue0					=By.xpath("//*[@id=\"stateValue0\"]");
	   By state							=By.xpath("//*[@id=\"ion-overlay-9\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	   By stateMilegeValue0				=By.xpath("//*[@id=\"stateMilegeValue0\"]/input");
	   By countyValue00					=By.xpath("//*[@id=\"countyValue00\"]");
	   By county						=By.xpath("//*[@id=\"ion-overlay-10\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	   By countyMileageValue00			=By.xpath("//*[@id=\"countyMileageValue00\"]/input");
	   By stateoneValue0				=By.xpath("//*[@id=\"stateoneValue0\"]");
	   By stateone						=By.xpath("//*[@id=\"ion-overlay-11\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	   By statetwoValue0				=By.xpath("//*[@id=\"statetwoValue0\"]");
	   By statetwo						=By.xpath("//*[@id=\"ion-overlay-12\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]/ion-radio");
	   By interstateMileageValue0		=By.xpath("//*[@id=\"interstateMileageValue0\"]/input");
	   
	   By mainPersonInput				=By.xpath("//*[@id=\"mainPersonInput\"]/input");
	   By mainContactInput				=By.xpath("//*[@id=\"mainContactInput\"]/input");
	   By primaryOandMPersonInput		=By.xpath("//*[@id=\"primaryOandMPersonInput\"]/input");
	   By primaryOandMContactInput		=By.xpath("//*[@id=\"primaryOandMContactInput\"]/input");
	   By primaryEmergencyPersonInput	=By.xpath("//*[@id=\"primaryEmergencyPersonInput\"]/input");
	   By primaryEmergencyContactInput	=By.xpath("//*[@id=\"primaryEmergencyContactInput\"]/input");
	   By twHoursEmrgncyContactInput	=By.xpath("//*[@id=\"twHoursEmrgncyContactInput\"]/input");
	   By primaryLinePersonInput		=By.xpath("//*[@id=\"primaryLinePersonInput\"]/input");
	   By primaryLineLocInput			=By.xpath("//*[@id=\"primaryLineLocInput\"]/input");
	   By cRoomContactInput				=By.xpath("//*[@id=\"cRoomContactInput\"]/input");
	  
	   By saveButton					=By.xpath("//*[@id=\"id_add-pipeline_save\"]");
	   By submitButton					=By.xpath("//*[@id=\"id_add-pipeline_submit\"]");
	 
	   
  
	   
	   /**
	    * Page Methods
	 * @throws InterruptedException 
	    */
	 	   
	   //Enter the pipeline details and create a pipeline
	   public PipelinePage createPipeline(String pipelineName) throws InterruptedException {
	       Log.info("Create Pipeline with details");
	       
	       try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(pipelineSystem));
	            System.out.println("pipelineSystem is located");
	            writeText(pipelineSystem, pipelineName);
	          }
	       catch(TimeoutException e) {
	            System.out.println("pipelineSystem isn't clickable");
	         }
	          
	            Thread.sleep(waittime);
	            //wait.until(ExpectedConditions.elementToBeClickable(pipelineTypeValue)).click();
	            click(pipelineTypeValue);
	           
	            Thread.sleep(waittime);
	          
	            click(productTypeGas);
	            
	            Thread.sleep(waittime);
		          
	            click(comodityType);
	            
	            Thread.sleep(waittime);
	            click(naturalGas);
	            
	            Thread.sleep(waittime);
	            click(pipelineStatusValue);
	            
	            Thread.sleep(waittime);
	            click(activeStatus);
	            
	            writeText(outerDiameterValue, "10");
	            writeText(wallThicknessValue, "10");
	            Thread.sleep(waittime);
	            click(meterialType);
	            Thread.sleep(waittime);
	            click(steel);
	            Thread.sleep(waittime);
	            //click(gradeValue);
	            //Thread.sleep(waittime);
	            //click(grade);
	            WebElement scroll = driver.findElement(By.xpath("//*[@id=\"lengthValue\"]/input"));
	            System.out.println("label is detected");
	            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
	            System.out.println("Scroll is executed successfully");
	            Thread.sleep(waittime);
	            writeText(lengthValue, "10");
	            Thread.sleep(waittime);
	            click(jurdisdictionalStatus);
	            Thread.sleep(waittime);
	            click(transmission);
	            Thread.sleep(waittime);
	            click(typeOfSafetyValue);
	            Thread.sleep(waittime);
	            click(pump);
	            click(typeOfSafetyValueokButton);
	            
	           // js.executeScript("window.scrollTo(0,document.body.scrollHeight","");
	            //a.sendKeys(Keys.PAGE_DOWN).build().perform();
				/*
				 * WebElement scroll =
				 * driver.findElement(By.xpath("//*[@id=\"cathodicProtectionValue\"]"));
				 * System.out.println("lable is detected");
				 * ((JavascriptExecutor)driver).executeScript(
				 * "arguments[0].scrollIntoView(true);", scroll);
				 * //scroll.sendKeys(Keys.PAGE_DOWN);
				 * System.out.println("scroll is executed successfully2");
				 */
	            
	            Thread.sleep(waittime);
	           
	            click(cathodicProtectionValue);
	            
	            System.out.println("Cathodic Protection is clicked");
	            Thread.sleep(waittime);
	            
	            
	            click(anode);
	            System.out.println("Anode is Selected");
	            Thread.sleep(waittime);
	            
	            click(cathodicProtectionValueokButton);
	            System.out.println("cathodicProtectionValueokButton is clicked");
	            Thread.sleep(waittime);
	            writeText(inletsValue, "10");
	            writeText(outletsValue,"10");
	           
	            click(nextButton);
	            
	            Thread.sleep(waittime);
	            click(highClassLocationValue);
	            Thread.sleep(waittime);
	            click(class1);
	            writeText(latitudeBeginValue,"10");
	            writeText(longitudeBeginValue,"10");
	            writeText(latitudeEndValue,"10");
	            writeText(longitudeEndValue,"10");
	            
	            click(nextButton);
	            Thread.sleep(waittime);
	            
	            writeText(maopValue,"10");
	            writeText(reliefValueCapacityValue,"10");
	            writeText(operatingPressureValue,"10");
	            writeText(pressureTestPressureValue,"10");
	            Thread.sleep(waittime);
	            writeText(lastPressureTestDateValue,"10072022");
	            //click(lastPressureTestDateValue);
	            
	            click(nextButton);
	            Thread.sleep(waittime);
	            click(nextButton);
	            Thread.sleep(waittime);
	            
	            click(stateValue0);
	            Thread.sleep(waittime);
	            click(state);
	            Thread.sleep(waittime);
	            writeText(stateMilegeValue0,"10");
	            Thread.sleep(waittime);
	            click(countyValue00);
	            Thread.sleep(waittime);
	            click(county);
	            Thread.sleep(waittime);
	            writeText(countyMileageValue00,"10");
	            Thread.sleep(waittime);
	            
	            WebElement scroll1 = driver.findElement(By.id("stateoneValue0"));
	 		   System.out.println("label is detected");
	 		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll1);
	 		   System.out.println("Scroll is executed successfully");
	 		  writeText(countyMileageValue00,"10");
	            Thread.sleep(waittime);
	            click(stateoneValue0);
	            
	            Thread.sleep(waittime);
	            click(stateone);
	            
	            Thread.sleep(waittime);
	            click(statetwoValue0);
	            
	            Thread.sleep(waittime);
	            click(statetwo);
	            
	            Thread.sleep(waittime);
	            writeText(interstateMileageValue0,"10");
	            
	            click(nextButton);
	            
	            writeText(mainPersonInput,"Test");
	            writeText(mainContactInput,"1234567890");
	            writeText(primaryOandMPersonInput,"Test");
	            writeText(primaryOandMContactInput,"1234567890");
	            writeText(primaryEmergencyPersonInput,"Test");
	            writeText(primaryEmergencyContactInput,"1234567890");
	            writeText(twHoursEmrgncyContactInput,"1234567890");
	            writeText(primaryLinePersonInput,"Test");
	            writeText(primaryLineLocInput,"1234567890");
	            writeText(cRoomContactInput,"1234567890");
	            
	            Thread.sleep(waittime);
	            click(saveButton);
	            Thread.sleep(waittime);
	            click(submitButton);          
	           	            
	 	       return new PipelinePage(driver);
	    
	   }
	   
	 
	
	
}

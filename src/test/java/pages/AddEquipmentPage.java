package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.github.javafaker.Faker;

import util.Log;

public class AddEquipmentPage extends BasePage{

	public AddEquipmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	int waittime = 3000;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions a = new Actions(driver);
	
	/**
	    * Web Elements
	    */	
	By eName 					= By.xpath("//*[@id=\"eqname\"]/input");
	By equipmentstatusValue		= By.xpath("//*[@id=\"eqstatusValue\"]");
	By active 					= By.xpath("//*[@id=\"ion-overlay-1\"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	By equipmenttypeValue		= By.xpath("//*[@id=\"eqtypeValue\"]");
	By gasleakdetector			= By.xpath("/html/body/ion-popover/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio\r\n");
	By eqpartNumberValue		= By.xpath("//*[@id=\"eqpartNumberValue\"]/input");
	By eqmfgNumberValue			= By.xpath("//*[@id=\"eqmfgNumberValue\"]/input");
	By eqserialNumberValue		= By.xpath("//*[@id=\"eqserialNumberValue\"]/input");
	By eqinstanceValue			= By.xpath("//*[@id=\"eqinstanceValue\"]/input");
	By eqcalibratedDateValue	= By.xpath("//*[@id=\"eqcalibratedDateValue\"]");
	By eqcalibratedDueDateValue	= By.xpath("//*[@id=\"eqcalibratedDueDateValue\"]");
	By eqmfgdateValue			= By.xpath("//*[@id=\"eqmfgdateValue\"]");
	By addFile					= By.id("fileInnerControl");
	By saveButton				= By.xpath("//*[@id=\"id_add-equipment_save\"]");
	By submitButton				= By.xpath("//*[@id=\"id_add-equipment_submit\"]");
	
	
	
	
	// Enter the  details and create a Equipment
	public EquipmentPage createEquipment(String equipmentName) throws InterruptedException {
		   Log.info("Create Equipment with details");
	       
	       try {
	            wait.until(ExpectedConditions.visibilityOfElementLocated(eName));
	            System.out.println("equipmentName is located");
	            writeText(eName, equipmentName);
	          }
	     catch(TimeoutException e) {
	            System.out.println("equipmentName isn't clickable");
	         }
	       
	      		   	
	       Thread.sleep(waittime);
	       click(equipmentstatusValue);
	       
	       Thread.sleep(waittime);
	       click(active);
	       
	       Thread.sleep(waittime);
	       click(equipmenttypeValue);
	       
	       Thread.sleep(waittime);
	       click(gasleakdetector);
	       
	       Thread.sleep(waittime);
	       writeText(eqpartNumberValue, "929");
	       
	       Thread.sleep(waittime);
	       writeText(eqmfgNumberValue, "900");
	            
	       Thread.sleep(waittime);
	       Faker faker3 = new Faker();
           writeText(eqserialNumberValue,faker3.numerify("###"));
           
           Thread.sleep(waittime);
           writeText(eqinstanceValue,"777");
           
           Thread.sleep(waittime);
           writeText(eqcalibratedDateValue,"07072022");
           
           Thread.sleep(waittime);
           writeText(eqcalibratedDueDateValue,"08072022");
           
           Thread.sleep(waittime);
           writeText(eqmfgdateValue,"11052021");
           
           Thread.sleep(5000);
           Thread.sleep(waittime);
          	click(saveButton);
           
           Thread.sleep(5000);
           Thread.sleep(waittime);
           
           click(submitButton);
           
           
	       return new EquipmentPage(driver);
           
	}     
	
}

package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class EquipmentPage extends BasePage{

	public EquipmentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	/**
	 * Variables
	 */
	// variables
	Actions a = new Actions(driver);
	
	/**
	    * Web Elements
	    */
	By addequipment 		= By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-asset-list/ion-row/ion-col[1]/ion-card/div/div[2]/app-searchlist/ion-row/ion-col[2]/ion-button");								
	By searchequipment	 	= By.xpath("//*[@id=\"searchField\"]/input");	
	By readarrow 			= By.xpath(""); 			
	By equipmentlist0 		= By.xpath("//*[@id=\"deviceNameValue0\"]"); 	

	/**
	 * Page Methods
	 */

		// Click on Add Equipment
	public AddEquipmentPage addEquipmentPage() {
		Log.info("Navigating to Add Equipment");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(addequipment)).click();
			System.out.println("Add Equipment Button is clickable");
			} 
		catch (TimeoutException e) {
			System.out.println("Add Equipment Button isn't clickable");
			}

		// click(addequipment);
		return new AddEquipmentPage(driver);
	}

	public EquipmentPage verifyequipment(String equipmentName) throws InterruptedException {
		Log.info("Verify Equipment with details");
		writeText(searchequipment, equipmentName);
		Thread.sleep(20000);
		a.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Enter performed");
		Thread.sleep(20000);
		click(readarrow);
		System.out.println("readarrow clicked");
		Thread.sleep(20000);
		String ename0 = readText(equipmentlist0);
		System.out.println(ename0);
		Thread.sleep(20000);
		assertEquals(readText(equipmentlist0), equipmentName);
		return this;

	}
	
}

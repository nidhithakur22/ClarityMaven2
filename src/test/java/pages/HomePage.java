package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import util.Log;

public class HomePage extends BasePage {
    /**
     * Constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
    /**
    * Variables
    */
   String baseURL = "http://www.n11.com/";
   /**
    * Web Elements
    */
   By signInButtonClass = By.className("btnSignIn");
   By assets			= By.xpath("//*[@id=\"id_sidebar_assets\"]");
   
   /**
    * Page Methods
    */
 //Click on Assets
   public AssetsPage goToAssets() {
       Log.info("Navigating to Assets");
       
       
       try {
           wait.until(ExpectedConditions.elementToBeClickable(assets)).click();
           System.out.println("Asset tab is clickable");
         }
    catch(TimeoutException e) {
           System.out.println("Asset tab isn't clickable");
    }
        
       
       //click(assets);
       return new AssetsPage(driver);
   }
 
   //Click on Operations
   
   
}
   



package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.JSErrorLogs;
import util.Log;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



public class LoginPage extends BasePage {
    /**
     * Constructor
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Web Elements
     */
    By userNameId                = By.name("username");
    By passwordId                = By.name("password");
    By loginButtonId             = By.xpath("/html/body/app-root/app-login/ion-content/div/ion-row/ion-col[1]/div[2]/div/form/a");
    By errorMessageUsernameXpath = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
    By errorMessagePasswordXpath = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");
    By signInButtonClass		 = By.className("btnSignIn");
    
    /**
     * Variables
     */
    String baseURL = "https://service.claritysystemsinc.com/#/login";
    
    
    /**
     * Page Methods
     * @throws InterruptedException 
     */
    
    //Go to Login Page
    public LoginPage openClarityApp() throws InterruptedException {
        Log.info("Opening Clarity Application.");
        driver.get(baseURL);
        Thread.sleep(30000);
        return this;
    }
    
    public LoginPage logintoClarity(String username, String password) throws InterruptedException {
        Log.info("Trying to login the clarity.");
        Thread.sleep(7000);
        writeText(userNameId, username);
        Thread.sleep(7000);
        writeText(passwordId, password);
        Thread.sleep(7000);
        click(loginButtonId);
        return this;
    }
    //Verify Username Condition
    public LoginPage verifyLoginUserName(String expectedText) {
        Log.info("Verifying login username.");
        waitVisibility(errorMessageUsernameXpath);
        assertEquals(readText(errorMessageUsernameXpath), expectedText);
        return this;
    }
    //Verify Password Condition
    public LoginPage verifyLoginPassword(String expectedText) {
        Log.info("Verifying login password.");
        waitVisibility(errorMessagePasswordXpath);
        assertEquals(readText(errorMessagePasswordXpath), expectedText);
        return this;
    }
    //Verify Password Condition
    public LoginPage verifyLogError() {
        Log.info("Verifying javascript login errors.");
        assertTrue(JSErrorLogs.isLoginErrorLog(driver));
        return this;
    }
}
package tests;

import java.lang.reflect.Method;
import static util.ExtentTestManager.startTest;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTests extends BaseTest {
    @Test(priority = 0, description = "Valid Login Scenario with correct username and password.")
    public void validLoginTest(Method method) throws InterruptedException {
        //ExtentReports Description
        startTest(method.getName(), "Valid Login Test");
        loginPage
        	.openClarityApp()
            .logintoClarity("jennifer", "1111");
        
        loginPage.openClarityApp();
        loginPage.logintoClarity("username", "pwd");
        
          //  .verifyLogError();
        Thread.sleep(20000);
    }
   
}
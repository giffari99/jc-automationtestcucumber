package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private  static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();


    public LoginTest(){   // konstraktor
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_sauceDemo_login_page(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"I am on the SauceDemo login page");

    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password(){
       loginPage.loginUser("Admin","admin123");
        extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("I click the login button")
    public void i_click_the_login_button(){
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"I click the login button");
    }

    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_dashboard_page(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS,"I should be redirected to the dashboard page");
    }

    @Given("I am Logout")
    public void i_am_logout(){
        loginPage.logout();
        extentTest.log(LogStatus.PASS,"I am Logout");
    }


    @When("I enter a invalid username and password")
    public void i_enter_a_invalid_username_and_password(){
        loginPage.loginUser("invalid","invalid");
        extentTest.log(LogStatus.PASS,"I enter a invalid username and password");
    }

    @Then("I see massage Invalid credentials")
    public void i_see_massage_invalid_credentials(){
        Assert.assertEquals(loginPage.getTxtInvalid(),"Invalid credentials");
        extentTest.log(LogStatus.PASS,"I see massage Invalid credentials");
    }



}





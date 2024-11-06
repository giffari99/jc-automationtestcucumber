package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RecruitmenTest {
    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static RecruitmentPage recruitmentPage = new RecruitmentPage();


    public RecruitmenTest(){   // konstraktor
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("Admin logged in")
    public void admin_logged_in(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.loginUser("Admin","admin123");
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Admin logged in");
    }

    @And("Admin go to menu recruitmen")
    public void admin_go_to_menu_recruitmen(){
        recruitmentPage.setMenuRecruitment();
        extentTest.log(LogStatus.PASS,"Admin go to menu recruitmen");
    }

    @And("Admin click button action")
    public void admin_click_button_action(){
        Utils.delay(2);
        recruitmentPage.setBtnAction();
    }

    @And("Admin go to menu recruitmen2")
    public void admin_go_to_menu_recruitmen2(){
        recruitmentPage.setMenuRecruitment();
        extentTest.log(LogStatus.PASS,"Admin go to menu recruitmen");
    }

    @When("Admin click button add")
    public void admin_click_button_add(){
    recruitmentPage.btnAdd();
    extentTest.log(LogStatus.PASS,"Admin click button add");
    }

    @And("Admin enter firstname")
    public void admin_enter_firstname(){
    recruitmentPage.setInputFirstName("Juara");
        extentTest.log(LogStatus.PASS,"Admin enter firstname");

    }
    @And("Admin enter lastname")
    public void admin_enter_lastname(){
    recruitmentPage.setInputLastName("Coding");
        extentTest.log(LogStatus.PASS,"Admin enter lastname");

    }
    @And("Admin enter email")
    public void admin_enter_email(){
    recruitmentPage.setInputEmail("juaracoding@gmail.com");
        extentTest.log(LogStatus.PASS,"Admin enter email");
    }
    @And("Admin upload file resume")
    public void admin_upload_file_resume(){
    recruitmentPage.setResume("C:\\Users\\giffari\\Documents\\RESUME.Docx");
        extentTest.log(LogStatus.PASS,"Admin upload file resume");
    }
    @And("Admin click button save")
    public void admin_click_button_save(){
        recruitmentPage.btnSave();
        extentTest.log(LogStatus.PASS,"Admin click button save");
    }
    @Then("Admin redirect to page Application Stage")
    public void admin_redirect_to_page_application_stage(){
        Utils.delay(5);
        Assert.assertEquals(recruitmentPage.getTxtApplicationStage(),"Application Stage");
        extentTest.log(LogStatus.PASS,"Admin redirect to page Application Stage");
    }














}

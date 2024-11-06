package com.juaracoding;

import com.juaracoding.pages.RecruitmenAdminPage;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RecruitmentAdminTest {

         public static WebDriver driver;

        public static ExtentTest extentTest;

        private static RecruitmenAdminPage recruitmenAdminPage = new RecruitmenAdminPage();

    public RecruitmentAdminTest(){   // konstraktor
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

        @Given("Admin click menu Admin")
        public void admin_click_menu_admin(){
            recruitmenAdminPage.setMenuAdmin();
            extentTest.log(LogStatus.PASS,"Admin click menu Admin");
        }

        @When("Admin click select role")
        public void admin_click_select_role(){
            recruitmenAdminPage.setBtnSelect();
            Utils.delay(3);
            extentTest.log(LogStatus.PASS,"Admin click select role");
        }

        @Then("Admin click button search")
        public void admin_click_button_search(){
        recruitmenAdminPage.setBtnSearch();
        }



}

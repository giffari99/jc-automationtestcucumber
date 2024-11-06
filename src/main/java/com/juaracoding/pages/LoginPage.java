package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


     WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    private WebElement TxtDashboard;

    @FindBy(xpath = "//p[contains(@class, 'oxd-alert-content-text')]")
    private WebElement txtInvalid;

    @FindBy(xpath = "//img[@alt='company-branding']")
    private WebElement imgCompanyBranding;


    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    private  WebElement userDropdown;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private  WebElement btnLogout;



    public void loginUser(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void setBtnLogin(){
        btnLogin.click();
    }

    public String getTxtDashboard(){
        return TxtDashboard.getText();
    }

    public void logout(){
        userDropdown.click();
        btnLogout.click();

    }

    public String getTxtInvalid(){
        return txtInvalid.getText();
    }

    public boolean getImtCompanyBranding(){
        return imgCompanyBranding.isDisplayed();
    }

}

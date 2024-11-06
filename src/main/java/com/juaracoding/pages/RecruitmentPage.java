package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")
    private WebElement menuRecruitment;

    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    private WebElement btnAdd;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@placeholder=\"Type here\"][1]")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@placeholder=\"Type here\"][1]")
    private WebElement inputSelectEmaill;

    @FindBy(xpath = "//input[@placeholder=\"Type here\"][1]")
    private WebElement inputDeleteEmaill;

    @FindBy(xpath = "//input[@placeholder=\"Type here\"][1]")
    private WebElement inputEmailll;

    @FindBy(xpath = "//input[@type=\"file\"]")
    private WebElement resume;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSavee;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    private WebElement txtapplicationstage;

    @FindBy(xpath = "(//i[@class=\"oxd-icon bi-eye-fill\"][1])")
    private WebElement btnAction;


    public void setMenuRecruitment(){
       List<WebElement> listMenu = driver.findElements(By.xpath("//li[@class='oxd-main-menu-item-wrapper']"));
        System.out.println(listMenu.size());

        for(WebElement listMen : listMenu){
            System.out.println(listMen.getText());
        }
        menuRecruitment.click();
    }

    public void setBtnAction(){
        btnAction.click();
    }

    public void btnAdd(){

        btnAdd.click();
    }

    public void setInputFirstName(String firstName){
        this.inputFirstName.sendKeys(firstName);
    }
    public void setInputLastName(String lastname){
        this.inputLastName.sendKeys(lastname);
    }
    public void setInputEmail(String email){
        this.inputEmail.sendKeys(email);
    }
    public void setResume(String resume){
        this.resume.sendKeys(resume);
    }

    public void btnSave(){
        btnSave.click();
    }


    public String getTxtApplicationStage(){
        Utils.delay(5);
        return txtapplicationstage.getText();
    }

    // for validasi add candidate






}

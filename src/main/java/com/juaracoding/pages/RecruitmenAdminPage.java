package com.juaracoding.pages;


import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmenAdminPage {

    private WebDriver driver;

    public RecruitmenAdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")
    private WebElement menuAdmin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    private WebElement btnAdd;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    private WebElement btnSelect;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    private WebElement slcAdmin;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearch;


    public void setMenuAdmin(){
        menuAdmin.click();
    }

    public void setBtnSelect(){
        btnSelect.click();
        btnSelect.sendKeys(Keys.ARROW_DOWN);
        btnSelect.sendKeys(Keys.ENTER);
    }

//    public void btnAdd(){
//        slcAdmin.click();
//    }
//
    public void setBtnSearch(){
        btnSearch.click();
    }





}

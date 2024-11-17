package com.juaracoding.pages.admin;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 11/12/2024 9:49 PM
@Last Modified 11/12/2024 9:49 PM
Version 1.0
*/

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientUplinerPage {
    private WebDriver driver;


    public ClientUplinerPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='MuiBox-root css-k008qs']//div[4]//div[1]//div[1]//div[2]")
    private WebElement managementDropdown;

    @FindBy(xpath = "//p[normalize-space()='Client Upliner']")
    private WebElement varClientUpliner;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[1]/form/div/button[1]")
    private WebElement btnFilter;

//    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[1]/div/div[2]/div/div")
//    private WebElement filter;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[1]/div/div[2]/div/div/input")
    private WebElement txtInputFilter;

//    @FindBy(xpath = "//*[@id=\"mui-component-select-job_departement_id\"]")

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[1]/div/div[2]/div/div")
    private WebElement clickFilter;


    @FindBy(xpath = "//input[@id='search']")
    private WebElement txtSearch;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/div/button")
    private WebElement btnDaftarUpliner;

    @FindBy(xpath = "//h6[normalize-space()='kari']")
    private WebElement valSeachUpliner;

    @FindBy(xpath = "//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textWarning MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-root MuiButton-text MuiButton-textWarning MuiButton-sizeSmall MuiButton-textSizeSmall btn-reset css-r4u8un\"]")
    private WebElement btnReset;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
    private WebElement btnTerapkan;

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement valRow;


    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement btnTambahkan;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement fieldNamaKaryawan;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@id='free-solo-with-text-demo']")
    private WebElement DropdownUnit;

    @FindBy(xpath = "//li[@id='free-solo-with-text-demo-option-3']")
    private WebElement varUnit;


    //input[@id='free-solo-with-text-demo']
    //input[@id='free-solo-with-text-demo']



    public void clickManagementDropdown(){
        managementDropdown.click();
    }

    public void clickVarClientUpliner(){
        varClientUpliner.click();
    }

    public void clickBtnFilter(){
        btnFilter.click();
    }

    @FindBy(xpath = "//*[@id=\"mui-30\"]/li[2]")
    private WebElement varUnit1;
    public void clickFieldFilter(){
        clickFilter.click();
        varUnit1.click();
    }


    public void clickTerapkan(){
        btnTerapkan.click();
    }

    @FindBy(xpath = "//h6[normalize-space()='AFI Desk Collection']")
    private WebElement valFilterUnit;
    public String getTxtValFilterUnit(){
        return valFilterUnit.getText();
    }

    public void getSearch(String search){
        this.txtSearch.sendKeys(search);
    }

    public void clickBtnSearch(){
        btnSubmit.click();
    }

    public String getValueSearch(){
        return valSeachUpliner.getText();
    }

    public void clickBtnReset(){
        btnReset.click();
    }


    public String getValRow(){
        return valRow.getText();
    }

    public void clickBtnTambahkan(){
        btnTambahkan.click();
    }

    public void getNamaKaryawan(String nama_karyawan){
        this.fieldNamaKaryawan.sendKeys(nama_karyawan);
    }
    public void clearNamaKaryawan(){
        fieldNamaKaryawan.clear();
    }
    public String valNullNamaKaryawan(){
        return fieldNamaKaryawan.getAttribute("required");
    }

    public void getEmail(String email){
        this.fieldEmail.sendKeys(email);
    }
    public void clearEmail(){
        fieldEmail.clear();
    }
    public String valNullEmail(){
        return fieldEmail.getAttribute("required");
    }

    public void getPassword(String password){
        this.fieldPassword.sendKeys(password);
    }
    public void clearPassword(){
        fieldPassword.clear();
    }
    public String valNullPassword(){
        return fieldPassword.getAttribute("required");
    }

    public void selectUnit(String unit){
        DropdownUnit.click();
        DropdownUnit.sendKeys(unit);
        Utils.delay(2);
        DropdownUnit.sendKeys(Keys.DOWN);
        Utils.delay(2);
        DropdownUnit.sendKeys(Keys.ENTER);

    }


    public void clickBtnDaftar(){
        btnDaftarUpliner.click();
    }

    public WebElement getBtnDaftarUpliner(){
        return btnDaftarUpliner;
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div")
    private WebElement valNotifSukses;
    public String getValNotifSukses(){
        return valNotifSukses.getText();
    }

    @FindBy(xpath = "//div[@id='role_id']")
    private WebElement dropdownTipeUpliner;
    public void getDropdownTipeUplinerV2(){
        dropdownTipeUpliner.click();
        dropdownTipeUpliner.sendKeys(Keys.ENTER);
    }
    public void getDropdownTipeUplinerV3(){
        dropdownTipeUpliner.click();
        dropdownTipeUpliner.sendKeys(Keys.DOWN);
        dropdownTipeUpliner.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = "//*[@class=\"MuiBox-root css-70qvj9\"]")
    private WebElement userProfile;
    @FindBy(xpath = "//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-uajqx8\"]")
    private WebElement btnLogout;
    public void Logout(){
        userProfile.click();
        btnLogout.click();
    }





}

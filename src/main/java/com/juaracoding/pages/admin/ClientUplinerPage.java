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
import jdk.jshell.execution.Util;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(xpath = "//input[@id='username']")
    private WebElement fieldUsername;

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

    //    @FindBy(xpath = "//*[@id=\"mui-30\"]/li[2]")
    @FindBy(xpath = "//*/text()[normalize-space(.)='Upliner V2']/parent::*")
    private WebElement varUnit1;
    public void clickFieldFilter(){
        clickFilter.click();
//        varUnit1.click();
    }


    public void clickTerapkan(){
        btnTerapkan.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]/h6")
    private WebElement valFilterUnit;
    public String getTxtValFilterUnit(){
        return valFilterUnit.getText();
    }

    public void getSearch(String search){
        this.txtSearch.sendKeys(search);
    }

    public void clearSearch(){
        txtSearch.clear();
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

    @FindBy(xpath = "//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium button-add css-17dkfmq\"]")
    private WebElement btnTambahkanBca;
    public void clickBtnTambahkanBca(){
        btnTambahkanBca.click();
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

    @FindBy(xpath = "//input[@id='email_2']")
    private WebElement fieldEmailBca;
    public void getEmailBca(String email){
        this.fieldEmailBca.sendKeys(email);
    }
    public void clearEmailBca(){
        fieldEmailBca.clear();
    }
//    public String valNullEmailBca(){
//        return fieldEmailbca.getAttribute("required");
//    }



    public void getUsername(String username){
        this.fieldUsername.sendKeys(username);
    }
    public void clearUsername(){
        fieldUsername.clear();
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

    @FindBy(xpath = "//input[@id='job_departement']")
    private WebElement unitBca;
    public void selectUnitBCA(String unit){
        unitBca.click();
        unitBca.sendKeys(unit);
        Utils.delay(2);
        unitBca.sendKeys(Keys.DOWN);
        Utils.delay(2);
        unitBca.sendKeys(Keys.ENTER);

    }

    @FindBy(xpath = "//div[@id='role_id']")
    private WebElement uplinerBca;
    //    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Logout'])[1]/following::li[2]")
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Upliner V3'])[1]/preceding::li[1]")
    private WebElement uplinerBcaV2;
    public void getUplinerBca(){
        uplinerBca.click();
        Utils.delay(2);
        uplinerBcaV2.click();
        uplinerBcaV2.sendKeys(Keys.ENTER);
        Utils.delay(2);
        fieldUsername.click();
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-edgeStart MuiIconButton-sizeLarge css-nza314']//*[name()='svg']")
    private WebElement btnSvg;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/div/div/button")
    private WebElement btnTitikTiga;
    public void clickbtntitikTiga(){
//        btnSvg.click();
        btnTitikTiga.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[1]/div[1]/label")
    private WebElement Foto;
    public void getFoto(){
        Foto.sendKeys("C:\\Users\\Lenovo Gk\\OneDrive\\Gambar\\fotohadir.jpg");
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[2]/form/div[2]/div/div[5]/button")
    private WebElement ubahPassword;
    public void getBtnUbahPasswprd(){
        ubahPassword.click();
    }

    //button[@type='submit']

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[1]")
    private WebElement btnHapus;
    public void clickBtnYa(){
        btnHapus.click();
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement valNullPWBCA;
    public String getValNullPWBCA(){
        return valNullPWBCA.getAttribute("required");
    }

    @FindBy(xpath = "//p[@id='fullname-helper-text']")
    private WebElement txtNullName;
    public String getTxtNullName(){
        return txtNullName.getText();
    }

    @FindBy(xpath = "//p[@id='username-helper-text']")
    private WebElement txtNullUsername;
    public String getTxtNullUsername(){
        return txtNullUsername.getText();
    }

    @FindBy(xpath = "//*[@id=\"job_departement-helper-text\"]")
    private WebElement txtNullUnit;
    public String getTxtNullUnit(){
        return txtNullUnit.getText();
    }

    @FindBy(xpath = "//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained css-8dz3f']")
    private WebElement txtNullUpliner;
    public String getTxtNullUpliner(){
        return txtNullUpliner.getText();
    }


    public List<WebElement> getListItemsWebElements(WebDriver drivers) {

        // Ambil semua elemen <li> dari list
        WebElement unitCon = drivers.findElement(By.xpath("/html/body/div[14]/div[3]"));
        List<WebElement> listUnit = unitCon.findElements(By.tagName("li"));
        System.out.println(listUnit.get(1).getText());
        return listUnit; // Mengembalikan daftar WebElement
    }


    public List<String> getListItems(WebDriver drivers) {

        WebElement unitCon = drivers.findElement(By.xpath("/html/body/div[14]/div[3]"));
        List<WebElement> listItems = unitCon.findElements(By.tagName("li"));


        // Buat daftar untuk menyimpan isi
        List<String> itemTexts = new ArrayList<>();

        // Iterasi melalui elemen dan ambil teksnya
        for (WebElement item : listItems) {
            itemTexts.add(item.getText());

        }

        return itemTexts;
    }






}

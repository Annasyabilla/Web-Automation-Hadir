package com.juaracoding.pages.admin;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 11/14/2024 12:30 AM
@Last Modified 11/14/2024 12:30 AM
Version 1.0
*/

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenPointPage {
    private WebDriver driver;


    public AbsenPointPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Absen Point']")
    private WebElement varAbsenPoint;

    public void clickVarAbsenPoint(){
        varAbsenPoint.click();
    }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement Search;

    public void getSearch(String search){
        this.Search.sendKeys(search);
    }

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement fieldName;
    public void getFieldName(String fieldName){
        this.fieldName.sendKeys(fieldName);
    }
    public String valNullName(){
        return fieldName.getAttribute("required");
    }

    public void clearName(){
        this.fieldName.clear();
    }

    @FindBy(xpath = "//*[@id=\"latitude\"]")
    private WebElement fieldLatitude;
    public void getFieldLatitude(String fieldLatitude){
        this.fieldLatitude.sendKeys(fieldLatitude);
    }
    public String valNullLatitude(){
        return fieldLatitude.getAttribute("required");
    }
    public void clearLatitude(){
        this.fieldLatitude.clear();
    }

    @FindBy(xpath = "//*[@id=\"longitude\"]")
    private WebElement fieldLongitude;
    public void getFieldLongitude(String fieldLongitude){
        this.fieldLongitude.sendKeys(fieldLongitude);
    }
    public String valNullLongitude(){
        return fieldLongitude.getAttribute("required");
    }
    public void clearLongitude(){
        this.fieldLongitude.clear();
    }

    @FindBy(xpath = "//*[@id=\"max_radius\"]")
    private WebElement fieldRadius;
    public void getFieldRadius(String fieldRadius){
        this.fieldRadius.sendKeys(fieldRadius);
    }
    public String valNullRadius(){
        return fieldRadius.getAttribute("required");
    }
    public void clearRadius(){
        this.fieldRadius.clear();
    }

    @FindBy(xpath = "//*[@id=\"description\"]")
    private WebElement fieldDescription;
    public void getFieldDescription(String fieldDescription){
        this.fieldDescription.sendKeys(fieldDescription);
    }
    public String valNullDescription(){
        return fieldDescription.getAttribute("required");
    }
    public void clearDescription(){
        this.fieldDescription.clear();
    }

    @FindBy(xpath = "//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-4075ia\"] ")
    private WebElement btnTambahkan;
    public void clickBtnTambahkan(){
        btnTambahkan.click();
    }



    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement ValBerhasil;
    public String getValBerhasil(){
        return ValBerhasil.getText();
    }

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[2]")
    private WebElement btnBatal;
    public void clickBtnBatal(){
        btnBatal.click();
    }

    @FindBy(xpath = "//h5[normalize-space()='NAMA']")
    private WebElement txtTabelNama;
    public String getTxtTabelNama(){
        return txtTabelNama.getText();
    }


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/div/div/button")
    private WebElement IconTitikTiga;
    public void getIconTitikTiga(){
        IconTitikTiga.click();
    }

    @FindBy(xpath = "//*[@id=\"card-actions-menu\"]/div[3]/ul/li[1]")
    private WebElement btnEdit;
    public void clickBtnEdit(){
        btnEdit.click();
    }

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[1]")
    private WebElement btnSimpan;
    public void clickBtnSimpan(){
        btnSimpan.click();
    }

    @FindBy(xpath = " //*[@id=\"card-actions-menu\"]/div[3]/ul/li[2]")
    private WebElement btnHapus;
    public void clickBtnHapus(){
        btnHapus.click();
    }

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div/div[2]/button[1]")
    private WebElement btnYa;
    public void clickBtnYa(){
        btnYa.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]")
    private WebElement valDelete;
    public String getTxtValDelete(){
        return valDelete.getText();
    }

    @FindBy(xpath = "//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textSecondary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textSecondary MuiButton-sizeMedium MuiButton-textSizeMedium css-18ozr2e\"]//*[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textSecondary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textSecondary MuiButton-sizeMedium MuiButton-textSizeMedium css-18ozr2e\"]")
    private WebElement btnTidak;
    public void clickBtnTidak(){
        btnTidak.click();
    }


}

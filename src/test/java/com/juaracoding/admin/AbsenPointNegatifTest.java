package com.juaracoding.admin;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 11/14/2024 2:02 PM
@Last Modified 11/14/2024 2:02 PM
Version 1.0
*/

import com.juaracoding.Hooks;
import com.juaracoding.pages.admin.AbsenPointPage;
import com.juaracoding.pages.admin.ClientUplinerPage;
import com.juaracoding.pages.admin.LoginPage;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class AbsenPointNegatifTest {
    private static final Logger log = LoggerFactory.getLogger(ClientUplinerPositifTest.class);
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static ClientUplinerPage clientUplinerPage = new ClientUplinerPage();
    private static LoginPage loginPage = new LoginPage();
    private static AbsenPointPage absenPointPage = new AbsenPointPage();


    public AbsenPointNegatifTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;

    }
    @Given("Ketik LATITUDE atau LONGTITUDE")
    public void ketik_latitude_atau_longitude() {
        Utils.delay(2);
        absenPointPage.getSearch("-6.2729133,106.7415619");
        extentTest.log(LogStatus.PASS, "Ketik LATITUDE atau LONGTITUDE");
    }

    @When("Ketik description")
    public void ketik_description() {
        Utils.delay(2);
        absenPointPage.getSearch("Kirana Three Office Tower");
        absenPointPage.clickVarAbsenPoint();
    }

    @When("kosongkan nama")
    public void kosongkan_nama() {
        Utils.delay(2);
        absenPointPage.clearName();
        absenPointPage.getFieldName("");
        extentTest.log(LogStatus.PASS, "kosongkan nama");
    }

    @Then("Validasi error memunculkan pesan Please fill out this field")
    public void Validasi_error_memunculkan_pesan_Please_fill_out_this_field(){
        Utils.delay(2);
        Assert.assertEquals(absenPointPage.valNullName() ,"true");
        Assert.assertEquals(absenPointPage.valNullLatitude(),"true");
        Assert.assertEquals(absenPointPage.valNullLongitude(),"true");
        Assert.assertEquals(absenPointPage.valNullRadius(),"true");
        Assert.assertEquals(absenPointPage.valNullDescription(),"true");
        extentTest.log(LogStatus.PASS, "Validasi error memunculkan pesan Please fill out this field");
    }

    @And("kosongkan Latitude")
    public void kosongkan_latitude(){
        Utils.delay(2);
        absenPointPage.clearLatitude();
        absenPointPage.getFieldLatitude("");
        extentTest.log(LogStatus.PASS, "kosongkan Latitude");
    }

    @And("kosongkan Longitude")
    public void kosongkan_longitude(){
        Utils.delay(2);
        absenPointPage.clearLongitude();
        absenPointPage.getFieldLongitude("");
        extentTest.log(LogStatus.PASS, "kosongkan Longitude");
    }

    @And("kosongkan radius")
    public void kosongkan_radius(){
        Utils.delay(2);
        absenPointPage.clearRadius();
        absenPointPage.getFieldRadius("");
        extentTest.log(LogStatus.PASS, "kosongkan radius");
    }

    @And("kosongkan description")
    public void kosongkan_description(){
        Utils.delay(2);
        absenPointPage.clearDescription();
        absenPointPage.getFieldDescription("");
        extentTest.log(LogStatus.PASS, "kosongkan description");
    }


}

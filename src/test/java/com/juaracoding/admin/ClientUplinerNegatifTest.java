package com.juaracoding.admin;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 11/15/2024 2:22 PM
@Last Modified 11/15/2024 2:22 PM
Version 1.0
*/

import com.juaracoding.Hooks;
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

public class ClientUplinerNegatifTest {

    private static final Logger log = LoggerFactory.getLogger(ClientUplinerPositifTest.class);
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static ClientUplinerPage clientUplinerPage = new ClientUplinerPage();
    private static LoginPage loginPage = new LoginPage();


    public ClientUplinerNegatifTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;

    }

    @Given("Klik Pada kolom Search dan search by email")
    public void klik_pada_kolom_search_by_email() {
        Utils.delay(2);
        clientUplinerPage.getSearch("sukunhangat@gmail.com");
        extentTest.log(LogStatus.PASS, "Klik Pada kolom Search dan search by email");
    }

    @Then("Tidak ada hasil pencarian yang ditampilkan pada tabel")
    public void tidak_ada_hasil_pencarian_pada_tabel() {
        Utils.delay(3);
        Assert.assertEquals(clientUplinerPage.getValRow(),"0-0 of 0");
        extentTest.log(LogStatus.PASS, "Tidak ada hasil pencarian yang ditampilkan pada tabel");
    }

    @When("Kosongkan Nama Karyawan")
    public void kosongkan_nama_karyawan() {
        Utils.delay(3);
        clientUplinerPage.clearNamaKaryawan();
        clientUplinerPage.getNamaKaryawan("");
        extentTest.log(LogStatus.PASS, "Kosongkan Nama Karyawan");
    }

    @And("kosongkan Email")
    public void kosongkan_email(){
        Utils.delay(3);
        clientUplinerPage.clearEmail();
        clientUplinerPage.getEmail("");
        extentTest.log(LogStatus.PASS, "Kosongkan Email");
    }

    @And("kosongkan Password")
    public void kosongkan_password(){
        Utils.delay(3);
        clientUplinerPage.clearPassword();
        clientUplinerPage.getPassword("");
        extentTest.log(LogStatus.PASS, "Kosongkan Password");
    }

    @Given("Input 1 huruf pada nama")
    public void Input_1_huruf_pada_nama(){
        Utils.delay(3);
        clientUplinerPage.clearNamaKaryawan();
        clientUplinerPage.getNamaKaryawan("a");
        extentTest.log(LogStatus.PASS, "Input 1 huruf pada nama");
    }

    @Then("Validasi error menampilkan pesan Please fill out this field")
    public void Validasi_error_menampilkan_pesan_Please_fill_out_this_field(){
        Utils.delay(3);
        Assert.assertEquals(clientUplinerPage.valNullNamaKaryawan(),"true");
        Assert.assertEquals(clientUplinerPage.valNullPassword(),"true");
        Assert.assertEquals(clientUplinerPage.valNullEmail(),"true");
        extentTest.log(LogStatus.PASS, "Validasi error menampilkan pesan Please fill out this field");
    }

    @Then("gagal dan menampilkan pesan sesuai kondisi")
    public void gagal_dan_menampilkan_pesan_sesuai_kondisi(){
        Utils.delay(3);
        Assert.assertEquals(clientUplinerPage.valNullNamaKaryawan(),"true");
        Assert.assertEquals(clientUplinerPage.valNullPassword(),"true");
        Assert.assertEquals(clientUplinerPage.valNullEmail(),"true");
        extentTest.log(LogStatus.PASS, "gagal dan menampilkan pesan sesuai kondisi");
    }

    @And("input email tanpa at")
    public void input_email_tanpa_at(){
        Utils.delay(3);
        clientUplinerPage.clearEmail();
        clientUplinerPage.getEmail("johan.com");
        extentTest.log(LogStatus.PASS, "Input email tanpa at");
    }

    @And("input 1 huruf pada password")
    public void input1_huruf_pada_password(){
        Utils.delay(3);
        clientUplinerPage.clearPassword();
        clientUplinerPage.getPassword("a");
    }
}

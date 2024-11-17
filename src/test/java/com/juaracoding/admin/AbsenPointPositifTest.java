package com.juaracoding.admin;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 11/14/2024 12:31 AM
@Last Modified 11/14/2024 12:31 AM
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

public class AbsenPointPositifTest {
    private static final Logger log = LoggerFactory.getLogger(ClientUplinerPositifTest.class);
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static ClientUplinerPage clientUplinerPage = new ClientUplinerPage();
    private static LoginPage loginPage = new LoginPage();
    private static AbsenPointPage absenPointPage = new AbsenPointPage();


    public AbsenPointPositifTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;

    }

    @And("Klik Sub Menu Absen Point")
    public void klik_sub_menu_absen_point() {
        Utils.delay(2);
        absenPointPage.clickVarAbsenPoint();
        extentTest.log(LogStatus.PASS, "Klik Sub Menu Absen Point");
    }

    @Then("Inputan berhasil terhapus")
    public void inputan_berhasil_terhapus() {
        Utils.delay(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/management/location-point");
        extentTest.log(LogStatus.PASS, "Inputan berhasil terhapus");
    }

    @When("input nama")
    public void input_nama() {
        Utils.delay(2);
        absenPointPage.getFieldName("John");
        extentTest.log(LogStatus.PASS, "Input nama");
    }

    @And("input Latitude")
    public void input_latitude(){
        Utils.delay(2);
        absenPointPage.getFieldLatitude("-6.2277153919997685");
        extentTest.log(LogStatus.PASS, "Input Latitude");
    }

    @And("input Longitude")
    public void input_longitude(){
        Utils.delay(2);
        absenPointPage.getFieldLongitude("-106.8223241666");
        extentTest.log(LogStatus.PASS, "Input Longitude");
    }

    @And("input radius")
    public void input_radius(){
        Utils.delay(2);
        absenPointPage.getFieldRadius("80");
        extentTest.log(LogStatus.PASS, "Input radius");
    }

    @And("input description")
    public void input_description(){
        Utils.delay(2);
        absenPointPage.getFieldDescription("MENARA BCA LT.17, GRAND INDONESIA, Jl. MH. THAMRIN NO.01, " +
                "KEL. MENTENG, KEC. MENTENG, KOTA JAKARTA PUSAT, DKI JAKARTA - 10310");
        extentTest.log(LogStatus.PASS, "input description");
    }

    @And("klik button tambahkan")
    public void klik_button_tambahkan() {
        Utils.delay(2);
        absenPointPage.clickBtnTambahkan();
        extentTest.log(LogStatus.PASS, "klik button tambahkan");
    }

    @Then("Data absen point berhasil ditambahkan ke dalam tabel")
    public void Data_absen_point_berhasil_ditambahkan_ke_dalam_tabel(){
        Utils.delay(2);
        Assert.assertEquals(absenPointPage.getValBerhasil(),"Berhasil Tambah Location Point");
        extentTest.log(LogStatus.PASS, "Data absen point berhasil ditambahkan ke dalam tabel");
    }

    @Given("klik button Batal")
    public void klik_button_batal(){
        Utils.delay(2);
        absenPointPage.clickBtnBatal();
        extentTest.log(LogStatus.PASS, "klik button batal");
    }

    @Then("keluar dari halaman form")
    public void keluar_dari_halaman_form(){
        Utils.delay(2);
        Assert.assertEquals(absenPointPage.getTxtTabelNama(),"NAMA");
        extentTest.log(LogStatus.PASS, "keluar dari halaman");
    }

    @Given("Klik icon titik tiga")
    public void Klik_icon_titik_tiga(){
        Utils.delay(2);
        absenPointPage.getIconTitikTiga();
        extentTest.log(LogStatus.PASS, "Klik icon titik tiga");
    }

    @When("pilih edit")
    public void pilih_edit(){
        Utils.delay(2);
        absenPointPage.clickBtnEdit();
        extentTest.log(LogStatus.PASS, "pilih edit");
    }

    @And("input data absen point baru")
    public void input_data_absen_point_baru(){
        Utils.delay(2);
        absenPointPage.clearName();
        absenPointPage.getFieldName("Kreasi Indonesia");
        extentTest.log(LogStatus.PASS, "input data absen point baru");
    }

    @And("klik simpan")
    public void klik_simpan(){
        Utils.delay(2);
        absenPointPage.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "klik simpan");
    }

    @Then("Data berhasil diedit")
    public void data_berhasil_diedit(){
        Utils.delay(2);
        Assert.assertEquals(absenPointPage.getTxtTabelNama(),"NAMA");
        extentTest.log(LogStatus.PASS, "Data berhasil diedit");
    }

    @When("pilih delete")
    public void pilih_delete(){
        Utils.delay(2);
        absenPointPage.clickBtnHapus();
        extentTest.log(LogStatus.PASS, "pilih delete");
    }

    @And("klik Ya")
    public void klik_Ya(){
        Utils.delay(2);
        absenPointPage.clickBtnYa();
        extentTest.log(LogStatus.PASS, "klik Ya");
    }

    @Then("Data berhasil dihapus")
    public void data_berhasil_dihapus(){
        Utils.delay(2);
        Assert.assertEquals(absenPointPage.getTxtValDelete(),"Berhasil Delete Location Point");
        extentTest.log(LogStatus.PASS, "Data berhasil dihapus");
    }

    @Given("klik Tidak")
    public void klik_tidak(){
        Utils.delay(2);
        absenPointPage.clickBtnTidak();
        extentTest.log(LogStatus.PASS, "klik tidak");
    }


}

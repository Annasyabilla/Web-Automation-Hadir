package com.juaracoding.admin;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 11/12/2024 9:49 PM
@Last Modified 11/12/2024 9:49 PM
Version 1.0
*/

import com.juaracoding.Hooks;
import com.juaracoding.pages.admin.ClientUplinerPage;
import com.juaracoding.pages.admin.LoginPage;
import com.juaracoding.utils.DataGenerator;
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

public class ClientUplinerPositifTest {
    private static final Logger log = LoggerFactory.getLogger(ClientUplinerPositifTest.class);
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static ClientUplinerPage clientUplinerPage = new ClientUplinerPage();
    private static LoginPage loginPage = new LoginPage();
    private static DataGenerator dataGenerator = new DataGenerator();



    public ClientUplinerPositifTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;

    }

    @Given("Admin Berhasil Login")
    public void admin_berhasil_login() {
        driver.manage().window().maximize(); //untuk full screen
        driver.get("https://magang.dikahadir.com/authentication/login");
        loginPage.loginUser("admin@hadir.com", "admin@hadir");
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS, "Admin Berhasil Login");
    }

    @And("Klik Dropdown Menu Management")
    public void klik_dropdown_menu_management() {
        Utils.delay(2);
        clientUplinerPage.clickManagementDropdown();
        extentTest.log(LogStatus.PASS, "Klik Dropdown Menu Management");
    }

    @And("Klik Sub Menu Client Upliner")
    public void klik_sub_menu_client_upliner() {
        Utils.delay(2);
        clientUplinerPage.clickVarClientUpliner();
        extentTest.log(LogStatus.PASS, "Klik Sub Menu Client Upliner");
    }

    @When("Klik Icon Filter")
    public void klik_icon_filter() {
        Utils.delay(2);
        clientUplinerPage.clickBtnFilter();
        extentTest.log(LogStatus.PASS, "Klik Icon Filter");
    }

    @And("Pilih Unit")
    public void pilih_unit() {
        Utils.delay(2);
        clientUplinerPage.clickFieldFilter();
//        clientUplinerPage.filterUnit();
        extentTest.log(LogStatus.PASS, "Pilih Unit");
    }

    @And("Klik Button Terapkan")
    public void klik_terapkan() {
        Utils.delay(3);
        clientUplinerPage.clickTerapkan();
        extentTest.log(LogStatus.PASS, "Klik Button Terapkan");
    }

    @Then("Menampilkan Data Sesuai Hasil Filter Yang Dipinta")
    public void menampilkan_data_sesuai_hasil_filter_yang_dipinta(){
        Utils.delay(2);
        Assert.assertEquals(clientUplinerPage.getTxtValFilterUnit(),"AFI Desk Collection");
        extentTest.log(LogStatus.PASS, "Menampilkan Data Sesuai Hasil Filter Yang Dipinta");
    }

    @Given("Klik Pada kolom Search")
    public void klik_pada_kolom_search() {
        Utils.delay(2);
        clientUplinerPage.getSearch("kari");
        extentTest.log(LogStatus.PASS, "Klik Pada kolom Search");
    }


    @When("Klik Button Search")
    public void klik_Button_Search() {
        Utils.delay(2);
        clientUplinerPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik Button Search");
    }

    @Then("Menampilkan Data Sesuai Dengan Nama Yang Diinput")
    public void menampilkan_data_sesuai_diinput() {
        Utils.delay(2);
        Assert.assertEquals(clientUplinerPage.getValueSearch(),"kari");
        extentTest.log(LogStatus.PASS, "Menampilkan Data Sesuai Dengan Nama Yang Diinput");
    }

    @Given("Klik Reset")
    public void klik_reset() {
        Utils.delay(2);
        clientUplinerPage.clickBtnReset();
        extentTest.log(LogStatus.PASS, "Klik Reset");
    }

    @Then("Tombol Reset menghapus input pada field")
    public void tombol_reset_menghapus_input_pada_field() {
        Utils.delay(4);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/management/client-upliner");
        extentTest.log(LogStatus.PASS, "Tombol Reset menghapus input pada field");
    }

    @Given("Klik button Tambahkan")
    public void klik_button_tambahkan(){
        Utils.delay(2);
        clientUplinerPage.clickBtnTambahkan();
        extentTest.log(LogStatus.PASS, "Klik button tambahkan");
    }

//    @And("Input nama karyawan{string}")
//    public void input_nama_Karyawan(String nama_karyawan) {
//        Utils.delay(2);
//        clientUplinerPage.getNamaKaryawan(nama_karyawan);
//        extentTest.log(LogStatus.PASS, "Input namaKaryawan");
//    }

    @And("Input nama karyawan")
    public void input_nama_Karyawan(){
        Utils.delay(2);
        clientUplinerPage.clearNamaKaryawan();
        clientUplinerPage.getNamaKaryawan(dataGenerator.dataNamaLengkap());
        extentTest.log(LogStatus.PASS, "Input namaKaryawan");
    }

    @And("Input Email")
    public void input_email() {
        Utils.delay(2);
        clientUplinerPage.clearEmail();
        clientUplinerPage.getEmail(dataGenerator.dataEmail());
        extentTest.log(LogStatus.PASS, "Input email");
    }

    @And("Input Password")
    public void input_password(){
        Utils.delay(2);
        clientUplinerPage.clearPassword();
        clientUplinerPage.getPassword(dataGenerator.dataPassword());
        extentTest.log(LogStatus.PASS, "Input password");
    }

    @When("Isi Unit")
    public void isi_unit() {
        Utils.delay(2);
        clientUplinerPage.selectUnit("Juara Coding");
        extentTest.log(LogStatus.PASS, "Isi Unit");
    }

    @And("pilih tipe Upliner_V2")
    public void pilih_tipe_Upliner_v2(){
        Utils.delay(2);
        clientUplinerPage.getDropdownTipeUplinerV2();
        extentTest.log(LogStatus.PASS, "Pilih tipe Upliner");
    }

    @And("Klik button Daftar")
    public void klik_button_daftar() {
        Utils.waitAndClick(clientUplinerPage.getBtnDaftarUpliner());
//        clientUplinerPage.clickBtnDaftar();
        extentTest.log(LogStatus.PASS, "Klik button Daftar");
    }
//@And("Klik button Daftar")
//public void klik_button_daftar() {
//    try {
//        Utils.delay(2);
//        clientUplinerPage.clickBtnDaftar();
//        extentTest.log(LogStatus.PASS, "Klik button Daftar berhasil.");
//    } catch (Exception handlingException) {
//        extentTest.log(LogStatus.FAIL, "Klik button Daftar gagal: " + handlingException.getMessage());
//        throw handlingException;
//    }
//}

    @Then("Client Upliner berhasil ditambahkan dan muncul di halaman Client Upliner dengan tipe upliner v2")
    public void Client_Upliner_berhasil_ditambahkan_dan_muncul_di_halaman_Client_Upliner_dengan_tipe_upliner_v2(){
        Utils.delay(2);
//        System.out.println(clientUplinerPage.getValNotifSukses());
        Assert.assertEquals(clientUplinerPage.getValNotifSukses(),"Data Client Upliner berhasil ditambahkan ke dalam tabel");
        Utils.delay(2);
        extentTest.log(LogStatus.PASS, "Client Upliner berhasil ditambahkan dan muncul di halaman Client Upliner dengan tipe upliner v2r");

    }

    @And("logout")
    public void logout() {
        Utils.delay(2);
        clientUplinerPage.Logout();
    }
}
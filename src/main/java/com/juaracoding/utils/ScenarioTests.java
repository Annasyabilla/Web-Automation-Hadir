package com.juaracoding.utils;

public enum ScenarioTests {

    T1("Search by nama"),
    T2("Verifikasi tombol Reset"),
    T3("Melakukan pencarian diluar tabel nama seperti LATITUDE dan LONGTITUDE"),
    T4("Melakukan pencarian menggunakan description"),
    T5("Menambahkan tabel absen point dengan data valid"),
    T6("Menambahkan tabel absen point dengan tidak mengisi form"),
    T7("Menambahkan tabel absen point dengan tidak mengisi field nama tetapi mengisi field lain"),
    T8("Menambahkan tabel absen point dengan tidak mengisi form latitude tetapi mengisi field lain"),
    T9("Menambahkan tabel absen point dengan tidak mengisi form longtitude tetapi mengisi field lain"),
    T10("Menambahkan tabel absen point dengan tidak mengisi form maksimal radius tetapi mengisi field lain"),
    T11("Menambahkan tabel absen point dengan tidak mengisi form description tetapi mengisi field lain"),
    T12("Verifikasi button Batal"),
    T13("Melakukan edit pada data absen point"),
    T14("Menghapus data absen point"),
    T15("Logout"),
    T16("Filter Client upliner"),
    T17("Search by nama"),
    T18("Verifikasi tombol Reset"),
    T19("Melakukan pencarian diluar tabel nama seperti email"),
    T20("Tambahkan Upliner Dengan data yang kosong"),
    T21("Tambahkan Upliner Dengan unit yang kosong"),
    T22("Tambahkan Upliner Dengan nama yang kosong"),
    T23("Tambahkan Upliner Dengan email yang kosong"),
    T24("Tambahkan Upliner Dengan Password yang kosong"),
    T25("Tambahkan Upliner Dengan nama yang kurang dari 2 character"),
    T26("Tambahkan Upliner Dengan email tanpa @"),
    T27("Tambahkan Upliner Dengan Password yang kurang dari 2 character"),
    T28("Tambahkan Upliner"),
    T29("Edit client upliner"),
    T30("Menghapus client upliner"),
    T31("Tambahkan Upliner BCA dengan tanpa password"),
    T32("Tambahkan Upliner BCA dengan data kosong kecuali password"),
    T33("Tambahkan Upliner BCA");

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }
}

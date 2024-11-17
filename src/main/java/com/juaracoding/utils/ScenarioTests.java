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
    T11("Verifikasi button Batal"),
    T12("Melakukan edit pada data absen point"),
    T13("Menghapus data absen point"),
    T14("Logout"),
    T15("Filter Client upliner"),
    T16("Search by nama"),
    T17("Verifikasi tombol Reset"),
    T18("Melakukan pencarian diluar tabel nama seperti email"),
    T19("Tambahkan Upliner Dengan data yang kosong"),
    T20("Tambahkan Upliner Dengan unit yang kosong"),
    T21("Tambahkan Upliner Dengan nama yang kosong"),
    T22("Tambahkan Upliner Dengan email yang kosong"),
    T23("Tambahkan Upliner Dengan Password yang kosong"),
    T24("Tambahkan Upliner Dengan nama yang kurang dari 2 character"),
    T25("Tambahkan Upliner Dengan email tanpa @"),
    T26("Tambahkan Upliner Dengan Password yang kurang dari 2 character"),
    T27("Tambahkan Upliner");

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }
}

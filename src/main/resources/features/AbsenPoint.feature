Feature: Absen Point
  Scenario: Search by nama
    Given Admin Berhasil Login
    And Klik Dropdown Menu Management
    And Klik Sub Menu Absen Point
    When Klik Pada kolom Search
    And Klik Button Search
    Then Menampilkan Data Sesuai Dengan Nama Yang Diinput

  Scenario: Verifikasi tombol Reset
    Given Klik Reset
    Then Inputan berhasil terhapus

  Scenario:Melakukan pencarian diluar tabel nama seperti LATITUDE dan LONGTITUDE
    Given Ketik LATITUDE atau LONGTITUDE
    And Klik Button Search
    Then Tidak ada hasil pencarian yang ditampilkan pada tabel

    Scenario: Melakukan pencarian menggunakan description
      Given Klik Reset
      When Ketik description
      And Klik Button Search
      Then Tidak ada hasil pencarian yang ditampilkan pada tabel

  Scenario: Menambahkan tabel absen point dengan data valid
    Given Klik button Tambahkan
    When input nama
    And input Latitude
    And input Longitude
    And input radius
    And input description
    And klik button tambahkan
    Then Data absen point berhasil ditambahkan ke dalam tabel

  Scenario: Menambahkan tabel absen point dengan tidak mengisi form
    Given Klik button Tambahkan
    When kosongkan nama
    And kosongkan Latitude
    And kosongkan Longitude
    And kosongkan radius
    And kosongkan description
    And klik button tambahkan
    Then Validasi error memunculkan pesan Please fill out this field

  Scenario: Menambahkan tabel absen point dengan tidak mengisi field nama tetapi mengisi field lain
    When kosongkan nama
    And input Latitude
    And input Longitude
    And input radius
    And input description
    And klik button tambahkan
    Then Validasi error memunculkan pesan Please fill out this field

  Scenario: Menambahkan tabel absen point dengan tidak mengisi form latitude tetapi mengisi field lain
    When input nama
    And kosongkan Latitude
    And klik button tambahkan
    Then Validasi error memunculkan pesan Please fill out this field

  Scenario: Menambahkan tabel absen point dengan tidak mengisi form longtitude tetapi mengisi field lain
    Given input Latitude
    When kosongkan Longitude
    And klik button tambahkan
    Then Validasi error memunculkan pesan Please fill out this field

  Scenario: Menambahkan tabel absen point dengan tidak mengisi form maksimal radius tetapi mengisi field lain
    Given input Longitude
    When kosongkan radius
    And klik button tambahkan
    Then Validasi error memunculkan pesan Please fill out this field

  Scenario: Menambahkan tabel absen point dengan tidak mengisi form description tetapi mengisi field lain
    Given input radius
    When kosongkan description
    And klik button tambahkan
    Then Validasi error memunculkan pesan Please fill out this field

  Scenario: Verifikasi button Batal
  Given klik button Batal
  Then keluar dari halaman form

  Scenario: Melakukan edit pada data absen point
    Given Klik icon titik tiga
    When pilih edit
    And input data absen point baru
    And klik simpan

    Scenario:Menghapus data absen point
      Given Klik icon titik tiga
      When pilih delete
      And klik Ya
      Then Data berhasil dihapus

  Scenario: logout
    Given logout


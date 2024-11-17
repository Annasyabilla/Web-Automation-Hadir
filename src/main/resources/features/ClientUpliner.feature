Feature: Client Upliner

  Scenario: Filter Client upliner
    Given Admin Berhasil Login
    And Klik Dropdown Menu Management
    And Klik Sub Menu Client Upliner
    When Klik Icon Filter
    And Pilih Unit
    And Klik Button Terapkan
    Then Menampilkan Data Sesuai Hasil Filter Yang Dipinta

  Scenario: Search by nama
    Given Klik Pada kolom Search
    When Klik Button Search
    Then Menampilkan Data Sesuai Dengan Nama Yang Diinput

  Scenario: Verifikasi tombol Reset
    Given Klik Reset
    Then Tombol Reset menghapus input pada field

  Scenario: Melakukan pencarian diluar tabel nama seperti email
    Given Klik Pada kolom Search dan search by email
    When Klik Button Search
    Then Tidak ada hasil pencarian yang ditampilkan pada tabel

  Scenario: Tambahkan Upliner Dengan data yang kosong
    Given Klik button Tambahkan
    When Kosongkan Nama Karyawan
    And kosongkan Email
    And kosongkan Password
    And Klik button Daftar
    Then Validasi error menampilkan pesan Please fill out this field

#    Scenario: Tambahkan Upliner Dengan unit yang kosong
#      Given Input nama karyawan
#      And Input Email
#      And Input Password
#      When Klik button Daftar
#      Then Validasi error menampilkan pesan Please fill out this field
#
#  Scenario: Tambahkan Upliner Dengan nama yang kosong
#    Given Kosongkan Nama Karyawan
#    When Isi Unit
#    And Klik button Daftar
#    Then Validasi error menampilkan pesan Please fill out this field
#
#  Scenario: Tambahkan Upliner Dengan email yang kosong
#    Given Input nama karyawan
#    When kosongkan Email
#    And Klik button Daftar
#    Then Validasi error menampilkan pesan Please fill out this field
#
#  Scenario: Tambahkan Upliner Dengan Password yang kosong
#    And Input Email
#    And kosongkan Password
#    And Klik button Daftar
#    Then Validasi error menampilkan pesan Please fill out this field
#
#  Scenario: Tambahkan Upliner Dengan nama yang kurang dari 2 character
#    Given Input 1 huruf pada nama
#    And Input Password
#    When Isi Unit
#    And Klik button Daftar
#    Then gagal dan menampilkan pesan sesuai kondisi
#
#  Scenario: Tambahkan Upliner Dengan email tanpa @
#    Given Kosongkan Nama Karyawan
#    When Input nama karyawan
#    And input email tanpa at
#    And Klik button Daftar
#    Then gagal dan menampilkan pesan sesuai kondisi
#
#  Scenario: Tambahkan Upliner Dengan Password yang kurang dari 2 character
#    Given kosongkan Email
#    When Input Email
#    And input 1 huruf pada password
#    And Klik button Daftar
#    Then gagal dan menampilkan pesan sesuai kondisi


  Scenario: Tambahkan Upliner
    Given Klik button Tambahkan
    And Input nama karyawan
    And Input Email
    And Input Password
    When Isi Unit
    And pilih tipe Upliner_V2
    And Klik button Daftar
    Then Client Upliner berhasil ditambahkan dan muncul di halaman Client Upliner dengan tipe upliner v2
#    And logout

#  Scenario: logout
#  Given logout









# Koleksi Alat Makeup

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Indah Maramin Al Inayah   | 2409116086    | Sistem Informasi C |

## 📄Deskripsi Program

Program ini adalah sistem manajemen koleksi alat makeup berbasis Java yang dikembangkan dengan konsep Object-Oriented Programming (OOP). Sistem ini menyediakan satu role yaitu pengguna, yang dapat melakukan operasi CRUD (Create, Read, Update, Delete) terhadap data koleksi. Data yang dikelola mencakup nama alat, jenis, merk, dan jumlah.

Program ini menerapkan:

* Constructor untuk inisialisasi objek.

* Access Modifier (private & public) untuk menjaga enkapsulasi data.

* Validasi input, agar hanya data yang sesuai yang dapat dimasukkan.

* Fitur pencarian (Search) untuk memudahkan pengguna menemukan koleksi tertentu.

Fitur Utama:


1. **Tambah Koleksi**: Pengguna dapat menambahkan data alat makeup baru.
2. **Lihat Koleksi**: Menampilkan seluruh daftar koleksi yang sudah tersimpan.
3. **Ubah Koleksi**: Memperbarui data koleksi yang dipilih
4. **Hapus Koleksi**: Menghapus data koleksi dari daftar
5. **Cari Koleksi**: Mencari data koleksi berdasarkan nama alat.
6. **Keluar Program**: Menghentikan jalannya program

## Struktur Packages 

Program ini menggunakan pola MVC (Model-View-Controller) agar kode lebih terstruktur, mudah dipelihara, dan jelas pembagian fungsinya.

* **main**: berisi Main.java sebagai titik masuk program yang menampilkan menu dan menerima input pengguna
  
* **model**: berisi class data Alat Makeup.java sebagai superclass dari nama, jenis, merk, dan jumlah. Lipstick.java dan Foundation.java sebagai subclass dengan atribut khusus yaitu warna dan shade.
  
* **service**: berisi KoleksiService.java yang mengatur logika CRUD, validasi input, dan fitur pencarian.

## Menerapkan encapsulation (getter dan setter)

<img width="817" height="300" alt="Screenshot 2025-09-21 191317" src="https://github.com/user-attachments/assets/440e6939-61f1-4354-a833-dec43bd3253a" />

Class AlatMakeup menerapkan prinsip encapsulation dengan cara membuat semua atribut (nama, jenis, merk, dan jumlah) menggunakan modifier private. Dengan begitu atribut ini tidak bisa diakses langsung dari luar class, sehingga data lebih aman. Selain itu, class ini juga memiliki constructor yang berfungsi untuk menginisialisasi objek saat pertama kali dibuat. Constructor menerima parameter (String nama, String jenis, String merk, dan int jumlah) yang kemudian disimpan melalui keyword this. Dengan adanya constructor ini, setiap kali objek AlatMakeup dibuat, datanya langsung terisi dengan lengkap sesuai input yang diberikan.

<img width="726" height="538" alt="image" src="https://github.com/user-attachments/assets/ace5810a-da71-4ba2-a634-90082f48fe35" />

* Getter berfungsi untuk mengambil nilai atribut yang sifatnya private, seperti getNama(), getJenis(), getMerk(), dan getJumlah(). Dengan getter, data bisa dibaca dari luar class tanpa harus mengakses atribut secara langsung.

* Sedangkan setter digunakan untuk mengubah atau memperbarui nilai atribut, seperti setNama(String nama), setJenis(String jenis), setMerk(String merk), dan setJumlah(int jumlah). Penggunaan setter ini membuat perubahan data menjadi lebih terkontrol, karena programmer bisa menambahkan aturan atau validasi di dalamnya bila diperlukan

Dengan adanya kombinasi getter dan setter ini, prinsip encapsulation benar-benar diterapkan. Data tetap aman karena atribut tidak bisa diakses langsung dari luar, tetapi tetap fleksibel untuk dibaca dan diubah melalui method khusus.

## Menerapkan inheritance (minimal memiliki 1 superclass dengan 2 subclass)

<img width="566" height="73" alt="image" src="https://github.com/user-attachments/assets/95756290-1225-418d-b9bf-3e2532f69c3a" />

* Superclass: AlatMakeup.java

  Ini adalah class induk yang punya atributd asar (nama, jenis, merk, jumlah) dan sudah dilengkapi constructor, getter, dan setter

* Subclass: Lipstick.java dan Foundation.java

  Kedua class ini mewarisi (extends) class AlatMakeup. Artinya, Lipstick dan Foundation otomatis punya semua atribut dan method dari AlatMakeup, lalu menambahkan atribut khusus masing-masing, seperti warna untuk lipstick dan shade untuk foundation.

<img width="976" height="449" alt="image" src="https://github.com/user-attachments/assets/f8135d79-d11d-4356-b2c0-605d21ed101b" />

1. public class Lipstick extends AlatMakeup: baris ini menunjukkan bahwa Lipstick adalah subclass yang mewarisi semua atribut dan method dari superclass AlatMakeup. Jadi, Lipstick otomatis punya atribut nama, jenis, merk, dan jumlah tanpa perlu mendeklarasikan ulang.
2. super(nama, jenis, merk, jumlah); kode ini memanggil constructor dari superclass (AlatMakeup) agar atribut dasar bisa langsung diinisialisasi. Setelah itu, Lipstick menambahkan atribut khusus yaitu warna.
3. public String getWarna() dan public void setWarna(String warna): ini adalah getter dan setter khusus untuk atribut tambahan warna.
4. public String toString(): method ini menampilkan data Lipstick dengan cara menggabungkan hasil dari super.info() (dari superclass) dengan atribut tambahan warna. Ini juga termasuk contoh overriding, karena toString() di sini menyesuaikan output khusus subclass.

Jadi file ini adalah salah satu penerapan inherintance, karena dia mewarisi AlatMakeup sekaligus menambahkan fitur khusus.

<img width="954" height="455" alt="image" src="https://github.com/user-attachments/assets/b7a4123a-78b3-494b-bd29-001df01f1bba" />

## Menerapkan Overriding

# Penggunaan Program

<details>
<summary><h3>Menu Koleksi Alat Makeup</h3></summary>

<img width="318" height="178" alt="image" src="https://github.com/user-attachments/assets/0f447f12-3ad8-47d9-907e-63f4739b898e" />

Saat program pertama kali dijalankan, sistem akan langsung menampilkan menu utama yang berisi daftar pilihan menu. Pengguna diminta untuk memasukkan nomor menu sesuai dengan pilihan yang diinginkan. Setelah itu, program akan menjalankan perintah sesuai input pengguna dan kemudian kembali menampilkan menu utama, hingga pengguna memilih opsi Keluar untuk menghentikan program.


## 1. Tambah Koleksi

<img width="461" height="307" alt="image" src="https://github.com/user-attachments/assets/36267c6b-f627-4d59-aadd-7fce7ad4b57c" />

Jika pengguna memilih opsi 1. Tambah Koleksi, program akan meminta pengguna untuk mengisi data alat makeup yang ingin dimasukkan ke dalam daftar koleksi. Setelah semua data dimasukkan dengan benar, program akan menyimpan informasi tersebut ke dalam ArrayList dan menampilkan pesan "Koleksi berhasil ditambahkan!". Data alat makeup baru akan tersimpan dan bisa dilihat kembali melalui menu Lihat Koleksi.

<img width="387" height="257" alt="image" src="https://github.com/user-attachments/assets/a0fb64c5-fb49-4dcc-920a-224b6e19b3d6" />

Saat pengguna diminta memasukkan Nama Alat Makeup, pengguna menekan enter tanpa mengetikkan apapun sehingga program akan menampilkan pesan "Nama tidak boleh kosong!" dan berlaku untuk memasukkan jenis makeup, merk, dan jumlah.

## 2. Lihat Koleksi

<img width="648" height="291" alt="image" src="https://github.com/user-attachments/assets/05f1adac-5451-46a9-9901-6cd1479c5be6" />

Jika pengguna memilih opsi 2. Lihat Koleksi, program akan menampilkan seluruh daftar alat makeup yang sudah tersimpan.

## 3. Ubah Koleksi

<img width="721" height="502" alt="image" src="https://github.com/user-attachments/assets/09e0ea09-786d-48f6-ad8e-98439884953b" />

Jika pengguna memilih opsi 3. Ubah Koleksi, maka program akan meminta nomor koleksi yang ingin diubah. Setelah itu, pengguna dapat memasukkan data baru untuk mengganti data lama. Setelah sudah memasukkan data baru, pengguna bisa mengecek kembali dengan opsi 2. Lihat Koleksi.

<img width="649" height="325" alt="image" src="https://github.com/user-attachments/assets/f171e1a5-256e-49fc-89fc-b6135c31b6fd" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 4. Hapus Koleksi

<img width="658" height="563" alt="image" src="https://github.com/user-attachments/assets/7219cd8a-7727-4abd-96cb-1011147df63e" />

Jika pengguna memilih opsi 4. Hapus Koleksi, maka program akan meminta nomor koleksi yang ingin dihapus. Setelah itu, data koleksi akan dihapus dari daftar

<img width="689" height="340" alt="image" src="https://github.com/user-attachments/assets/fad4e55f-c038-4ad6-aef7-98e5e77b38f0" />

Apabila pengguna memasukkan nomor koleksi yang tidak tersedia, program akan menampilkan pesan "Nomor tidak valid!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

## 5. Cari Koleksi

<img width="688" height="257" alt="image" src="https://github.com/user-attachments/assets/b1842f83-d03a-4824-b310-b656420faffd" />

Jika pengguna memilih opsi 5, maka program akan meminta kata kunci pencarian dari nama atau merk alat makeup. Setelah itu, program akan menampilkan daftar alat makeup yang sesuai kata kunci.

<img width="523" height="245" alt="image" src="https://github.com/user-attachments/assets/3b610936-5e2b-453e-b22d-616a7b452ed8" />

Apabila pengguna memasukkan kata kunci koleksi yang tidak tersedia, program akan menampilkan pesan "Koleksi tidak ditemukan!" sebagai bentuk validasi agar pengguna tidak bisa mengubah koleksi yang tidak ada.

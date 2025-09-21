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

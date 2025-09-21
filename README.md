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

# Struktur Packages 

Program ini menggunakan pola MVC (Model-View-Controller) agar kode lebih terstruktur, mudah dipelihara, dan jelas pembagian fungsinya.

* **main**: berisi Main.java sebagai titik masuk program yang menampilkan menu dan menerima input pengguna
  
* **model**: berisi class data Alat Makeup.java sebagai superclass dari nama, jenis, merk, dan jumlah. Lipstick.java dan Foundation.java sebagai subclass dengan atribut khusus yaitu warna dan shade.
  
* **service**: berisi KoleksiService.java yang mengatur logika CRUD, validasi input, dan fitur pencarian.

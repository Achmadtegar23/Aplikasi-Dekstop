# 📦 Aplikasi Manajemen Penyewaan Tenda

Aplikasi desktop yang dibangun dengan JavaFX dan Maven untuk mengelola proses bisnis penyewaan tenda. Aplikasi ini bertujuan untuk memudahkan pencatatan data pelanggan, pengelolaan inventaris tenda, serta transaksi peminjaman dan pengembalian.



# ✨ Fitur Utama
* **Manajemen Inventaris:** Tambah, lihat, ubah, dan hapus data tenda yang tersedia.
* **Manajemen Pelanggan:** Mengelola data pelanggan yang melakukan penyewaan.
* **Manajemen Transaksi:** Mencatat transaksi penyewaan dan pengembalian tenda.
* **Pencarian Data:** Fitur pencarian untuk menemukan data tenda atau pelanggan dengan cepat.
* **Antarmuka Intuitif:** Dibangun dengan JavaFX untuk pengalaman pengguna yang responsif di desktop.

# 📸 Tangkapan Layar (Screenshot)
*Sangat disarankan untuk menambahkan beberapa gambar screenshot aplikasi Anda di sini untuk memberikan gambaran visual.*

![Screenshot Halaman Utama](link-ke-screenshot-1.png)
![Screenshot Manajemen Tenda](link-ke-screenshot-2.png)

## 🛠️ Teknologi yang Digunakan
* **Bahasa Pemrograman:** [Java](https://www.java.com/)
* **Framework UI:** [JavaFX](https://openjfx.io/)
* **Build Tool & Dependency Management:** [Apache Maven](https://maven.apache.org/)
* **Database:** Berbasis SQL (misalnya: MySQL, PostgreSQL, SQLite)

# 📂 Struktur Proyek
Proyek ini menggunakan struktur standar Maven untuk aplikasi JavaFX.
```
Aplikasi-Dekstop/
├── .mvn/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/aplikasidekstop/  # <-- Lokasi kode sumber Java
│       │       └── MainApplication.java
│       └── resources/
│           └── com/example/aplikasidekstop/  # <-- Lokasi file FXML & resources (CSS, gambar)
│               └── main-view.fxml
├── sqlmain/                                  # <-- Berisi skrip SQL untuk inisialisasi database
├── .gitignore
├── mvnw                                      # <-- Maven wrapper untuk Linux/macOS
├── mvnw.cmd                                  # <-- Maven wrapper untuk Windows
└── pom.xml                                   # <-- Konfigurasi proyek dan dependensi Maven
```

# 📋 Kebutuhan Sistem
Pastikan perangkat Anda telah terinstal perangkat lunak berikut:
1.  **JDK (Java Development Kit)** versi 17 atau yang lebih baru.
2.  **Apache Maven** (opsional, karena sudah ada Maven Wrapper di proyek ini).
3.  Sistem Manajemen Database (misalnya: XAMPP untuk MySQL, DBeaver, dll).

# 🚀 Cara Menjalankan Proyek

1.  Clone Repositori
    ```bash
    git clone [https://github.com/Achmadtegar23/Aplikasi-Dekstop.git](https://github.com/Achmadtegar23/Aplikasi-Dekstop.git)
    cd Aplikasi-Dekstop
    ```

2.  Pengaturan Database
    - Buka sistem manajemen database Anda (contoh: phpMyAdmin jika menggunakan XAMPP).
    - Buat database baru.
    - Impor skrip SQL yang ada di dalam folder `sqlmain/` ke dalam database yang baru Anda buat.
    - *Catatan: Pastikan untuk menyesuaikan konfigurasi koneksi database (URL, username, password) di dalam kode sumber jika diperlukan.*

3.  Jalankan Aplikasi menggunakan Maven Wrapper
    - Di terminal, jalankan perintah berikut:

    - Untuk pengguna Windows:
      ```bash
      mvnw clean javafx:run
      ```
    - Untuk pengguna Linux/macOS:
      ```bash
      ./mvnw clean javafx:run
      ```
    - Maven akan secara otomatis mengunduh semua dependensi yang dibutuhkan dan menjalankan aplikasi.

## 📄 Lisensi
Proyek ini dilisensikan di bawah [MIT License](LICENSE).

---
_Jika proyek ini bermanfaat, jangan ragu untuk memberikan bintang ⭐!_

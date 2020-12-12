/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penggajian;

/**
 *
 * @author gokpraz
 */
import java.util.*;

public class Penggajian {
   // Implementasi variabel yang digunakan
   
   /**
    * Variabel array untuk menampung data pegawai
    */
   public static String[] pegawai = {
      "Agus Prasetyo", "Eko Prastiyo", "Naruto Uzumaki", "Ahmad Wahyudi", "Rahmad Affandi", "Uchiha Widodo" 
   };
   
   /**
    * Variabel array untuk menampung Gaji Pokok Pegawai
    * Ini nanti diurutkan dari depan ke belakang sesuai nama pegawai
    */
   public static int[] gaji_pokok = {
      1000000, 2000000, 2000000, 2500000, 3000000, 1500000
   };
   
   /**
    * Variabel array untuk menampung Tunjangan Pegawai
    * Ini nanti diurutkan dari depan ke belakang sesuai nama pegawai
    */
   public static int[] tunjangan = {
      500000, 50000, 100000, 200000, 300000, 100000
   };
   
   /**
    * Variabel array untuk menampung Lembur Pegawai
    * Ini nanti diurutkan dari depan ke belakang sesuai nama pegawai
    */
   public static int[] lembur = {
      50000, 50000, 100000, 50000, 100000, 50000
   };
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Scanner sc_string = new Scanner(System.in);
      
      int pilih_menu;
      int index_pilih_pegawai;
      String cari_nama;
      
      do {         
         
         menu();
         System.out.print("Pilih menu yang dipilih (berdasarkan nomer) : ");
         pilih_menu = sc.nextInt();

         switch(pilih_menu){
            case 1:
               // Menampilkan daftar mahasiswa
               daftarPegawai();
            break;

            case 2:
               // Menampilkan daftar mahasiswa
               daftarPegawai();
               
               System.out.println();
               System.out.print("Pilih pegawai yang akan dihitung (berdasarkan nomer) : ");
               index_pilih_pegawai = sc.nextInt();
               
               // memanggil fungsi yang berfungsi untuk menghitung gaji pegawai
               hitungGajiPegawai(index_pilih_pegawai);
            break;

            case 3:
               // Menampilkan daftar mahasiswa
               daftarPegawai();
               
               System.out.println();
               System.out.print("Pilih pegawai yang akan dicetak Slip Gaji (berdasarkan nomer) : ");
               index_pilih_pegawai = sc.nextInt();
               
               // memanggil fungsi untuk mencetak slip gaji
               cetakSlipGaji(index_pilih_pegawai);
            break;

            case 4:               
               System.out.println();
               System.out.println("[ Pencarian Pegawai ]");
               System.out.println();
               
               System.out.print("Cari pegawai berdasarkan nama lengkap : ");
               cari_nama = sc_string.nextLine();
               
               // memanggil fungsi untuk mencari pegawai berdasarkan nama pegawai
               cariNamaPegawai(cari_nama);
            break;

            case 5:
               System.out.println();
               System.out.println("[ Pelaporan ]");
               System.out.println();
               
               // Memanggil fungsi untuk menampilkan laporan
               pelaporan();
            break;

            case 6:
               System.out.println("Terima Kasih");
            break;
         }
         
         // Digunakan agar ada jarak setelah memilih menu
         System.out.println("\n");
      } while(pilih_menu != 6);
   }
   
   /**
    * Digunakan untuk menampilkan menu
    */
   public static void menu()
   {
        System.out.println("==========================================");
        System.out.println("==|    =       PROJECT AKHIR      =    |==");
        System.out.println("             TULIS NAMA DISINI            ");
        System.out.println("==|    =    PROGRAM PENGGAJIAN    =    |==");
        System.out.println("==========================================");
        
        System.out.println("Menu : ");
        System.out.println("1. Daftar Pegawai");
        System.out.println("2. Perhitungan Gaji Pegawai");
        System.out.println("3. Cetak Slip Gaji (Per Pegawai)");
        System.out.println("4. Pencarian Pegawai");
        System.out.println("5. Pelaporan");
        System.out.println("6. Selesai");
        System.out.println();
   }

   
   /**
    * Fungsi yang digunakan untuk menampilkan data pegawai
    */
   public static void daftarPegawai()
   {
      System.out.println();
      System.out.println("[ Daftar Pegawai ]");
      System.out.println();
      
      // Melakukan perulangan berdasarkan jumlah pegawai 
      for (int i = 0; i < pegawai.length; i++) {
         System.out.println(i + 1 + ". " + pegawai[i]);
      }
   }
   
   /**
    * Fungsi ini digunakan untuk menghitung gaji pegawai sesuai dengan pegawai yang dipilih
    * @param index_pegawai 
    */
   public static void hitungGajiPegawai(int index_pegawai)
   {
      // Variabel ini digunakan untuk mengubah variabel yang terdapat di parameter atas
      // Hal ini diperlukan untuk keperluan index array
      int ubah_index_pegawai = index_pegawai - 1;
      int hitung_total_gaji;
      
      System.out.println();

      // Menampilkan rincian gaji sesuai dengan pegawai yang dipilih
      System.out.println("Rincian Gaji :  [ " + pegawai[ubah_index_pegawai] + " ]");
      
      System.out.println();
      
      // Menampilkan data gaji sesuai dengan index pegawai
      System.out.println("------------------------------");
      System.out.println("1. Gaji Pokok : Rp. " + gaji_pokok[ubah_index_pegawai]);
      System.out.println("2. Tunjangan  : Rp. " + tunjangan[ubah_index_pegawai]);
      System.out.println("3. Lembur     : Rp. " + lembur[ubah_index_pegawai]);
      System.out.println("------------------------------");

      // Variabel hitung_total_gaji digunakan untuk menampung dari hasil total gaji yang dihitung
      hitung_total_gaji = gaji_pokok[ubah_index_pegawai] + tunjangan[ubah_index_pegawai] + lembur[ubah_index_pegawai];
      
      // Digunakan untuk menampilkan total gaji
      System.out.println("Total Gaji    : Rp. " + hitung_total_gaji);
      System.out.println("------------------------------");
   }
   
   /**
    * Fungsi ini digunakan untuk mencetak slip gaji sesuai dengan nomer pegawai yang dipilih
    * @param index_pegawai 
    */
   public static void cetakSlipGaji(int index_pegawai)
   {
      // Variabel ini digunakan untuk mengubah variabel yang terdapat di parameter atas
      // Hal ini diperlukan untuk keperluan index array
      int ubah_index_pegawai = index_pegawai - 1;
      
      int hitung_total_gaji;
      
      System.out.println();
      System.out.println("------------------------------");
      System.out.println("       CETAK SLIP GAJI        ");
      System.out.println("------------------------------");
      
      // Menampilkan rincian gaji sesuai dengan pegawai yang dipilih
      System.out.println("Nama Pegawai : " + pegawai[ubah_index_pegawai]);
      System.out.println("------------------------------");
            
      // Menampilkan data gaji sesuai dengan index pegawai
      System.out.println("1. Gaji Pokok : Rp. " + gaji_pokok[ubah_index_pegawai]);
      System.out.println("2. Tunjangan  : Rp. " + tunjangan[ubah_index_pegawai]);
      System.out.println("3. Lembur     : Rp. " + lembur[ubah_index_pegawai]);
      System.out.println("------------------------------");

      // Variabel hitung_total_gaji digunakan untuk menampung dari hasil total gaji yang dihitung
      hitung_total_gaji = gaji_pokok[ubah_index_pegawai] + tunjangan[ubah_index_pegawai] + lembur[ubah_index_pegawai];
      
      // Digunakan untuk menampilkan total gaji
      System.out.println("Total         : Rp. " + hitung_total_gaji);
      System.out.println("------------------------------");  
   }
   
   /**
    * Fungsi ini digunakan untuk mencari pegawai berdasarkan nama lengkap pegawai
    * @param nama_pegawai 
    */
   public static void cariNamaPegawai(String nama_pegawai)
   {
      // Variabel ini digunakan untuk menampung nilai dari pegawai
      int tampung_index_pegawai = 0;
      boolean status_pencarian = false;
      
      // Melakukan perulangan pegawai berdasarkan jumlah pegawai
      for (int i = 0; i < pegawai.length; i++) {
         
         // Melakukan pengecekan terhadap nama pegawai yang diinputkan dengan yang ada di array
         if (nama_pegawai.equalsIgnoreCase(pegawai[i])) {
            tampung_index_pegawai = i;
            status_pencarian = true;
            break;
         }
      }
      
      // Mengecek status pencarian, JIKA STATUS PENCARIAN == TRUE
      // Jika status_pencarian = true maka pegawai yang dicari ada, dan secara otomatis mencetak slip gaji
      // Jika status_pencarian = false maka pegawai yang dicari tidak ada
      if (status_pencarian) {
         // Ini kenapa kok ditambah 1 / + 1 dikarenakan mengikuti yang awal
         // pada fungsi cetakSlipGaji() menggunakan variabel index yang dikurangi 1
         cetakSlipGaji(tampung_index_pegawai + 1);
         
      } else {
         System.out.println("Pegawai tidak ditemukan");
      }
   }
   
   /**
    * Fungsi ini digunakan untuk menampilkan daftar gaji keseluruhan pegawai
    */
   public static void pelaporan()
   {
      // Ini kenapa kok diawali dengan 1 dan <= jumlah pegawai ?
      // Karena menyesuaikan fungsi yang digun akan, karena di fungsi itu berdasarkan nomer dan -1 untuk nomer yang dipilih
      // ingat, index berawal dari 0 bukan 1
      for (int i = 1; i <= pegawai.length; i++) {
         // Memanggil fungsi untuk menamlkan gaji pegawai keseluruhan
         hitungGajiPegawai(i);
         System.out.println();
      }
   }
}
 

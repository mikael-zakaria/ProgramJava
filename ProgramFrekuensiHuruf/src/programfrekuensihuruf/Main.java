package programfrekuensihuruf;

//Digunakan Untuk Memanggil Libray Membaca File dan Exception Handling
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
//      Menyimpan Path File Milik Kita
        String namaFile = "src/Zakaria.txt";
        
//      Buat Variabel Untuk Menyimpan Kalimat Pada File Eksternal
        String kalimat = "";
        
//      Menggunakan Blok Try Karena Untuk Mengatasi Exception Apabila File Tidak Ada
        try {
            
//          Menginstansi Objek bernama myFile
            File myFile = new File(namaFile);
            
//          Menginstansi Objek bernama bacaFile
            Scanner bacaFile = new Scanner(myFile);
            
//          Menampilkan Data File Ke Terminal
            System.out.println("Isi Kalimat Pada File Zakaria.txt : ");
            
//          Perulangan Untuk Menyalin Semua Isi File Zakaria.txt ke variabel data
            while ( bacaFile.hasNextLine() ) {
                kalimat += bacaFile.nextLine();
            }
            
            System.out.println(kalimat + "\n");
            
//          Menginstansi Kelas FrekuensiHuruf menjadi Objek Bernama frekuensi_huruf 
//          sekaligus menginputkan Parameter kalimat
            FrekuensiHuruf frekuensi_huruf = new FrekuensiHuruf(kalimat);
        
//          Lakukan Proses Penghitungan Frekuensi Huruf yang Sama Pada Method hitungFrekuensiHuruf()
            frekuensi_huruf.hitungFrekuensiHuruf();

            System.out.println();
            
        } catch (FileNotFoundException e){
            System.err.println("Terjadi Kesalahan " + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
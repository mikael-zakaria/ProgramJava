package programfrekuensihuruf;

/**
 *
 * @author Mika'el Zakaria
 * 19.28 WIB - 4/10/2021 
 * Surabaya, East Java Indonesia
 * 
 * Ini Merupakan Program Menghitung Jumlah Frekuensi Huruf Yang Sama Pada Kalimat
 * Contoh : Jika Input Kalimat "Saya Mika'el Zakaria" Maka Outputnya : 
                                                                        Huruf a = 6
                                                                        Huruf e = 1
                                                                        Huruf i = 2
                                                                        Huruf k = 2
                                                                        Huruf l = 1
                                                                        Huruf r = 1
                                                                        Huruf y = 1
                                                                        Huruf M = 1
                                                                        Huruf S = 1
                                                                        Huruf Z = 1
 *          
 */

public class FrekuensiHuruf {

//  Membuat Private Atribut/Variabel Untuk Data Input
    private String data_input;

//  Mebuat Konstruktor Untuk Memberi Nilai Pada Atribut Kelas
    public FrekuensiHuruf( String data_input ) {
    
//      Input Data Ke Dalam Atribut Kelas
        this.data_input = data_input;
    
    }
    
//  Buat Method void hitungFrekuensiHuruf
    public void hitungFrekuensiHuruf () {
        
//      Mendeklarasikan char yang berisikan kumpulan huruf a-z dan A-Z
        char[] huruf = {
            'a','b','c','d','e','f','g','h','i','j','k','l',
            'm','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L',
            'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
        };
        
//      Mendeklarasikan int yang berisikan kumpulan Angka 0 Untuk Menghitung Jumlah Huruf Yang Sama
        int[] jumlah = {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,
        };
        
        

//      MAIN LOGIC UNTUK MENGHITUNG HURUF YANG SAMA
        
//      Membuat Perulangan Untuk 
        for (int i=0; i<this.data_input.length(); i++) {
            
//          Membuat Perulangan untuk Menghitung Huruf
            for (int j=0; j<huruf.length; j++) {
                
//              Apabila Huruf Sama Maka Lakukan Penambahan atau +1 Angka Pada Array Jumlah Pada Indeks Sekian 
                if ( this.data_input.charAt(i) == huruf[j] ) {
                    
//                  Lakukan Penambahan
                    jumlah[j] += 1;
                    
                }
                
            }
            
        }
        
//      Digunakan Untuk Menampilkan Huruf Yang Sama
        for (int i=0; i<huruf.length; i++) {
            
//          Apabila jumlah indeks ke i lebih dari 0 maka Tampilkan Hasilnya pada Terminal/CLI 
            if (jumlah[i] > 0) {
                
//              Tampilkan
                System.out.println("Huruf " + huruf[i] + " = " + jumlah[i]);
            
            }
            
        }
        
//      Perulangan Yang Berfungsi Untuk Me-Reset Semua Nilai Pada int jumlah agar Menjadi 0
        for (int i=0; i<jumlah.length; i++){
            
            jumlah[i] = 0;
        
        }
        
    }
    
}

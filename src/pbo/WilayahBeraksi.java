
package pbo;

import java.util.Scanner;

public class WilayahBeraksi {
    public static void main(String[] args) {
        
        try {
            Scanner scanner = new Scanner(System.in);
            
            // Tentukan ukuran array untuk dua data wilayah
            Wilayah[] wilayah = new WilayahLengkap[2];
            
            // Mengisi data wilayah berdasarkan input pengguna
            for (int i = 0; i < wilayah.length; i++) {
                System.out.print("Masukkan Nama Provinsi ke-" + (i + 1) + ": ");
                String provinsi = scanner.nextLine();
                System.out.print("Masukkan Kode Pos ke-" + (i + 1) + ": ");
                String kode = scanner.nextLine();
                
                // Polimorfisme: Objek WilayahLengkap disimpan dalam array tipe Wilayah
                wilayah[i] = new WilayahLengkap(provinsi, kode);
            }
            
            // Menampilkan semua data wilayah yang telah dimasukkan
            for (int i = 0; i < wilayah.length; i++) {
                System.out.println("=============================");
                System.out.println("Data Wilayah Ke " + (i + 1));
                // Polimorfisme: Memanggil metode yang telah di-override
                System.out.println(wilayah[i].tampilkanInfo());
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format Kode Pos: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Number: " + e.getMessage());
        }
    }
}


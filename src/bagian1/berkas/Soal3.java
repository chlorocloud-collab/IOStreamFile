package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Soal3 {
    public static void main(String[] args) {
        File berkas = new File("sementara.txt");
        
        try {
            System.out.println("Sebelum dibuat, sementara.txt ada? " + berkas.exists());
            
            if (berkas.createNewFile()) {
                System.out.println("File sementara.txt berhasil dibuat!");
            } else {
                System.out.println("File sementara.txt sudah ada.");
            }
            
            System.out.println("Setelah dibuat, sementara.txt ada? " + berkas.exists());
            
            if (berkas.delete()) {
                System.out.println("File sementara.txt berhasil dihapus!");
            } else {
                System.out.println("Gagal menghapus sementara.txt");
            }
            
            System.out.println("Setelah dihapus, sementara.txt ada? " + berkas.exists());
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
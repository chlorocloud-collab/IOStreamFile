package bagian1.berkas;

import java.io.File;

public class Soal2 {
    public static void main(String[] args) {
        // Buat objek File untuk folder "arsip"
        File folder = new File("arsip");
        
        // Buat folder dengan mkdir()
        boolean berhasil = folder.mkdir();
        
        // Tampilkan hasil
        if (berhasil) {
            System.out.println("Folder 'arsip' berhasil dibuat!");
            System.out.println("Lokasi: " + folder.getAbsolutePath());
        } else {
            System.out.println("Folder 'arsip' gagal dibuat.");
            System.out.println("Kemungkinan: folder sudah ada.");
        }
    }
}
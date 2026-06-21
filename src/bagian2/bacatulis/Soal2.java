package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Soal2 {
    public static void main(String[] args) {
        // Append 2 nama hari
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("2 nama hari berhasil ditambahkan!");
        } catch (IOException e) {
            System.out.println("Gagal menambah: " + e.getMessage());
        }

        // Tampilkan seluruh isi
        System.out.println("\nSeluruh isi file hari.txt:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            int nomor = 1;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(nomor + ". " + baris);
                nomor++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
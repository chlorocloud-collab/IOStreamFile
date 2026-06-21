package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Soal3 {
    public static void main(String[] args) {
        int jumlah = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlah++;
            }
            System.out.println("Jumlah baris dalam hari.txt: " + jumlah);
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
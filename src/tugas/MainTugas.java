package tugas;

public class MainTugas {
    public static void main(String[] args) {
       

        System.out.println("Nama: Muhammad Rizqy Najamuddin");
        System.out.println("NPM: 2410010368");
        System.out.println();

       
        String[] kategori = {"Alat Tulis", "Kertas", "Perlengkapan"};

        System.out.println("== Daftar Kategori ==");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println();

        
        Gudang gudang = new Gudang("barang.txt");

        
        gudang.tambahBarang(new Barang("Buku", 5000, 10));
        gudang.tambahBarang(new Barang("Pensil", 2000, 25));
        gudang.tambahBarang(new Barang("Penghapus", 1500, 30));
        gudang.tambahBarang(new Barang("Penggaris", 3000, 15));
        gudang.tambahBarang(new Barang("Spidol", 8000, 5));

        
        gudang.tampilkanSemua();
        System.out.println("Total nilai: Rp" + gudang.totalNilai());
        gudang.simpanKeBerkas();

        System.out.println();

        
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        System.out.println("Total nilai: Rp" + gudangBaru.totalNilai());
        System.out.println("Jumlah barang: " + gudangBaru.jumlahBarang());
    }
}
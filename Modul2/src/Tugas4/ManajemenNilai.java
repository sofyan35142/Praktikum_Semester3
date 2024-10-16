package Tugas4;
import java.util.ArrayList;
import java.util.List;

public class ManajemenNilai {
    public static void main(String[] args) {
        String nama = "Ahmad";
        String kelas = "10A";
        List<Double> nilai = new ArrayList<>();
        nilai.add(85.0);
        nilai.add(90.0);
        nilai.add(78.0);

        cetakInfoSiswa(nama, kelas, nilai);
        System.out.println("Rata-rata Nilai: " + hitungRataRata(nilai));
    }

    public static void cetakInfoSiswa(String nama, String kelas, List<Double> nilai) {
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nilai: " + nilai);
    }

    public static double hitungRataRata(List<Double> nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.size();
    }
}

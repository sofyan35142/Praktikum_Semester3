package Tugas4;

import java.util.ArrayList;
import java.util.List;

// Kelas untuk merepresentasikan data siswa
class Siswa {
    private String nama;
    private String kelas;
    private List<Double> nilai;

    // Constructor Siswa
    public Siswa(String nama, String kelas, List<Double> nilai) {
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = nilai;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public List<Double> getNilai() {
        return nilai;
    }

    public void setNilai(List<Double> nilai) {
        this.nilai = nilai;
    }
}

public class ManajementNilaiAfter {
    public static final int MAX_NILAI = 100;

    public static void main(String[] args) {
        List<Double> nilai = new ArrayList<>();
        nilai.add(85.0);
        nilai.add(90.0);
        nilai.add(78.0);

        // Membuat objek Siswa
        Siswa siswa = new Siswa("Ahmad", "10A", nilai);

        // Menampilkan informasi siswa
        tampilkanInformasiSiswa(siswa);

        // Menghitung dan menampilkan rata-rata nilai
        System.out.println("Rata-rata Nilai: " + hitungRataRata(siswa));
    }

    // Refactoring - Rename Method (dari cetakInfoSiswa ke tampilkanInformasiSiswa)
    public static void tampilkanInformasiSiswa(Siswa siswa) {
        System.out.println("Nama Siswa: " + siswa.getNama());
        System.out.println("Kelas: " + siswa.getKelas());
        System.out.println("Nilai: " + siswa.getNilai());
    }

    // Refactoring - Introduce Parameter Object (parameter Siswa)
    public static double hitungRataRata(Siswa siswa) {
        double total = hitungTotal(siswa.getNilai());  // Memanggil metode hitungTotal
        return total / siswa.getNilai().size();
    }

    // Refactoring - Extract Method (hitung total nilai dari daftar nilai)
    public static double hitungTotal(List<Double> nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total;
    }
}

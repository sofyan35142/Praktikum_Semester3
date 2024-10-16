package Tugas3;

public class Pemesanan {
    protected String nama;
    protected String asal;
    protected String tujuan;
    protected double Tiket;
    protected double diskon;

    public Pemesanan(String nama, String aSal, String tujuan, double Tiket, double diskon) {
        this.nama = nama;
        this.asal = aSal;
        this.tujuan = tujuan;
        this.Tiket = Tiket;
        this.diskon = diskon;
    }

    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (diskon / 100));
    }

    public double hitungDiskon() {
        return Tiket * (diskon / 100);
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}

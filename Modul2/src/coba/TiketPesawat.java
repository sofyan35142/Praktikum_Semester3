package coba;

public class TiketPesawat extends pemesanan {

    public TiketPesawat(String nmInfo, String aSal, String dst, double Tiket, double distance) {
        super(aSal, dst, Tiket);
    }

    @Override
    public double hbt() {
        return Tiket - (Tiket * (disk / 100));
    }

    @Override
    public double h() {
        return Tiket * (disk / 100);
    }

    @Override
    public void t() {
        System.out.println("Nama Penumpang: " + nm);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + dst);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + disk + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hbt());
        System.out.println("Jumlah Diskon: " + h());
    }
}

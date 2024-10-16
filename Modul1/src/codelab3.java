public class codelab3 {
    public int perhitunganGaji(int jamkerja, int gajiperJam){
        int gajiTotal = jamkerja * gajiperJam;
        return gajiTotal;
    }
 public static void main(String[] args) {
        codelab3 hitung = new codelab3();

        int gajiTotal = hitung.perhitunganGaji(40,250000);
     System.out.println("Gaji karyawan 40 jam =" + gajiTotal);
 }
}

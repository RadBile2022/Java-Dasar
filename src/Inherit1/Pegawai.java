package Inherit1;

/**
 *
 * @author WahRadar
 */
public class Pegawai {

    // DATA
    private String nama;
    private double gajiPokok;

    // COSNTRUCTOR
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // A. METHOD GETTER
    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    // B. METHOD HITUNG GAJI
    public void hitungGaji() {
        System.out.println("Pegawai \t: Tetap / Reguler");
        System.out.println("Nama     \t: " + getNama());
        System.out.println("Gaji Pokok \t: " + getGajiPokok());
        System.out.println("----------------------------------");
        System.out.println("TOTAL      \t: " + getGajiPokok());
    }

   
}
 
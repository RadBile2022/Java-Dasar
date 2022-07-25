package Inherit1;

/**
 *
 * @author WahRadar
 */
public class Manager extends Pegawai{
    // DATA
    private double tunjangan;

    // CONSTRUCTOR
    public Manager(double tunjangan, String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
        }

    // A. METHOD GETTER

    public double getTunjangan() {
        return tunjangan;
    }
   

    // B. METHOD HITUNG GAJI (OVERRIDE)
    @Override
    public void hitungGaji() {
        System.out.println("Pegawai \t: Manager");
        System.out.println("Nama    \t: " + getNama());
        System.out.println("Gaji Pokok \t: " + getGajiPokok());
        System.out.println("Tunjangan \t: " + getTunjangan());
        System.out.println("-----------------------------------");
        System.out.println("TOTAL : " + (getGajiPokok() + getTunjangan()));
    }
}
 
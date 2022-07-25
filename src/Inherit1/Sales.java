package Inherit1;

/**
 *
 * @author WahRadar
 */
public class Sales extends Pegawai {
    // DATA
    private double bonus;

    // CONSTRUCTOR
    public Sales(double bonus, String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    // A. METHOD GETTER
    public double getBonus() {
        return bonus;
    }

    // B. METHOD HITUNG GAJI (OVERRIDE)
    @Override
    public void hitungGaji() {
        System.out.println("Pegawai \t: Sales");
        System.out.println("Nama     \t: " + getNama());
        System.out.println("Gaji Pokok \t: " + getGajiPokok());
        System.out.println("Bonus     \t: " + getBonus());
        System.out.println("----------------------------------");
        System.out.println("TOTAL      \t: " + (getGajiPokok()+ getBonus()));        
    }
}  
 
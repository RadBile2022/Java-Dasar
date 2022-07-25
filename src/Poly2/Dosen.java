package Poly2;

/**
 * @author WahRadar
 */
public class Dosen extends Peserta{
    private int nidn;
    private String nama;
    private String pangkat;
    private double pajak;

    
    public Dosen(int nidn, String nama, String pangkat, double pajak, int noKupon) {
        super(noKupon);
        this.nidn = nidn;
        this.nama = nama;
        this.pangkat = pangkat;
        this.pajak = pajak;
    }

    public int getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public String getPangkat() {
        return pangkat;
    }

    public double getPajak() {
        return pajak;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nidn=" + nidn + ", nama=" + nama + ", pangkat=" + pangkat + ", pajak=" + pajak + '}';
    }

   
}

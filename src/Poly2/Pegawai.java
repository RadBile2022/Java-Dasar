package Poly2;

/**
 * @author WahRadar
 */
public class Pegawai extends Peserta{
    private int nip;
    private String nama;
    private String jabatan;
    private double pajak;

    public Pegawai(int nip, String nama, String jabatan, double pajak, int noKupon) {
        super(noKupon);
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;
    }

    public int getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getPajak() {
        return pajak;
    }

    @Override
    public String toString() {
        return "Pegawai{" + "nip=" + nip + ", nama=" + nama + ", jabatan=" + jabatan + ", pajak=" + pajak + '}';
    }
    
}

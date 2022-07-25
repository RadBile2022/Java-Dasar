package Poly2;

/**
 * @author WahRadar
 */
public class Mahasiswa extends Peserta{
    private int nim;
    private String nama;
    private String jurusan;
    private double pajak;

    public Mahasiswa(int nim, String nama, String jurusan, double pajak, int noKupon) {
        super(noKupon);
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.pajak = pajak;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getPajak() {
        return pajak;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", jurusan=" + jurusan + ", pajak=" + pajak + '}';
    }
    
    
}

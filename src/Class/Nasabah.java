package Class;

/**
 *
 * @author WahRadar
 */
public class Nasabah {

    // DATA
    private String nama;
    private Rekening rekening;

    // CONSTRUCTOR
    public Nasabah(String nama) {
        this.nama = nama;

    }

    // A. METHOD GETTER
    public String getNama() {
        return nama;
    }

    public Rekening getRekening() {
        return rekening;
    }

    // B. METHOD SETTER
    public void setRekening(Rekening rekening) {
        this.rekening = rekening;
    }
}
 
package Class;

/**
 *
 * @author WahRadar
 */
public class Rekening {

    // DATA
    private double saldo;

    // CONSTRUCTOR
    public Rekening(double saldo) {
        this.saldo = saldo;
    }

    // A. METHOD GETTER
    public double getSaldo() {
        return saldo;
    }

    // B. METHOD SETOR
    public void setor(double jumlah) {
        saldo = saldo + jumlah;
    }

    // C. METHOD TARIK
    public void tarik(double jumlah) {
        saldo = saldo - jumlah;
    }
}
 
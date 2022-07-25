package Class;

/**
 *
 * @author WahRadar
 */
public class Unit_Tes {

    public static void main(String[] args) {
        // REGISTER (INSTANCE OBJECT)
        Nasabah nasabah = new Nasabah("Wahyu Wiradarma");
        Rekening rekening = new Rekening(500000);
        nasabah.setRekening(rekening);

        // CETAK BUKU (PRINTLN)
        System.out.println(nasabah.getNama());
        System.out.println(nasabah.getRekening().getSaldo());

        //SETOR
        nasabah.getRekening().setor(1000000);
        System.out.println(nasabah.getRekening().getSaldo());

        //TARIK
        nasabah.getRekening().tarik(100000);
        System.out.println(nasabah.getRekening().getSaldo());
    }
}
 
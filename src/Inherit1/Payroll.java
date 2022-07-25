package Inherit1;

// *IMPORT DECLARATION AND PACKAGE
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WahRadar
 */
public class Payroll {

    // DATA
    private List<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
    private String desc;

    // CONSTRUCTOR
    public Payroll(String desc) {
        this.desc = desc;
    }

    // A. METHOD GETTER
    public String getDesc() {
        return desc;
    }

    // METHOD ADD PEGAWAI (LIST)
    public void addPegawai(Pegawai p) {
        daftarPegawai.add(p);
    }

    // B. METHOD CETAK SLIP GAJI
    public void cetakSlipGaji() {
        for (Pegawai pegawai : daftarPegawai) {
            System.out.println(getDesc());
            pegawai.hitungGaji();
        }
    }

}



// object pegawai (p) kecil menyerupai daftar pegawai
 
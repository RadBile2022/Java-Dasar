package Inherit1;

/**
 *
 * @author WahRadar
 */
public class Tes_Unit {

    public static void main(String[] args) {
        // Siklus Penggajian
        Payroll payrollDesember2020 = new Payroll("\nGaji Bulan Desember 2020");
        Pegawai p = new Pegawai("Radar", 3000);
        Manager m = new Manager(3000, "Alam", 2000);
        Sales s = new Sales(3000, "Umar", 1000);

        Pegawai p1 = new Pegawai("Radar", 1000);
        Manager m1 = new Manager(3000, "Nurudin", 4000);
        // jika manager maka pajak 20%
        // jika pegawai maka pajak 10%
        Pegawai p2 = m1;// obj asli new manager     I*** 
        // p2 menang undian
        if (p2 instanceof Manager) {
            Manager m3 = (Manager) p2;
            m3.getTunjangan();
            ((Manager) p2).getTunjangan();
            // int pajak = 0.2 * hadiah;
        }

        if (p2 instanceof Pegawai) { // II***
            Pegawai p3 = (Pegawai) p2; // III*** 
        }
        /*
        I***     p2 menang undian (apakah manager / pegawai) apakah p2 seorang 
                 manager, jika manager kembalikan bebani pajak 20%
        II***    Kalau dia ternyata pegawai, maka menjadi pegawai, 
        III***   Maka menjadi object p2 yang sama kalau p2 dia ternyata pegawai,
                 maka dia akan jalan seperti ini, object aslinya p2 object 
                 aslinya new manager, diaplikasi tidak berubah berlaku polymorphism
                 Lalu apakah p2 pegawai, false, kalau salah tidak diproses, 
                 karena dia pegawai bukan manager
         */

        // Adding to List
        payrollDesember2020.addPegawai(p);
        payrollDesember2020.addPegawai(m);
        payrollDesember2020.addPegawai(s);
        payrollDesember2020.addPegawai(p1);
        payrollDesember2020.addPegawai(p2);

        // Cetak Slip
        payrollDesember2020.cetakSlipGaji();

    }
}

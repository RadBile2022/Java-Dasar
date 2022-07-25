package Poly2;

/**
 * @author WahRadar
 */
public class Test2 {
    public static void main(String[] args) {
        // PENDAFTARAN PESERTA FUN BIKE DIES NATALIS UNIV BRA (01 - 30 JUNI 2022) 
        Peserta p1 = new Dosen(1925324332, "Radar", "Professor", 0.15, 5704890);
        Peserta p2 = new Mahasiswa(1924333423, "Akhwat", "Mobile Application", 
                0.05, 5704891);
        Peserta p3 = new Pegawai(1924325343, "Subarkah", "Eselon 5", 0.10, 5704892);
        
        
        
        // EVENT 02 JULI 2022 JAM 08.00
        System.out.println("EVENT DIMULAI");
        
        // 02 JULI 2022 JAM 18.00 UNDIAN
        System.out.println("PEMENANG SEPEDA MOTOR");
        System.out.println("NOMOR UNDIAN : " + p2.getNoKupon());
        
        // dosen pajak 15%, mahasiswa 5%, karyawan 10%
        
        if (p2 instanceof Dosen){
            Dosen d = (Dosen) p2;
            System.out.println(d.toString());
        }else if (p2 instanceof Mahasiswa){
            Mahasiswa m = (Mahasiswa) p2;
            System.out.println(m.toString());
        }
        
               
        if(p2 instanceof Dosen){
            Dosen d = (Dosen) p2;
            System.out.println(d.toString());
        }else if (p2 instanceof Mahasiswa){
            Mahasiswa m = (Mahasiswa) p2;
            System.out.println(m.toString());
        }else if (p2 instanceof Pegawai){
            Pegawai p = (Pegawai) p2;
            System.out.println(p.toString());
        }else {
            System.out.println("Jangan terlalu Ekspektasi dia mau Menerimamu");
        }
    }
}

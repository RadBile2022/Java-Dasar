package Inherit2;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WahRadar
 */
public class Payroll {
    private List<Pegawai> daftarPegawai ;

    public Payroll() {
        daftarPegawai = new ArrayList<>();
    }
    
    void initialPayroll(){
        // load data pegawai dari DB atau file absensi
        addPegawai(new Pegawai("Nurudin", "Santoso",  1000));
    }
    
    public void addPegawai(Pegawai pegawai){
        daftarPegawai.add(pegawai);
    }
    
    public void cetakGaji(){
        for (int i =0; i<daftarPegawai.size();i++){
            Pegawai pegawai = daftarPegawai.get(i);
            pegawai.bayarGaji();
        }
    }
    
}

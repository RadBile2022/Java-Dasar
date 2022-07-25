package Inherit2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WahRadar
 */
public class Harian extends Pegawai {
    private double gajiPerHari;
    private double masukKerja;

    public Harian(double gajiPerHari, String firstName, String lastName) {
        super(firstName, lastName);
        this.gajiPerHari = gajiPerHari;
        masukKerja =0;
    }
    
    public void setMasukKerja(int masukKerja){
        this.masukKerja = masukKerja;
    }
    
    @Override
    public void bayarGaji(){
        System.out.println("Detail Pembayaran Gaji Staff Harian");
        System.out.println("--------------------------------------");
        System.out.println("Nama : \t\t" + super.getFirstName() + super.getLastName());
        System.out.println("Gaji Pokok : \t" +  super.getGaji());
        System.out.println("Total Gaji : \t" + (gajiPerHari*masukKerja));
        System.out.println();
    }
    
    public void bayarGaji(int masukKerja){
        System.out.println("Detail Pembayaran Gaji Staff Harian");
        System.out.println("--------------------------------------");
        System.out.println("Nama : \t\t" + super.getFirstName() + super.getLastName());
        System.out.println("Gaji Pokok : \t" +  super.getGaji());
        setMasukKerja(masukKerja);
        System.out.println("Masuk Kerja : \t" + masukKerja);
        System.out.println("Total Gaji : \t" + (gajiPerHari*masukKerja));
        System.out.println();
    }
    
}

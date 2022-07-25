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
public class Sales extends Pegawai{
    private double bonus;

    public Sales(String firstName, String lastName,  double gaji) {
        super(firstName, lastName,  gaji);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void bayarGaji() {
        System.out.println("Detail Pembayaran Gaji Staff Sales");
        System.out.println("--------------------------------------");
        System.out.println("Nama : \t\t" + super.getFirstName() + super.getLastName());
        System.out.println("Gaji Pokok : \t" +  super.getGaji());
        System.out.println("Total Gaji : \t" + (super.getGaji()+bonus));
        System.out.println();
    }
    
    public void bayarGaji(double bonus) {
        System.out.println("Detail Pembayaran Gaji Staff Sales");
        System.out.println("--------------------------------------");
        System.out.println("Nama : \t\t" + super.getFirstName() + super.getLastName());
        System.out.println("Gaji Pokok : \t" +  super.getGaji());
        setBonus(bonus);
        System.out.println("Bonus bulan ini : \t" + bonus);
        System.out.println("Total Gaji : \t" + (super.getGaji()+bonus));
        System.out.println();
    }
    
    
}

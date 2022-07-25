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
public class Pegawai {
    private String firstName;
    private String lastName;
    private String nip;
    private double gaji;

    public Pegawai(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Pegawai(String firstName, String lastName, double gaji) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gaji = gaji;
    }
    
    public void bayarGaji(){
        System.out.println("Detail Pembayaran Gaji Staff Bulanan");
        System.out.println("--------------------------------------");
        System.out.println("Nama : \t\t" + firstName + lastName);
        System.out.println("Gaji Pokok : \t" +  gaji);
        System.out.println("Total Gaji : \t" + gaji);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNip() {
        return nip;
    }

    public double getGaji() {
        return gaji;
    }
    
    
    
    
}

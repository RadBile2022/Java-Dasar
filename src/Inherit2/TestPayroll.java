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
public class TestPayroll {
    public static void main(String[] args) {
        Payroll payrollJuli2022= new Payroll();
        payrollJuli2022.initialPayroll();
        
        Sales sales = new Sales("Arief", "Setiyawan", 500);
        sales.setBonus(2000);
        payrollJuli2022.addPegawai(sales);
        
        Harian harian = new Harian(100, "Ahmad", "Ahua");
        harian.setMasukKerja(4);
        payrollJuli2022.addPegawai(harian);
        payrollJuli2022.cetakGaji();
    }
}

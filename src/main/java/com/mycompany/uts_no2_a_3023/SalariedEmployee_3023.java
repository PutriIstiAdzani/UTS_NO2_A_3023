/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3023;

/**
 *
 * @author Fajar
 */
public class SalariedEmployee_3023 extends Employee_3023 implements InterfaceEmployee_3023 {
    private long upahMingguan_3023;
    long gaji_3023;
    
    public SalariedEmployee_3023 (String nama_3023, String nip_3023, long upahMingguan_3023){
        super(nama_3023, nip_3023);
        this.upahMingguan_3023 = upahMingguan_3023;
    }
    
    public void hitungGaji_3023(){
        gaji_3023 = upahMingguan_3023;
        System.out.println("Total Gaji          : Rp"+gaji_3023);
    }
    
    public void cetakInfo_3023(){
        System.out.println("Nama                : "+nama_3023);
        System.out.println("NIP                 : "+nip_3023);
        System.out.println("Upah Mingguan       : Rp"+upahMingguan_3023);
        hitungGaji_3023();
        System.out.println(" ");
    }
}

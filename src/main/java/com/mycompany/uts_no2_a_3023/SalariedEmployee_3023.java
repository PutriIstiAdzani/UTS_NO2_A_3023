/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3023;

/**
 *
 * @author Fajar
 */
public class SalariedEmployee_3023 extends Employee_3023{
    long upahMingguan_3023;
    long gaji_3023;
    
    public SalariedEmployee_3023(){
        
    }
    
    public void SalariedEmployee_3023(String nama_3023, int nip_3023, long upahMingguan_3023){
        this.nama_3023 = nama_3023;
        this.nip_3023 = nip_3023;
        this.upahMingguan_3023 = upahMingguan_3023;
    }
    
    public void HitungGaji_3023(){
        gaji_3023 = upahMingguan_3023;
        System.out.println("Gaji : "+gaji_3023);
    }
    
    public void cetakSalariedEmployee(){
        System.out.println("Nama    : "+nama_3023);
        System.out.println("NIP : "+nip_3023);
        System.out.println("Upah Mingguan : "+upahMingguan_3023);
        HitungGaji_3023();
        System.out.println(" ");
    }
}

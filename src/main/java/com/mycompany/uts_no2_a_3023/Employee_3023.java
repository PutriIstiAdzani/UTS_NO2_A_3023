/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3023;

/**
 *
 * @author Fajar
 */
public class Employee_3023 {
    String nama_3023;
    int nip_3023;
    long gajiPokok_3023;
    long komisi_3023;
    
    public Employee_3023(){
        
    }
    
    public Employee_3023(String nama_3023, int nip_3023, long gajiPokok_3023, long komisi_3023){
        this.nama_3023 = nama_3023;
        this.nip_3023 = nip_3023;
        this.gajiPokok_3023 = gajiPokok_3023;
        this.komisi_3023 = komisi_3023;
    }
    
    public void tampilInfo(){
        System.out.println("Nama    : "+nama_3023);
        System.out.println("NIP : "+nip_3023);
        System.out.println("Gaji Pokok  : "+gajiPokok_3023);
        System.out.println("Komisi  : "+komisi_3023);
    }
}


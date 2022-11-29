/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3023;

/**
 *
 * @author Fajar
 */
public class ProjectPlanner_3023 extends Employee_3023 {
    long totalHasilProyek_3023;
    long gaji_3023;
    
    public ProjectPlanner_3023(){
        
    }
    
    public void ProjectPlanner_3023(String nama_3023, int nip_3023, long gajiPokok_3023, long komisi_3023, long totalHasilProyek_3023){
        this.nama_3023 = nama_3023;
        this.nip_3023 = nip_3023;
        this.gajiPokok_3023 = gajiPokok_3023;
        this.komisi_3023 = komisi_3023;
        this.totalHasilProyek_3023 = totalHasilProyek_3023;
    }
    
    public void HitungGaji_3023(){
        gaji_3023 = (long) (gajiPokok_3023 + (komisi_3023 * totalHasilProyek_3023) - 0.05);
        System.out.println("Gaji    : "+gaji_3023);
    }
    
    public void cetakProjectPlanner_3023(){
        System.out.println("Nama    : "+nama_3023);
        System.out.println("NIP : "+nip_3023);
        System.out.println("Gaji Pokok  : "+gajiPokok_3023);
        System.out.println("Komisi  : "+komisi_3023);
        System.out.println("Total Hasil Proyek  : "+totalHasilProyek_3023);
        HitungGaji_3023();
        System.out.println(" ");
    }
}

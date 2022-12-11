/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3023;

/**
 *
 * @author Fajar
 */
public class ProjectPlanner_3023 extends Employee_3023 implements InterfaceEmployee_3023 {
    private long gajiPokok_3023, komisi_3023;
    private int totalHasilProyek_3023;
    float pajak_3023;
    long gaji_3023;
    
    public ProjectPlanner_3023 (String nama_3023, String nip_3023, long gajiPokok_3023, long komisi_3023, int totalHasilProyek_3023){
        super(nama_3023, nip_3023);
        this.gajiPokok_3023 = gajiPokok_3023;
        this.komisi_3023 = komisi_3023;
        this.totalHasilProyek_3023 = totalHasilProyek_3023;
    }
    
    public void setGajiPokok_3023 (long gajiPokok_3023){
        this.gajiPokok_3023 = gajiPokok_3023;
    }
    
    public void setKomisi_3023 (long komisi_3023){
        this.komisi_3023 = komisi_3023;
    }
    
    public void setTotalPenjualan_3023 (int totalPenjualan_3023){
        this.totalHasilProyek_3023 = totalHasilProyek_3023;
    }
    
    public long getGajiPokok_3023(){
        return gajiPokok_3023;
    }
    
    public long getKomisi_3023(){
        return komisi_3023;
    }
    
    public int totalHasilProyek_3023(){
        return totalHasilProyek_3023;
    }
    
    public void hitungGaji_3023(){
        pajak_3023 = (float) (0.05 * gajiPokok_3023);
        gaji_3023 = (int) (gajiPokok_3023 + (komisi_3023 * totalHasilProyek_3023) - pajak_3023);
        System.out.println("Total Gaji          : Rp"+gaji_3023);
    }
    
    public void cetakInfo_3023(){
        System.out.println("Nama                : "+nama_3023);
        System.out.println("NIP                 : "+nip_3023);
        System.out.println("Gaji Pokok          : Rp"+gajiPokok_3023);
        System.out.println("Komisi              : Rp"+komisi_3023);
        System.out.println("Total Hasil Proyek  : "+totalHasilProyek_3023);
        hitungGaji_3023();
        System.out.println(" ");
    }
}

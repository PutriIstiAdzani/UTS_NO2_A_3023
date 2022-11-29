/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_a_3023;

/**
 *
 * @author Fajar
 */
public class UTS_NO2_A_3023 {

    public static void main(String[] args) {
       // Employee_3023 E = new Employee_3023();
        SalariedEmployee_3023 SE = new SalariedEmployee_3023();
        CommissionEmployee_3023 CE = new CommissionEmployee_3023();
        ProjectPlanner_3023 PP = new ProjectPlanner_3023();
        
        SE.SalariedEmployee_3023("Putri", 21103023, 250000);
        CE.CommissionEmployee_3023("Clarissa", 21103024, 450000, 200000, 20);
        PP.ProjectPlanner_3023("Achasyaa", 21103025, 550000, 250000, 5);
        System.out.println("\n\n== DATA PERUSAHAAN ==");
        SE.cetakSalariedEmployee();
        CE.cetakCommissionEmployee_3023();
        PP.cetakProjectPlanner_3023();
                
    }
}

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
      SalariedEmployee_3023 SE = new SalariedEmployee_3023 ("Adzani", "SI21103023", 500000);
      CommissionEmployee_3023 CE = new CommissionEmployee_3023 ("Jesamyn", "SI20103451", 550000, 200000, 6);
      ProjectPlanner_3023 PP = new ProjectPlanner_3023 ("Lalisa", "SI22103104", 450000, 350000, 4);
      
        System.out.println("===== DATA SALARIED EMPLOYEE =====");
        SE.cetakInfo_3023();
        System.out.println(" ");
        System.out.println("===== DATA COMMISSION EMPLOYEE =====");
        CE.cetakInfo_3023();
        System.out.println(" ");
        System.out.println("===== DATA PROJECT PLANNER =====");
        PP.cetakInfo_3023();
        System.out.println(" ");   
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20211215.ch10_7_report;
import ch10_20211215.ch10_6_erp1.Erp;
/**
 *
 * @author xvpow
 */
public class Report extends Erp {
    public void reportStyle(String[] data){
        int count = 1;
        for (String d : data){
             System.out.print(d+" ");
            if (count  % 2 == 0){
                System.out.println();
            }    
            count++;
        }
    }
}

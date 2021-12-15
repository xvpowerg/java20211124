/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20211215.ch10_6_erp1;

/**
 *
 * @author xvpow
 */
import java.util.Random;
public abstract class Erp {
    private String[] data = new String[5];
    {
        Random ran = new Random();
        //隨機產生五筆字串資料
        for(int i = 0; i < data.length;i++){
            data[i] = ran.nextInt(1000)+"";
        }        
    }
    
    protected String[] getData(){
        return data;
    }
    
    public abstract void reportStyle(String[] data);
    
    public void exportReport(){
        //連資料庫
        //ERP設定
            reportStyle(getData());
    }
}

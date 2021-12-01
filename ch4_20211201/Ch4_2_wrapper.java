/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20211201;
/**
 *
 * @author xvpow
 */
public class Ch4_2_wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //基本型態    包裝類別
       // byte       Byte 
       // short      Short
       // int        Integer
       // long        Long
       // float       Float
       // double      Double
       // char        Character
       // boolean     Boolean
        
       //封箱
       //因為有一些結構不能夠放基本型態 所以將基本型態轉為參考
       //解封箱
       //封箱內的元素取出
       //手動封箱       
       Integer v1 =  Integer.valueOf(25);
       //手動解封箱
       int v2 = v1.intValue();
       System.out.println(v2);
        
       //自動封箱
       Integer v3 = 25;
       Integer v4 = 12;
       //自動解封箱
       int v5 = v3;
       int v6 = v3 + v4;
       System.out.println(v5+":"+v6);
       
       
       
    }
    
}

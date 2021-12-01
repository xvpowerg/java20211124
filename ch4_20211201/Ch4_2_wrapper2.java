/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20211201;
/**
 *
 * @author xvpow
 */
public class Ch4_2_wrapper2 {

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
        
//       Integer v1 = null;
//       int v2 = v1;//因為呼叫v1.intValue() v1是null 所以拋出java.lang.NullPointerException
//       System.out.println(v2);
       //v2 是 null 或 0 ????
       
       
       Integer v3 = 10;
       Integer v4 = 10;
       System.out.println(v3 == v4);       
       Integer v5 = 128;
       Integer v6 = 128;
       System.out.println(v5 == v6);
        System.out.println(v5.equals(v6));
        
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20211201;
/**
 *
 * @author xvpow
 */
public class Ch4_2_wrapper4 {

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
        
        boolean b1 = Boolean.valueOf("true");
        System.out.println(b1);
        boolean b2 = Boolean.valueOf("false");
        System.out.println(b2);
        boolean b3 = Boolean.valueOf("true");//只要不適連續的true一律回傳false
        System.out.println(b3);
        
    }
    
}

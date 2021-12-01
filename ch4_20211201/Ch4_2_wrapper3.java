/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20211201;
/**
 *
 * @author xvpow
 */
public class Ch4_2_wrapper3 {

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
        
       //字串轉數字
       String data = "123";
       int v1 = Integer.parseInt(data);
       System.out.println(data+1);
       System.out.println(v1+1);
        //轉換進制
       String b1 = Integer.toBinaryString(123);
       String h1 = Integer.toHexString(123);//16進位
       String o1 = Integer.toOctalString(123);//8進位
       System.out.println(b1);
       System.out.println(h1);
       System.out.println(o1);
       
    }
    
}

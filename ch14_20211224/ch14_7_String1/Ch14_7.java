/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20211224.ch14_7_String1;

/**
 *
 * @author xvpow
 */
public class Ch14_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s1 = "abcdef";
       for (int i =0; i < s1.length();i++){
           System.out.println(s1.charAt(i));
       }
       
       byte[] byArray = s1.getBytes();
       for (byte b : byArray){
           System.out.print(b+" ");
       }
         System.out.println();
         
       String s2 = s1.concat("ghijk");
       System.out.println(s2);
       System.out.println(s1);         
      //如果沒有回傳-1
      //如果有回傳index
       int index =  s1.indexOf("d");
       System.out.println(index);
       index =  s1.indexOf("g");    
       System.out.println(index);
       
       String keys = "ken, vivin, lucy,lindy";
       String[] kyeArray = keys.split(",");
       for (String k : kyeArray){
           //trim 去除前後空白
           System.out.println(k.trim());
       }
              
    }
    
}

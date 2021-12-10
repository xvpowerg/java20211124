/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20211210.ch8_5_override_object;

/**
 *
 * @author xvpow
 */
public class Ch8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1("Test1",10);
        Test1 t2= new Test1("Test1",10);
        String s1 = "AB";
        String s2 = new String("AB");
        System.out.println(t1);
        System.out.println(t1.getClass().getName()+"@"+
                Integer.toHexString(t1.hashCode()));
        
        //System.out.println(t2);      
        System.out.println(s1.equals(s2));
        System.out.println(t1.equals(t2));
    }
    
}

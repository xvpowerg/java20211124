/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20211213.Ch9_1_equals;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1("Ken",123);
        Test1 t2 = new Test1("Vivin",123);
        Test1 t3 = new Test1("Ken",123);
        Object obj = new Object();
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(obj));
        System.out.println(t1.equals(t3));
    }
    
}

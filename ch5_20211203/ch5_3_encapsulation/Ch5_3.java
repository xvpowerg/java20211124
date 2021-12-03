/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20211203.ch5_3_encapsulation;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Product pr1 = new Product();
    // pr1.name = "PS6";
    pr1.setName("iPad");
     pr1.setPrice(4350);
     //pr1.price = 4350;
     pr1.print();
     
     Product pr2 = new Product("switch",56000);
     pr2.print();
    }
    
}

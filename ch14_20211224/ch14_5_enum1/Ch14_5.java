/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20211224.ch14_5_enum1;

public class Ch14_5 {
    enum Fruit{
        APPLE,BANANA,KIWI
    }
    
    public static void main(String[] args) {
        Fruit f1 = Fruit.BANANA;
        switch(f1){
            case APPLE:
                System.out.println("apple!!");
                break;
            case BANANA:
                System.out.println("banana!!");
                break;
            case KIWI:
                System.out.println("kiwi!!");
                break;
            default:
                System.out.println("Error!!");
                break;
        }       
    }
    
}

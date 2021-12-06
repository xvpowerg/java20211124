/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_1_20211206_extend;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.setName("Bobo");
        a1.setHeight(5);
        a1.setWeight(1.5f);
        a1.print();
        
        Animal a2 = new Animal("Momo",20,5f);
        a2.print();
        
        Dog dog1 = new Dog();
        dog1.setName("Money");
        dog1.setHeight(3);
        dog1.setWeight(6);
        dog1.print();
        
        Dog dog2 = new Dog("Nana",10,25f);
        dog2.print();
        
       Cat c1 = new Cat("Kitty",10,5f);
       c1.print();
       
       
    }

}

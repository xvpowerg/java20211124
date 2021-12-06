/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_2_20211206_poly;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {
    //多形 Polymorphic
    static void printAnimal(Animal ... animals){
        for (Animal animal : animals){
            animal.print();
        }
    }

    
    public static void main(String[] args){
         Dog dog1 = new Dog("Money",3,6f);                
         Dog dog2 = new Dog("Nana",10,25f);
         
         Cat cat1 = new Cat("Kitty",6,10f);
         printAnimal(dog1,dog2);
         printAnimal(cat1);
         
          //多形 Polymorphic
         Animal animal  = new Dog("Lulu",2,6f);
         animal.print();
         
    }
}

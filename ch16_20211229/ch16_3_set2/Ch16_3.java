/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20211229.ch16_3_set2;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch16_3 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Entity> entitySet = new HashSet<>();
        Entity e1 = new Entity(10,"A");
        Entity e2 = new Entity(10,"A");
        Entity e3 = new Entity(15,"B");
        Entity e4 = new Entity(18,"C");
        Entity e5 = new Entity(20,"G");
        System.out.println(e1.equals(e2));
        entitySet.add(e1);
        entitySet.add(e2);
        entitySet.add(e3);
        entitySet.add(e4);
        entitySet.add(e5);
        entitySet.forEach(e->System.out.println(e));
        
    }
    
}

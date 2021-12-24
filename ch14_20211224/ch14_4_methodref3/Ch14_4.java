/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20211224.ch14_4_methodref3;
import java.util.function.Function;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch14_4 {
    
    public static void main(String[] args) {
        Person p1 = new Person("Ken");
        System.out.println(p1);
        
        Function<String,Person> fun1 = (s)->new Person(s);
        System.out.println(fun1.apply("Lucy"));
        
        Function<String,Person> fun2 = Person::new;
        System.out.println(fun2.apply("Iris"));
        
        Supplier<Person> supp = Person::new;
        Person p =   supp.get();
        p.setName("Vivin");
        System.out.println(p);
    }
    
}

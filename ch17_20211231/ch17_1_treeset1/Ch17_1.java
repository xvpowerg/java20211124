/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20211231.ch17_1_treeset1;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch17_1 {
    public static void main(String[] args) {
        Student.setSortType(Student.SORT_TYPE_DESC);
      Student st1 = new Student("Ken",16,58);
      Student st2 = new Student("Vivin",20,92);
      Student st3 = new Student("Lindy",25,86);
      Student st4 = new Student("Joy",31,95);
      Student st5 = new Student("Lucy",25,92);
      Student st6 = new Student("Iris",25,92);
      
      TreeSet<Student> stTreeSet = new TreeSet<>();
      stTreeSet.add(st1);
      stTreeSet.add(st2);
      stTreeSet.add(st3);
      stTreeSet.add(st4);
      stTreeSet.add(st5);
      stTreeSet.add(st6);
      
      //System.out.println(st1);
      stTreeSet.forEach(st->System.out.println(st));
    }
    
}

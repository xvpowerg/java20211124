/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20211224.ch14_3_methodref2;

import ch14_20211224.ch14_1_lambda1.Student;
import java.util.function.Consumer;

/**
 *
 * @author xvpow
 */
public class Ch14_3 {
    
   static void foreachStudent(Student[] st,
           Consumer<Student> stcu){              
        for(Student s : st){
            stcu.accept(s);
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student("Ken",20);
        Student st2 = new Student("Vivin",16);
        Student st3 = new Student("Lindy",18);
        Student[] stArray = {st1,st2,st3};
        StudentPrintInfo spi = new StudentPrintInfo("學生");
        foreachStudent(stArray,spi::printStudent);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20211224.ch14_2_methodref1;
import java.util.function.Consumer;
import ch14_20211224.ch14_1_lambda1.Student;
/**
 *
 * @author xvpow
 */
public class Ch14_2 {
   static void printStudent(Student st){
       String upName = st.getName().toUpperCase();
            int age = st.getAge();
            if (age >= 18){
                System.out.println(upName+"成年");
            }else{
                System.out.println(upName+"未成年");
            }
   }    
    static void foreachStudent(Student[] st,Consumer<Student> stcu){              
        for(Student s : st){
            stcu.accept(s);
        }
    }
    
    public static void main(String[] args) {
        Student st1 = new Student("Ken",20);
        Student st2 = new Student("Vivin",16);
        Student st3 = new Student("Lindy",18);
        Student[] stArray = {st1,st2,st3};
        foreachStudent(stArray,(st)->{
            String upName = st.getName().toUpperCase();
            int age = st.getAge();
            if (age >= 18){
                System.out.println(upName+"成年");
            }else{
                System.out.println(upName+"未成年");
            }
        });
        System.out.println("====================");
        foreachStudent(stArray,Ch14_2::printStudent);
    }
    
}


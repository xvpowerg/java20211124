/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20211224.ch14_3_methodref2;
import ch14_20211224.ch14_1_lambda1.Student;

public class StudentPrintInfo {
    private String title;
    public StudentPrintInfo(String title){
        this.title = title;
    }    
   void printStudent(Student st){
       String upName = st.getName().toUpperCase();
            int age = st.getAge();
            if (age >= 18){
                System.out.println(title+":"+upName+"成年");
            }else{
                System.out.println(title+":"+upName+"未成年");
            }
   }  
}

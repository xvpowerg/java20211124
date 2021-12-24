/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20211224.ch14_1_lambda1;
import java.util.function.BiFunction;
/**
 *
 * @author xvpow
 */
public class C14_1 {
    
    public static Student[] marge(BiFunction<Integer[] ,
            String[],
            Student[]> stf,
            Integer[] ages,String[] names){
            return stf.apply(ages, names);
    }
    
    public static void main(String[] args) {
        String[] names = {"Ken","Vivin","Lindy"};
        Integer[] ages = {25,18,32};
        
      Student[] stArray =   marge(new BiFunction<Integer[],String[], Student[]>(){
            public Student[] apply(Integer[] age,String[] names){
                Student[] stArray = new Student[age.length];
                for (int i = 0; i < age.length;i++){
                    int a = age[i];
                    String n = names[i];
                    stArray[i] = new Student(n,a);
                }                    
                return stArray;
            }
        },ages,names);
        
      for (Student st : stArray){
          System.out.println(st);
      }      
         System.out.println("========================");
       Student[] stArray2 =   marge((a,n)->{
         Student[] result = new Student[a.length];  
         for (int index = 0;index < a.length;index++)
           result[index] =new Student(n[index],a[index])  ;

         return result;
       },ages,names);
       
       for (Student st2 : stArray2){
           System.out.println(st2);
       }
    }
    
}

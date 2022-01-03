/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20210103.ch18_3_map3;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student(1,75);
        Student st2 = new Student(1,83);
        Student st3 = new Student(2,62);
        Student st4 = new Student(2,94);
        Student st5 = new Student(3,72);
        Student st6 = new Student(3,66);
        Student st7 = new Student(5,22);
        
       ArrayList<Student> list = new ArrayList<>();
       list.add(st1);
       list.add(st2);
       list.add(st3);
       list.add(st4);
       list.add(st5);
       list.add(st6);
       list.add(st7);
       
       HashMap<Integer,Integer> scoreMap = new HashMap<>();
       for (Student st : list){
           int id = st.getId();
           int score = 0;
           if (scoreMap.containsKey(id)){
              score =  scoreMap.get(id);
           }
           score += st.getScore();
           scoreMap.put(st.getId(),score);
           
       }
       System.out.println(scoreMap);
    }
    
}

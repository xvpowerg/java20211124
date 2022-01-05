/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220105.ch19_1_map1;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_1 {
    
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
        HashMap<Integer,ArrayList<Student>> stMap = new HashMap();
//        for (Student st : list){
//              stMap.computeIfAbsent(st.getId(), (id)->{
//                ArrayList<Student> arrayList = new ArrayList<>();
//                arrayList.add(st);
//                return arrayList;
//            }); 
//            stMap.computeIfPresent(st.getId(), (k,v)->{
//                            v.add(st);
//              return v;              
//            });
//        }
        
        for (Student st : list){
            ArrayList<Student> stList= new ArrayList<>();
            stList.add(st);
            
            stMap.merge(st.getId(), stList, (ov,nv)->{
                ov.addAll(nv);
                return ov;
            });        
        }        
        System.out.println(stMap);
    }
    
}

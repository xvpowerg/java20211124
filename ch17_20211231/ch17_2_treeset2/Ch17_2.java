/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20211231.ch17_2_treeset2;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch17_2 {

    private static  class MyCmp  implements Comparator<Student>{
        public static final int ASC = 1;
        public static final int DESC = -1;
        private int type =1;
        private MyCmp(int type){
            this.type = type;
        }
        public int compare(Student st1,Student st2){
            int cmpResult = 1;
            if (st1.getAge() > st2.getAge()){
               cmpResult = 1;
            }else if(st1.getAge() < st2.getAge()){
               cmpResult = -1;
            }else if(st1.getScore() > st2.getScore()){
                cmpResult = 1;
            }else if (st1.getScore() < st2.getScore()){
                cmpResult = -1;
            }else{
                cmpResult = st1.getName().compareTo(st2.getName());
            }
           return cmpResult * type; 
        }
    }
    public static void main(String[] args) {
      Student st1 = new Student("Ken",16,58);
      Student st2 = new Student("Vivin",20,92);
      Student st3 = new Student("Lindy",25,86);
      Student st4 = new Student("Joy",31,95);
      Student st5 = new Student("Lucy",25,92);
      Student st6 = new Student("Iris",25,92);
      //大到小......
      MyCmp mycmp = new MyCmp(MyCmp.ASC);
      //TreeSet<Student> stTreeSet = new TreeSet<>(mycmp);
//      TreeSet<Student> stTreeSet = new TreeSet<>((v1,v2)->{
//            if (v1.getAge() > v2.getAge() || 
//                    v1.getScore() > v2.getScore()){
//                return 1;
//            }else if(v1.getAge() < v2.getAge() || 
//                    v1.getScore() < v2.getScore()){
//                    return -1;
//            }              
//            return v1.getName().compareTo(v2.getName());
//      });
        Comparator<Student> cmp= 
                Comparator.comparing(st->st.getAge());        
        cmp = cmp.thenComparing(st->st.getScore());
        cmp = cmp.thenComparing(Student::getName);    
        cmp = cmp.reversed();
      TreeSet<Student> stTreeSet = new TreeSet<>(cmp);
      stTreeSet.add(st1);
      stTreeSet.add(st2);
      stTreeSet.add(st3);
      stTreeSet.add(st4);
      stTreeSet.add(st5);
      stTreeSet.add(st6);
      
      stTreeSet.forEach(st->System.out.println(st));
      
    }
}

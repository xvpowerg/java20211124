/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20211203.ch5_2_oo1;


public class Ch5_2 {

    /**
     * @param args the command line arguments
     */
    static void print(Student st){
       System.out.println(st.id+":"+st.name+":"+st.score); 
    }
    static void initStudent(Student st,String id,String name,int score){
          st.id = id;
          st.name = name;
          st.score = score;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1;
          st1 = new Student();  
//          st1.id = "A0001";
//          st1.name = "Ken";
//          st1.score = 75;
          //B0002  Lucy 93
        //System.out.println(st1.id+":"+st1.name+":"+st1.score);
        initStudent(st1, "A0001", "Ken", 75);
        print(st1);
        st1.print();
        
        Student st2 = new Student();
        st2.id = "B0002";
        st2.name = "Lucy";
        st2.score = 93;
        //System.out.println(st2.id+":"+st2.name+":"+st2.score);
         // print(st2);
       st2.print();
    }
    
}

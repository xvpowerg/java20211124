/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20211231.ch17_1_treeset1;
public class Student implements Comparable<Student> {
    public static int SORT_TYPE_ASC = 1;
    public static int SORT_TYPE_DESC = -1;
    private static int sortType = SORT_TYPE_ASC;
    
    public static void setSortType(int sortType){
        Student.sortType = sortType;
    }
    private String name;
    private int age;
    private int score;
    //小到大排序法
    //目前物件大於傳入的物件 回傳正數
    //目前物件小於傳入的物件 回傳負數
    //目前物件等於傳入的物件 回傳零
    public int compareTo(Student st){
        if(this.score > st.score ){
            return 1 * Student.sortType ;
        }else if(this.score < st.score){
            return -1* Student.sortType ;
        }else if(this.age > st.age){
            return 1* Student.sortType ;
        }else if(this.age < st.age){
            return -1* Student.sortType ;
        }        
        return this.name.compareTo(st.name)* Student.sortType ;
    }
    public Student(){}
    public Student(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }    
    public int getScore(){
        return this.score;
    }    
    public String toString(){
        return this.getName()+" Score:"+getScore()+" Age:"+getAge();
    }

}

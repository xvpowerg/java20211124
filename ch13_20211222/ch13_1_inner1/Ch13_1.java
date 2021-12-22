/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20211222.ch13_1_inner1;

/**
 *
 * @author xvpow
 */
public class Ch13_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student("Ken"){
            public void skill(){
                System.out.println(getName()+":"+"程式設計");
            }
        };
        st1.skill();
        
        Adapter adapter = new Adapter(){
            String[] data;
            public void data(String[] data){
                this.data = data;
            }
            public void showData(){
                for (String d : data){
                    System.out.println(d);
                }
            }
        };
        adapter.data(new String[]{"Ken","Vivin","Lucy"});
        adapter.showData();
    }
    
}

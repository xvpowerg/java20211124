/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20211231.ch17_3_test_iterable;

/**
 *
 * @author xvpow
 */
public class Ch17_3 {

    public static void main(String[] args) {
      MyList myList = new MyList();
      myList.add("Ken");
      myList.add("Vivin");
      myList.add("Lindy");
      for (int i = 0; i < myList.size();i++){
          System.out.println(myList.get(i));
      }
//      
System.out.println("==============================");
      for(String v : myList){
          System.out.println(v);
      }
System.out.println("==============================");      
      myList.forEach(v->System.out.println(v));
    }
    
}

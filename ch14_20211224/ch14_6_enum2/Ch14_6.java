/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20211224.ch14_6_enum2;

/**
 *
 * @author xvpow
 */
public class Ch14_6 {
    enum Animal{
        DOG("狗狗"),CAT("貓"),TIGER("虎");
        private int height;
        private String msg;
          Animal(){
              this.msg = "";
          }
        Animal(String msg){
            this.msg = msg;
        }
        public void printHeight(){
                System.out.println(height);
        }
        public void setHeight(int height){
            this.height = height;
        }      
        
        public String toString(){
            return msg+":"+super.toString()+":"+this.height;
        }
    }    
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println(Animal.DOG == Animal.DOG);
       System.out.println(Animal.DOG.getClass().getName());
       Animal a1 = Animal.valueOf("CAT");
       System.out.println(a1);
     //  Animal.valueOf("Bird");
       String name1 = Animal.TIGER.name();
       int ordinal = Animal.TIGER.ordinal();
       System.out.println(ordinal+":"+name1);
       
       Animal.DOG.setHeight(15);
       System.out.println(Animal.DOG);
    }
    
}

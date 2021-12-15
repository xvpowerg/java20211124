
package ch10_20211215.ch10_5_abstract1;

public  class Dog extends Animal {
      public Dog(String name,
              int age){
        super(name,age);
      }
      
     public void bark(){
         System.out.println(
                 "Dog Bark!");
     }
}

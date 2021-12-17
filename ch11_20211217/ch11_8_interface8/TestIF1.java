package ch11_20211217.ch11_8_interface8;
public interface TestIF1 {
   void func1();
   default void defFunc(){
       System.out.println("TestIF1 defFunc");
   }
   static void staticFunc(){
          System.out.println("TestIF1 staticFunc");
   }
   
}

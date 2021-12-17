package ch11_20211217.ch11_9_interface9;
public interface TestIF1 {
   void func1();
   default void defFunc(){
       System.out.println("TestIF1 defFunc");
   }
   static void staticFunc(){
          System.out.println("TestIF1 staticFunc");
   }
   
}

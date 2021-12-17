package ch11_20211217.ch11_9_interface9;
public interface TestIF2 extends TestIF1{
   default void defFunc(){
       System.out.println("TestIF2 defFunc");
   }   
   static void staticFunc(){
          System.out.println("TestIF2 staticFunc");
   }
}

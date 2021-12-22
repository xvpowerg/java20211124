package ch13_20211222.ch13_4_lambda1;

public class Ch13_4 {
    
    static void foreachStringArray(String[] array,Consumer consumer){        
        for(String v : array){
            consumer.accept(v);
        }
    }
    
    public static void main(String[] args) {
     //lambda 一定要FunctionalInterface才可使用
     foreachStringArray(new String[]{"A","B","C"},new Consumer(){
         public void accept(String v){
                System.out.println("value:"+v);
         }
     });
     System.out.println("========================");
          foreachStringArray(new String[]{"A","B","C"},
                  (s)->System.out.println("Lambda:"+s));
     
    }
    
}

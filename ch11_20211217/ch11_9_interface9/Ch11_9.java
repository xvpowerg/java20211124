package ch11_20211217.ch11_9_interface9;
public class Ch11_9 {
    public static void main(String[] args) {
       //default 會被繼承下來
       //default 方法也會複寫
       // staticFunc 不會被繼承下來
       // staticFunc 不會複寫
        TestIF1 tif1 = new TestObject();
        tif1.func1();
        tif1.defFunc();
        TestIF1.staticFunc();
        System.out.println("============================");
        TestIF2.staticFunc();
        
        TestIF3 tif3 = new TestObjec2();
        tif3.func1();//TestObjec2 func1
        tif3.defFunc();//TestIF2 defFunc
    }
    
}

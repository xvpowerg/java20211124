/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220114.ch23_6_io5_auto_close3;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       try(TestClose t1 = new TestClose("Test1",true);
//            TestClose t2 = new TestClose("Test2",false)){
//                System.out.println("Body!!");
//            }catch(IOException ex){
//                System.out.println(ex);
//            }

//  try(TestClose t1 = new TestClose("Test1",true);
//            TestClose t2 = new TestClose("Test2",true)){
//                System.out.println("Body!!");
//            }catch(IOException ex){
//                System.out.println(ex);
//            }

// 例外的最外層 是第一個 拋出的例外
  try(TestClose t1 = new TestClose("Test1",true);
            TestClose t2 = new TestClose("Test2",true)){
                System.out.println("Body!!");
              throw new IOException("Body Exception");  
            }catch(IOException ex){
                //把Suppressed的例外 取出
               Throwable[] ths =  ex.getSuppressed();
               for (Throwable th : ths){
                   System.out.println(th);
               }
                System.out.println(ex);
            }



    }
    
}
